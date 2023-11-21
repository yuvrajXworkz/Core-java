package com.xworkz.hospital.Exception;

public class PatientAgeNotUpdatedException extends RuntimeException{

    public  PatientAgeNotUpdatedException(String error)
    {
        System.out.println(error);
    }

}

