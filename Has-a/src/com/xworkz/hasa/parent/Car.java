package com.xworkz.hasa.parent;


import com.xworkz.hasa.child.Benz;

//parent
public class Car {

    public  String companyName;
    public  String companyLocation;

    public  String companyState;


    public void carDetailes(String companyLocation, String companyName) {
        System.out.println("parent class naditha ede");
              this.companyLocation =companyLocation;
              this.companyName =companyName;
        System.out.println("company location is :"+ companyLocation +""+ "company name is :" +companyName);


    }
    public void carDetiles(String companyName)
    {
        System.out.println("Parent class naditha ede");

        this.companyName=companyName;

System.out.println("company name is: "+companyName);
    }



}
