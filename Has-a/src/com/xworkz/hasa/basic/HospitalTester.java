package com.xworkz.hasa.basic;

import com.xworkz.hasa.Exception.PatientAttenderNotFound;

import java.sql.SQLOutput;
import java.util.Scanner;

public class HospitalTester {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the patient");
        int size = sc.nextInt();


        Hospital hospital = new Hospital(size);
        for (int index = 0; index < hospital.patients.length; index++) {


            Patients patient = new Patients();

            System.out.println("Enter the patient name");
            patient.setPatientName(sc.next());
            System.out.println("Enter the patient gender");
            patient.setGender(Gender.valueOf(sc.next()));
            System.out.println("Enter the patient bloodgroup");
            patient.setBloodGroup(BloodGroup.valueOf(sc.next()));
            System.out.println("Enter the patient age");
            patient.setAge(sc.nextInt());
            System.out.println("Enter the attender name");
            patient.setAttenderName(sc.next());

            hospital.addPatients(patient);
        }
        hospital.getAllPatients();
    /*    System.out.println("enter the patient id to get patient attender");
        String attenderName = hospital.getPatientsAttenderNameByPatientId(sc.nextInt());
        System.out.println("the attender name is " + attenderName);


        System.out.println("enter the patient name to get patient gender");
        Gender gender = hospital.getPatientsGenderByPatientName(sc.next());
        System.out.println("the gender name is " + gender);

        System.out.println("enter the patient id to get the patient age ");
        int age=hospital.getPatientAgeByPatientId(sc.nextInt());
        System.out.println("the age is "+age);


        System.out.println("enter the patient name to get patient bloodgroup");
        BloodGroup bloodGroup=hospital.getPatientBloodGroupByPatientName(sc.next());
        System.out.println("the patient name is "+ bloodGroup);

        System.out.println("enter the patient name to get patient name");
        String PatientName=hospital.getPatientAddressByPatientName(sc.next());
        System.out.println("the patient name is "+PatientName);



*/
     /*  System.out.println("enter the patients id to update the patient gender");
        int existingPatientId = sc.nextInt();
        System.out.println("enter the patients updated gender");
        Gender updatedgender= Gender.valueOf(sc.next());
        boolean isGenderUpdated = hospital.updatePatientGenderByPatientId(updatedgender,existingPatientId);
        hospital.getAllPatients();

        System.out.println("enter the patient id to update patients age");
        int existingId = sc.nextInt();
        System.out.println("enter the updated patient age");
        int updateAge=sc.nextInt();
        boolean age=hospital.updatePatientAgeByPatientId(updateAge, existingId);
        hospital.getAllPatients();


        System.out.println("enter the patient id to delete name");
        int patientId=sc.nextInt();
        boolean name=hospital.deletePatientByPatientId(patientId);
*/

        String userInput=null;
        do {
            System.out.println("press 1.To get all patients info");
            System.out.println("press 2.To get all patients name");
            System.out.println("press 3:to get patient gender name by patient name");
            System.out.println(" press 4:to get patient age by patient id");
            System.out.println("press 5:to get patient blood group by patient name ");
            System.out.println("press 6:to get patient address by patient name");
            System.out.println("press 7:to update gender by patient id");
            System.out.println("press 8:to update patient age by patient id");
            System.out.println("press 9:to get patient attender name by patient id");

            int options= sc.nextInt();
            switch (options){
                case 1:hospital.getAllPatients();
                break;
                case 2:System.out.println("enter the patient id to get patient attender");
                try {
                    String attenderName = hospital.getPatientsAttenderNameByPatientId(sc.nextInt());
                    System.out.println("the attender name is " + attenderName);
                }catch (PatientAttenderNotFound p){
                    p.printStackTrace();
                }
                    break;

                case 3: System.out.println("enter the patient name to get patient gender");
                    Gender gender = hospital.getPatientsGenderByPatientName(sc.next());
                    System.out.println("the gender name is " + gender);
                    break;

                case 4: System.out.println("enter the patient id to get the patient age ");
                    int age=hospital.getPatientAgeByPatientId(sc.nextInt());
                    System.out.println("the age is "+age);
                    break;
                case 5:System.out.println("enter the patient name to get patient bloodgroup");
                    BloodGroup bloodGroup=hospital.getPatientBloodGroupByPatientName(sc.next());
                    System.out.println("the patient name is "+ bloodGroup);
                    break;
                case 6:System.out.println("enter the patient name to get patient name");
                    String PatientName=hospital.getPatientAddressByPatientName(sc.next());
                    System.out.println("the patient name is "+PatientName);
                    break;
                case 7: System.out.println("enter the patients id to update the patient gender");
                    int existingPatientId = sc.nextInt();
                    System.out.println("enter the patients updated gender");
                    Gender updatedgender= Gender.valueOf(sc.next());
                    boolean isGenderUpdated = hospital.updatePatientGenderByPatientId(updatedgender,existingPatientId);
                   break;
                case 8:   System.out.println("enter the patient id to update patients age");
                    int existingId = sc.nextInt();
                    System.out.println("enter the updated patient age");
                    int updateAge=sc.nextInt();
                    boolean isAgeUpdated =hospital.updatePatientAgeByPatientId(updateAge, existingId);
                  break;
                case 9:  System.out.println("enter the patient id to delete name");
                    int patientId=sc.nextInt();
                    boolean name=hospital.deletePatientByPatientId(patientId);

            }
            
            System.out.println("enter the yes/no");
            userInput=sc.next();

        }while(userInput.equals("yes"));
        System.out.println("Thank you visit again");
    }
}