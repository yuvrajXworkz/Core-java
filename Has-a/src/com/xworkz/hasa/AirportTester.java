package com.xworkz.hasa;

public class AirportTester {

    public static void main(String[] args) {

        Airport  air=new Airport();
air.setTerminalFee(5500);
        Terminal terminal= new Terminal();
terminal.setTerminalID(1);
terminal.setName("KGA");
terminal.setPlace("bng");
        
air.allow(terminal);
    
    }








}
