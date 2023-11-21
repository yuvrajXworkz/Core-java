package Bus.VRLImpl;

import Bus.AbhiBus;

public class VRLImpl implements AbhiBus {

    public int minBooking() {
        return 20;
    }

    @Override
    public boolean goodCondition()
    {
        return true;
    }

    public String betterCondition() {
        return null;
    }

}
