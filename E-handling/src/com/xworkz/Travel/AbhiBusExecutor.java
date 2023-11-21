package com.xworkz.Travel;

import Agency.TravelAgency;
import Bus.AbhiBus;
import Bus.VRLImpl.VRLImpl;
import Bus.srsImpl.SrsImpl;

public class AbhiBusExecutor {
    public static void main(String[] args) {
        AbhiBus abhiBus=new SrsImpl();
        TravelAgency agency=new TravelAgency(abhiBus);
        agency.bookingTickets(30);

    }
}
