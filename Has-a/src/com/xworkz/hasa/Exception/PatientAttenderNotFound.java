package com.xworkz.hasa.Exception;

public class PatientAttenderNotFound extends RuntimeException{
    public PatientAttenderNotFound(String error){
        System.out.println(error);
    }
}
