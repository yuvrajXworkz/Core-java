package com.xworkz.hasa.tostring;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter

public class Student {

    private String name;
    private  int age;

    public  String toString(){

        return "Student{studentName="+ this.name+",studentAge="+ this.age+" }   ";



    }

}
