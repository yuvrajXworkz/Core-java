package com.xworkz.hasa.basic;

import com.xworkz.hasa.Exception.PatientAttenderNotFound;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Hospital {

     public Patients []patients ;
    int index;
    int id;



    public  Hospital(int size)

            
    {
        patients=new  Patients[size];
    }
    public  boolean addPatients(Patients patient){
        boolean isAdded=false;
        if(patient != null){
            patient.setPatientID(++id);
            this.patients[index++]=patient;

            isAdded=true;
        }
        else{
            System.out.println("patient is null");
        }
        return  isAdded;
    }

    public  boolean updatedPatientsAgeByPatientName(int updatedAge,String existingPatientName){
        boolean isAgeUpdated=false;
        for(int index=0;index<patients.length;index++){
            if(patients[index].getPatientName().equals( existingPatientName)){
                patients[index].setAge(updatedAge);
                isAgeUpdated=true;
            }
        }
        return  isAgeUpdated;
    }

    public boolean updatePatientsAttenderNameByPatientId( String updatedName ,int existingPatientId){
        boolean isUpdatedName=false;
        for(int index=0;index<patients.length;index++){
            if(patients[index].getPatientID()==existingPatientId){
                patients[index].setAttenderName(updatedName);
                isUpdatedName=true;
            }
        }
        return isUpdatedName;
    }


    public  boolean updatePatientGenderByPatientId(Gender updatedgender,int existingPatientId){
        boolean isUpdatedGender=false;
        for (int index=0;index<patients.length;index++){
            if(patients[index].getGender().equals(existingPatientId)){
                patients[index].setGender(updatedgender);
                isUpdatedGender=true;
            }
        }
        return isUpdatedGender;
    }

    public boolean updatePatientAgeByPatientId(int updateAge,int existingPatientId){
        boolean isUpdatedAge=false;
        for(int index=0;index<patients.length;index++){
            if(patients[index].getPatientID()==existingPatientId){
                patients[index].setAge(updateAge);
                isUpdatedAge=true;
            }
        }
        return isUpdatedAge;
    }

    public  boolean deletePatientByPatientId(int patientId){
        boolean ispatientDelete=false;
        Patients newPatients[]=new Patients[patients.length-1];
        int oldIndex,newIndex;
        for(oldIndex=0, newIndex=0 ; oldIndex < patients.length  ; oldIndex++){
            if(!(patients[oldIndex].getPatientID()==patientId)){
               newPatients[newIndex++]=this.patients[oldIndex];
               ispatientDelete=true;
            }
        }
        patients= Arrays.copyOf(patients,newIndex);
        System.out.println(Arrays.toString(newPatients));
        return ispatientDelete;
    }

    public  void getAllPatients(){
        for(int patientindex=0;patientindex<patients.length;patientindex++){
            System.out.println(patients[patientindex]);

        }

    }

public  String getPatientsAttenderNameByPatientId(int patientId){
     String attenderName=null;
     for(int index=0;index<patients.length;index++){
         if(patients[index].getPatientID()==patientId){
             attenderName=patients[index].getAttenderName();
         }
     }
     if(attenderName==null){
         throw  new PatientAttenderNotFound("attender name not found "+patientId);
     }
        return attenderName;
}

 public  Gender getPatientsGenderByPatientName(String name){
        Gender gender=null;
        for(int index=0;index<patients.length;index++){
            if(patients[index].getPatientName().equals(name)){
               gender=patients[index].getGender();
            }
    }
return gender;
    }

public  int getPatientAgeByPatientId( int patientId){
        int age=0;
        for(int index=0;index<patients.length;index++){
            if(patients[index].getPatientID()==patientId){
                age=patients[index].getAge();
            }
        }
        return age;
}


public  BloodGroup getPatientBloodGroupByPatientName( String PatientName){
        BloodGroup bloodGroup=null;
        for(int index=0;index<patients.length;index++){
            if(patients[index].getPatientName()==PatientName){
                bloodGroup=patients[index].getBloodGroup();
            }
        }
return bloodGroup;
    }

public  String getPatientAddressByPatientName(String PatientName){
        String Address=null;
        for(int index=0;index<patients.length;index++){
            if(patients[index].getPatientName()==PatientName){
                Address=patients[index].getAttenderName();
            }
        }
        return Address;
}




}


