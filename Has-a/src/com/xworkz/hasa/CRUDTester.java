package com.xworkz.hasa;

public class CRUDTester {

    public static void main(String[] args) {

        CRUD crud=new CRUD();
        crud.save("KGF");
        crud.save("rathavara");
        crud.save("Ugram");


        crud.display();


        crud.read("KF");




    }


}
