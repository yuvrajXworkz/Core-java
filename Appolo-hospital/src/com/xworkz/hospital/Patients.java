package com.xworkz.hospital;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Patients {



    private  int patientID;
    private  String patientName;
    private  Gender Gender;
    private  BloodGroup BloodGroup;
    private  int age;
    private String attenderName;
    private  String address;

}
