package com.xworkz.ottapp.ott;

public class AxisBankAccount {
    private  double balance;
    private double amount;

    public AxisBankAccount(){

    }
public AxisBankAccount( double balance){
        this.balance=balance;
}

public void credit( double amount){
        if(amount>0){
            this.balance=balance+amount;
        }
        System.out.println("amount is greater than zero");
}

public void debit( double amount){
        if(amount>=0){
            this.balance=balance-amount;
        }
        System.out.println("insufficient amount");

}
public void transfer( double amount,AxisBankAccount userAccount){
    userAccount.credit(amount);
    if(amount>=0){
    this.debit(amount);
    }
       System.out.println("balance of user Account");

}

public double getBalance(){
        return balance;

}

public void setBalance(double balance)
{
        this.balance=balance;
}












}
