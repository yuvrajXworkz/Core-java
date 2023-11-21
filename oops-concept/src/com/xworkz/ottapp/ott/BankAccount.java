package com.xworkz.ottapp.ott;

public class BankAccount {
    private double balance;
private double amount;
    public  BankAccount(){

    }
public BankAccount(double balance){

      this.balance=balance;
}

public void credit(double amount){
        if(amount>0){
            this.balance=balance+amount;}
        System.out.println("amount is greater than zero");
}


public void debit(double amount){
        if(amount>=0){
            this.balance=balance-amount;
        System.out.println("insufficient balance");}
}
public void transfer(double amount,BankAccount benificiaryAccount){
    benificiaryAccount.credit(amount);
    if(amount>=0){
       this.debit (amount);}

}
public double getBalance()
{
     return balance;
}












}

