package com.xworkz.ottapp.ott;

public class AxisBankAccountTester {
    public static void  main(String[]args){
        AxisBankAccount myAccount=new CurrentAccount();


        myAccount.credit(1000);
        System.out.println("total credit amount "+" "+myAccount.getBalance());

        myAccount.debit(500);
        System.out.println("total debit amount "+" "+myAccount.getBalance());

        AxisBankAccount userAccount=new CurrentAccount();
        myAccount.transfer(300,userAccount);
        System.out.println("total transfer amount "+" "+myAccount.getBalance());
        System.out.println("total balance of my account "+myAccount.getBalance());


    }

}

