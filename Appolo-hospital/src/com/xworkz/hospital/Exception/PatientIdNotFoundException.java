package com.xworkz.hospital.Exception;

public class PatientIdNotFoundException extends  RuntimeException{

    public  PatientIdNotFoundException(String errorMessage){
        System.out.println(errorMessage);
    }



}
