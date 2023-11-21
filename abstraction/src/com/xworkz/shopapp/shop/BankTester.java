package com.xworkz.shopapp.shop;

public class BankTester {
    public static void main(String[] args) {
        Bank atm=new ATM();
        atm.cheackBalance();

        atm.deposit(2000);
        atm.cheackBalance();

        atm.withDraw(3500);
        atm.cheackBalance();


    }
}
