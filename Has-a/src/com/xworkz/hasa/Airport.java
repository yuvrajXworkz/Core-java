package com.xworkz.hasa;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor


public class Airport {


    Terminal terminal;
    private int terminalFee;

public  Airport() {
}

public boolean allow(Terminal terminal){

    boolean isAllow =false;
    if(terminalFee>5000){
        System.out.println("ticket fee is paid");

    }
    if(terminal!=null){
        this.terminal=terminal;
        this.terminal.displayDetails();
        isAllow =true;
    }
    else{
        System.out.println("fee is not paid");
    }


    return isAllow;

}



}
