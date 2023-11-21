package Agency;

import Bus.AbhiBus;

public class TravelAgency {
    public AbhiBus abhiBus;

    public TravelAgency(AbhiBus abhiBus)

    {
        this.abhiBus = abhiBus;
    }

    public boolean bookingTickets(int noOfTickets) {
        System.out.println("inside bookingTickets");
        boolean isBookingDone = false;
        if (abhiBus != null) {
            boolean isConditoinGood = this.abhiBus.goodCondition();

            if (isConditoinGood ==true) {
                System.out.println("condition is good book now");


                if (noOfTickets <= this.abhiBus.minBooking()) {
                    System.out.println("ticket booking is done");
                    System.out.println("tickets "+noOfTickets);
                }else {
                    System.out.println("tickets not available ");


            }
            }else {
                System.out.println("condition is not good");

        }
        }
        System.out.println("vrl bus is not available");

        return isBookingDone;
    }
}


