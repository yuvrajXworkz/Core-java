package com.xworkz.hospital.Exception;

public class PatientageNotFoundException extends Exception{

    public PatientageNotFoundException(String errorMessage){
        System.out.println(errorMessage);
    }
}
