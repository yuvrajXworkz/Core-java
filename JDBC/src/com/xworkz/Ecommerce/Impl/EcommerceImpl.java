package com.xworkz.Ecommerce.Impl;

import com.xworkz.Ecommerce.CustomerDTO;
import com.xworkz.Ecommerce.EcommerceAmazon;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class EcommerceImpl implements EcommerceAmazon {
    @Override
    public boolean addCustomer(CustomerDTO dto) {
        //JDBC Steps - 5
        //step 1=load and rigister the driver.
        //step 2=establish the connection with database server.
        //step 3=creat a statement/platform.
        //step 4=execute the  sql quarries/statements.
        //step 5=close the costly resources.



        Connection con=null;
        Statement stat = null;
        try {
            //Class.forName("com.mysql.cj.jdbc.Driver");  this step is avoided
             con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcecommerce", "root", "Xworkz@123");
            //domain:application://host:port number/search separator,user,password
            stat = con.createStatement();
            int noOfRowsAffected=stat.executeUpdate("INSERT INTO customer values(1,'Rakshith','raksh@gmail.com','Raksh27','9110886582');");
            int noOfRowsAffected1=stat.executeUpdate("INSERT INTO customer values(2,'Prabhakar','pbk@gmail.com','Prab19','8431330277');");
            int noOfRowsAffected2=stat.executeUpdate("INSERT INTO customer values(3,'Mahantesh','mantu@gmail.com','Man24','9148142338');");
            System.out.println(noOfRowsAffected);
            System.out.println(noOfRowsAffected1);
            System.out.println(noOfRowsAffected2);
            return true;
        } catch ( SQLException e) {
            e.printStackTrace();
        }
        return false;


    }
}
