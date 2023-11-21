package Bus.srsImpl;

import Bus.AbhiBus;

public class SrsImpl implements AbhiBus {
    @Override
    public int minBooking() {
        return 30;
    }

    @Override
    public boolean goodCondition()
    {
        return true ;
    }
}
