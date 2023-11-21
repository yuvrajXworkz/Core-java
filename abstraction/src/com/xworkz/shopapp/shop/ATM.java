package com.xworkz.shopapp.shop;

public class ATM implements Bank{
    int balance=5000;
    @Override
    public void deposit(int amount) {
        System.out.println("deposit amount is "+amount);
        balance=balance+amount;
        System.out.println("amount deposit successFully");

    }

    @Override
    public void withDraw(int amount) {
        System.out.println("withDraw amount is "+amount);
        balance=balance-amount;
        System.out.println("amount withDraw successFully");

    }

    @Override
    public void cheackBalance() {
        System.out.println("available balance:"+balance);

    }
}
