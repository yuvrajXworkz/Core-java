package com.Xworkz.collection.Arraylist;


import comparator.PatientAddressComparator;
import comparator.PatientAgeComparator;
import comparator.PatientNameComparator;

import java.util.*;
import java.util.stream.Collectors;


public class PatientTester {


    public static void main(String[] args) {

        List<AddPatient> patient= new ArrayList<>();

        patient.add(new AddPatient(25,"rahul","rrnagar",2,"harsha",Gender.MALE,BloodGroup.BPOS));
       patient.add(new AddPatient(26,"uday","rajajinagar",3,"uday",Gender.MALE,BloodGroup.ANEG));
        patient.add(new AddPatient(27,"kiran","krpuram",4,"manoj",Gender.MALE,BloodGroup.BPOS));
        patient.add(new AddPatient(29,"praveen","magadi",5,"venky",Gender.MALE,BloodGroup.APOS));
        patient.add(new AddPatient(30,"pavan","jpnagar",6,"vijay",Gender.MALE,BloodGroup.BPOS));
        patient.add(new AddPatient(24,"karthik","vijaynagar",7,"manju",Gender.MALE,BloodGroup.APOS));
        System.out.println("process patient data useing for each");
       /* for (AddPatient add:patient){
            patient.add(new AddPatient(27,"kiran","kr
            puram",4,"manoj",Gender.MALE,BloodGroup.BPOS));
            System.out.println(patient);

        }*/

        Iterator<AddPatient>itr= patient.iterator();
        while (itr.hasNext()){
            AddPatient patient2=itr.next();
            System.out.println(patient2);
        }
        patient.add(new AddPatient(27,"kiran","krpuram",4,"manoj",Gender.MALE,BloodGroup.BPOS));
        itr=patient.iterator();
        while (itr.hasNext()){
            AddPatient patient1=itr.next();
            System.out.println(patient1);
        }


        
       // System.out.println( patient.stream().sorted().collect(Collectors.toList()));
       // System.out.println(patient.stream().sorted(Comparator.comparing(AddPatient::getAge)).findFirst());

      /*  Collections.sort(patient);
        for(AddPatient pat:patient){
            System.out.println(pat);
        }
        Collections.sort(patient,new PatientNameComparator());
        for(AddPatient pat:patient){
            System.out.println(pat);
        }
        Collections.sort(patient,new PatientAddressComparator());
        for(AddPatient pat:patient){
            System.out.println(pat);
        }
        Collections.sort(patient,new PatientAgeComparator());
        for(AddPatient pat:patient){
            System.out.println(pat);
        }

        for(AddPatient pat:patient){
            System.out.println(pat);
        }


*/
    }
}

