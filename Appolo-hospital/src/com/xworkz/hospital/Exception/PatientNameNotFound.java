package com.xworkz.hospital.Exception;

public class PatientNameNotFound extends  Exception{

    public PatientNameNotFound(String errorMessage){
        System.out.println(errorMessage
        );
    }
}
