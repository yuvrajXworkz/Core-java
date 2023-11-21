package com.xworkz.hospital;

import com.xworkz.hospital.Exception.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ApolloHospitalImpl implements Hospital {
   // public Patients []patients ;
    List<Patients>patients=new ArrayList();
    int index;
    int id;


    public ApolloHospitalImpl(){

    }


    /*public ApolloHospitalImpl(int size)

    {
        patients=new  Patients[size];
    }*/



    @Override
    public boolean addPatients(Patients patient) {
        boolean isAdded=false;
        if(patient != null){
            patient.setPatientID(++id);
           // this.patients[index++]=patient;
            this.patients.add(patient);

            isAdded=true;
        }
        else{
            System.out.println("patient is null");
        }
        return  isAdded;
    }

    @Override
    public void getAllPatients() {
        //for(int patientindex=0;patientindex< patients.length;patientindex++){
          //  System.out.println(patients[patientindex]);
            Iterator<Patients>itr =patients.iterator();
        }


    @Override
    public boolean updatedPatientsAgeByPatientName(int updatedAge, String existingPatientName) {
        boolean isAgeUpdated=false;
        //for(int index=0;index<patients.length;index++){
        Iterator<Patients>itr =patients.iterator();
            if(patients.get(index).getPatientName().equals( existingPatientName)){
                patients.get(index).setAge(updatedAge);
                isAgeUpdated=true;
            }

        if(isAgeUpdated==false){
            throw  new PatientAgeNotUpdatedException("patient age notr updated "+existingPatientName);
        }
        return  isAgeUpdated;
    }

    @Override
    public boolean updatePatientsAttenderNameByPatientId(String updatedName, int existingPatientId){
        boolean isUpdatedName=false;
//        for(int index=0;index<patients.length;index++){
//            if(patients[index].getPatientID()==existingPatientId){
//                patients[index].setAttenderName(updatedName);
//                isUpdatedName=true;
//            }
//        }
        for (Patients pat2:patients) {
            if(patients.get(index).getPatientID()==existingPatientId) {

                patients.get(index).setAttenderName(updatedName);
               isUpdatedName=true;
            }
        }


        return isUpdatedName;
    }

    @Override
    public boolean updatePatientGenderByPatientId(Gender updatedgender, int existingPatientId)throws PatientGenderNotUpdateException {
        boolean isUpdatedGender=false;
        //for (int index=0;index<patients.length;index++){
        for (Patients pat:patients) {
            if(patients.get(index).getGender().equals(existingPatientId)){
                patients.get(index).setGender(updatedgender);
                isUpdatedGender=true;
            }


        }
//            if(patients[index].getGender().equals(existingPatientId)){
//                patients[index].setGender(updatedgender);
//            }
//
        if(isUpdatedGender){
            throw  new PatientGenderNotUpdateException("gender not update here "+existingPatientId);
        }
        return isUpdatedGender;
    }

    @Override
    public boolean updatePatientAgeByPatientId(int updateAge, int existingPatientId) {
        boolean isUpdatedAge=false;
//        for(int index=0;index<patients.length;index++){
//            if(patients[index].getPatientID()==existingPatientId){
//                patients[index].setAge(updateAge);
//                isUpdatedAge=true;
//            }
//        }
        for (Patients pat3:patients) {
            if(patients.get(index).getPatientID()==existingPatientId) {
                patients.get(index).setAge(updateAge);
                isUpdatedAge = true;
            }

        }
        return isUpdatedAge;
    }

    @Override
    public boolean deletePatientByPatientId(int patientId) {
       /* boolean ispatientDelete=false;
        Patients newPatients[]=new Patients[patients.length-1];
        int oldIndex,newIndex;
        for(oldIndex=0, newIndex=0 ; oldIndex <patients.length  ; oldIndex++){
            if(!(patients[oldIndex].getPatientID()==patientId)){
                newPatients[newIndex++]=this.patients[oldIndex];
                ispatientDelete=true;
            }
        }
        patients= Arrays.copyOf(patients,newIndex);
        System.out.println(Arrays.toString(newPatients));
        return ispatientDelete;*/
        boolean isDeleted=false;
        for (Patients pat:patients) {
            if (pat.getPatientID()==patientId){
                patients.remove(pat);
                isDeleted=true;
                break;
            }

        }
        return isDeleted;


    }

    @Override
    public String getPatientsAttenderNameByPatientId(int patientId) {
        String attenderName=null;
//        for(int index=0;index<patients.length;index++){
//            if(patients[index].getPatientID()==patientId){
//                attenderName=patients[index].getAttenderName();
//            }
//        }
        try {
            for (Patients pat4 : patients) {
                if (pat4.getPatientID() == patientId) {
                    attenderName = pat4.getAttenderName();
                }

            }

            if (attenderName == null) {
                PatientIdNotFoundException patientIdNotFoundException = new PatientIdNotFoundException("patient id not found");
                throw patientIdNotFoundException;

            }
        }catch (Exception e){

        }

        return attenderName;

    }

    @Override
    public BloodGroup getPatientBloodGroupByPatientName(String PatientName) throws PatientNameNotFound{
        BloodGroup bloodGroup=null;
//       for(int index=0;index<patients.length;index++){
//            if(patients[index].getPatientName()==PatientName){
//             bloodGroup=patients[index].getBloodGroup();
//          }
//       }
        try {

            for (Patients pat5 : patients) {
                if (pat5.getPatientName() == PatientName) {
                    bloodGroup = pat5.getBloodGroup();
                }

            }

            if (bloodGroup == null) {
                PatientNameNotFound patientNameNotFound = new PatientNameNotFound("patient name not found");
                throw patientNameNotFound;

            }
        }catch (Exception e){

        }
        return bloodGroup;
    }

    @Override
    public Gender getPatientsGenderByPatientName(String name) throws PatientNameNotFound {
        Gender gender=null;
//        for(int index=0;index<patients.length;index++){
//            if(patients[index].getPatientName().equals(name)){
//                gender=patients[index].getGender();
//            }
//        }
        try {
            for (Patients pat1 : patients) {
                if (pat1.getPatientName() == name) {
                    gender = pat1.getGender();
                }

            }

            if (gender == null) {
                PatientNameNotFound patientNameNotFound = new PatientNameNotFound("patient name not found");
                throw patientNameNotFound;
            }
        }catch (Exception e){

        }
        return gender;
    }

    @Override
    public int getPatientAgeByPatientId(int patientId) throws PatientageNotFoundException{
        int age=0;
//        for(int index=0;index<patients.length;index++){
//            if(patients[index].getPatientID()==patientId){
//                age=patients[index].getAge();
//            }
//        }
        try {
            for (Patients pat : patients) {
                if (pat.getPatientID() == patientId) {
                    age = pat.getAge();
                }

            }

            if (age == 0) {
                throw new PatientageNotFoundException("no age found here " + patientId);
            }
        }catch (Exception e){

        }
        return age;
    }

    @Override
    public String getPatientAddressByPatientName(String PatientName)throws AddressNotFoundException {
        String Address=null;
//        for(int index=0;index<patients.length;index++){
//            if(patients[index].getPatientName()==PatientName){
//                Address=patients[index].getAttenderName();
//            }
//        }
        try {
            for (Patients pat2 : patients) {
                if (pat2.getAddress() == Address) {
                    PatientName = pat2.getAddress();
                }

            }

            if (Address == null) {
                throw new AddressNotFoundException("no address found here " + PatientName);
            }
        }catch (Exception e){


        }
        return Address;
    }
}
