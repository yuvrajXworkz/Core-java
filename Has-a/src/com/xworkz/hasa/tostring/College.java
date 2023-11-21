package com.xworkz.hasa.tostring;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class College {

    private  String name;
    private  int fee;
    private String place;

    public String toString(){

        return "college-{collegeName="+ this.name+" ,collegeFee="+ this.fee+" ,collegePlace="+ this.place+"}";
    }


}
