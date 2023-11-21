package com.xworkz.hasa.child;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Highway {

    TollGate tollGate;
    private int tollGatefee;

    public Highway() {

    }

    public boolean allow(TollGate tollGate) {
        boolean isAllow = false;
        if (tollGatefee > 100) {
            System.out.println("tollgate fee is paid");
        }
        if (tollGate != null) {
            this.tollGate = tollGate;
            this.tollGate.displayDetails();

            isAllow = true;
        } else {
            System.out.println("tollgate fee is  not paid");
        }

return isAllow;
    }
}