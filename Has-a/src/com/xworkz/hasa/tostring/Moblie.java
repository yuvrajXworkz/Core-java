package com.xworkz.hasa.tostring;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class
Moblie {

    private  String name;
    private  int price;
    private  String colour;


    public  String toString(){


        return  "Mobile -{ mobileName="+ this.name+",mobilePrice="+ this.price+",mobileColour="+ this.colour+"}";

    }

}
