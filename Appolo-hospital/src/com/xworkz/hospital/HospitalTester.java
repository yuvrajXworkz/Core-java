package com.xworkz.hospital;

import com.xworkz.hospital.Exception.*;

import java.util.Scanner;

public class HospitalTester {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the patient");
        int size = sc.nextInt();


        Hospital hospital = new ApolloHospitalImpl();
        ApolloHospitalImpl apollo=new ApolloHospitalImpl();

      for (int index = 0; index < size; index++) {

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
            System.out.println("press 2:to get patient attender name by patient id");
            System.out.println("press 3:to get patient gender name by patient name");
            System.out.println(" press 4:to get patient age by patient id");
            System.out.println("press 5:to get patient blood group by patient name ");
            System.out.println("press 6:to get patient address by patient name");
            System.out.println("press 7:to update gender by patient id");
            System.out.println("press 8:to update patient age by patient id");
            System.out.println("press 10:to update patientAge by patient name");

            int options= sc.nextInt();
            switch (options)
            {
                case 1:hospital.getAllPatients();
                    break;
                case 2:System.out.println("enter the patient id to get patient attender");
                try {
                    String attenderName = hospital.getPatientsAttenderNameByPatientId(sc.nextInt());
                    System.out.println("the attender name is " + attenderName);
                }catch (PatientIdNotFoundException p){
                    p.printStackTrace();
                }

                    break;

                case 3: System.out.println("enter the patient name to get patient gender");
                try {
                    Gender gender = hospital.getPatientsGenderByPatientName(sc.next());
                    System.out.println("the gender name is " + gender);
                }catch (PatientNameNotFound p){
                    p.printStackTrace();
                }
                    break;

                case 4: System.out.println("enter the patient id to get the patient age ");
                try {
                    int age = hospital.getPatientAgeByPatientId(sc.nextInt());
                    System.out.println("the age is " + age);
                }catch (PatientageNotFoundException p){
                    p.printStackTrace();
                }
                    break;
                case 5:System.out.println("enter the patient name to get patient bloodgroup");
                try {
                    BloodGroup bloodGroup = hospital.getPatientBloodGroupByPatientName(sc.next());
                    System.out.println("the patient name is " + bloodGroup);
                }catch (PatientNameNotFound p){
                    p.printStackTrace();
                }
                    break;
                case 6:System.out.println("enter the patient name to get patient address");
                try {
                    String PatientName = hospital.getPatientAddressByPatientName(sc.next());
                    System.out.println("the patient name is " + PatientName);
                }catch (AddressNotFoundException a){
                    a.printStackTrace();
                }
                    break;
                case 7: System.out.println("enter the patients id to update the patient gender");
                try {
                    int existingPatientId = sc.nextInt();
                    System.out.println("enter the patients updated gender");
                    Gender updatedgender = Gender.valueOf(sc.next());
                    boolean isGenderUpdated = hospital.updatePatientGenderByPatientId(updatedgender, existingPatientId);
                }catch (PatientGenderNotUpdateException p){
                    p.printStackTrace();
                }
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
                    break;
                case 10:
                    System.out.println("enter the patient name to update age");
                    try {
                        String existingPatientName = sc.next();
                        System.out.println("enter the updated age");
                        int updatedAge = sc.nextInt();
                        boolean isageUpdated = hospital.updatedPatientsAgeByPatientName(updatedAge, existingPatientName);
                    }catch (PatientAgeNotUpdatedException p) {
                        p.printStackTrace();
                    }

            }
            System.out.println("enter the yes/no");
            userInput=sc.next();

        }while(userInput.equals("yes"));
        System.out.println("Thank you visit again");
    }
}

