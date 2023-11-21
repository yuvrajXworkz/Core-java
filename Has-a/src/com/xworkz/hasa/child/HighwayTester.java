package com.xworkz.hasa.child;

import com.xworkz.hasa.Terminal;

public class HighwayTester {
    public static void main(String[] args) {
        Highway highway=new Highway();
        highway.setTollGatefee(150);

        TollGate toll=new TollGate();
        toll.setName("mysore");
        toll.setFee(200);
        toll.setNoOfVehicle(20);

        highway.allow(toll);



    }
}
