package com.xworkz.hasa;

public class EngineeringTester {

    public static void main(String[] args) {
        Engineering eng = new Civil();
        eng.stream();

        Civil civil = (Civil) eng;
        civil.builders();

    }
}
