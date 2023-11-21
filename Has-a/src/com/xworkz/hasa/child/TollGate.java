package com.xworkz.hasa.child;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TollGate {

    private  String name;
    private int Fee;
    private  int noOfVehicle;

    public void displayDetails(){
        System.out.println("the tollgate name "+name);
        System.out.println("tollgate fee is "+Fee);
        System.out.println("no of vehicle is "+noOfVehicle);


    }
}
