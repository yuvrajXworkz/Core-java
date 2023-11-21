package com.xworkz.Travel;
//immutable-once we define a value cannot modify the content of an object;
//wrraper class-premitive data to corresponding of object data type.


public class Boxing {
    public static void main(String[] args) {
        int i;
        i=90;
        Integer age=new Integer(i);

        char a='a';
        Character ch1=new Character(a);

        boolean b=false;
        Boolean b1=new Boolean(b);


        double num=12.00;
       Double num1=new Double(num);

    }
}
