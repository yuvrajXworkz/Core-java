package com.xworkz.hasa.child;


import com.xworkz.hasa.parent.Car;

//child
public class Benz extends Car {

    @Override

    public void carDetiles(String companyName)
    {

        System.out.println("Child class naditha ede");
        super.carDetiles(companyName);

    }

}



