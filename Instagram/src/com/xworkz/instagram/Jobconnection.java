package com.xworkz.instagram;

import java.sql.*;

public class Jobconnection {

    public static Connection getDriverConnection(){
        Connection con=null;
        try {
            con= DriverManager.getConnection("jdbc:mysql://localhost:3306/instagram","root","Xworkz@123");
        }catch (SQLException e){
            e.printStackTrace();
        }
        return con;

    }

    public  static PreparedStatement getPrepareStatement(Connection con,String query){
        PreparedStatement pre=null;
        try {
            pre=con.prepareStatement(query);
        }catch (SQLException e){
            e.printStackTrace();
        }
        return  pre;
    }

    public  static  void closeCostlyResource(Connection con, PreparedStatement pre, ResultSet rs){
        if(rs!=null){
            try {
                rs.close();
            }catch (SQLException e){
                e.printStackTrace();
            }
        }
        if(pre!=null){
            try {
                pre.close();
            }catch (SQLException e){
                e.printStackTrace();
            }
        }
        if(con!=null){
            try {
                con.close();
            }catch (SQLException e){
                e.printStackTrace();
            }
        }


    }

}
