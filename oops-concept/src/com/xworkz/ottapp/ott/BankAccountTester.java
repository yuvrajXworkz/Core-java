package com.xworkz.ottapp.ott;

public class BankAccountTester {
    public  static void main(String[]args){
        BankAccount myAccount=new SavingAccount();
        myAccount.credit(3000);
        System.out.println("balance of my account:"+" "+myAccount.getBalance());

        myAccount.debit(1000);
        System.out.println("total debit amount:"+" "+myAccount.getBalance());

BankAccount BankAccountbenificiaryAccount=new SavingAccount();
        myAccount.transfer(500,BankAccountbenificiaryAccount);
        System.out.println("total transfer amount:"+" "+myAccount.getBalance());
        System.out.println("balance on my account:"+myAccount.getBalance());

    //  SavingAccount SavingAccount=new SavingAccount();
     // savingAccount.credit(1000);

      //  savingAccount.getRateOfInterest();
      //  System.out.println("balanace of my account");

    }

}
