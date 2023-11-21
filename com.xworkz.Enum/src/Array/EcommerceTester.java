package Array;

import java.sql.SQLOutput;
import java.util.Scanner;

public class EcommerceTester {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the customers size");
        int size= sc.nextInt();

        Ecommerce ecom=new Ecommerce(size);
        for(int index=0;index<ecom.customers.length;index++) {

            Customers cust = new Customers();

            System.out.println("customers name");
            cust.setCustomersName(sc.next());
            System.out.println("customers address");
            cust.setCustomersAddress(sc.next());
            System.out.println("customers gender");
            cust.setGender(Gender.valueOf(sc.next()));
            System.out.println("customers bloodGroup");
            cust.setBloodgroup(BloodGroup.valueOf(sc.next()));


            ecom.addCustomers(cust);
        }
        String userInput=null;
        do {
            System.out.println("press 1:to get customer name by customer name");
            System.out.println("press 2:to get customer id by bloodGroup");
            System.out.println("press 3:customer gender by customer id");
            System.out.println("to get customer address by customer name");









            int option=sc.nextInt();
            switch (option) {

                case 1:
                ecom.getAllCustomers();
                break;
                case 2:
                System.out.println("enter the customer id to get customer name");
                String name = ecom.getCustomersNameByCustomerId(sc.nextInt());
                System.out.println("customer name is " + name);
                break;
                case 3:
                System.out.println("enter the bloodGroup to get customer id");
                int Id = ecom.getCustomersIdByBloodGroup(sc.next());
                System.out.println("customer name " + Id);
                break;
                case 4:
                System.out.println("enter the customerId to get customer gender");
                Gender gender = ecom.getCustomersGenderByCustomersId(sc.nextInt());
                System.out.println("customer gender " + gender);
                break;
                case 5:
                System.out.println("enter the customer name to get customer address");
                String address = ecom.getCustomersAddressByCustomersName(sc.next());
                System.out.println("customer address " + address);
                break;
                case 6:
                System.out.println("enter the customer id to update customer name");
                String updatedName = sc.next();
                System.out.println("enter the update name");
                int existingId = sc.nextInt();
                boolean isUpdatedName = ecom.updatedCustomerNameByCustomerID(updatedName, existingId);
                System.out.println("enter the updated name " + isUpdatedName);
                ecom.getAllCustomers();
                break;
                case 7:
                System.out.println("enter the blood group to update customer id ");
                int updateId = sc.nextInt();
                System.out.println("enter the updated id");
                BloodGroup existingbloodgroup = BloodGroup.valueOf(sc.next());
                boolean isUpdatedId = ecom.updateCustomerIdByBloodGroup(updateId, existingbloodgroup);
                System.out.println("enter the updated id " + isUpdatedId);
            }
            System.out.println("yes/no");
            userInput=sc.next();

        } while (userInput.equals("yes"));
        System.out.println("if yes to be continued");
    }
}
