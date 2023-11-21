package com.xworkz.instagram;

import impl.InstagramImpl;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.FormulaEvaluator;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InstaTester {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        Instagram insta=new InstagramImpl();

        UserDTO dto=new UserDTO();

        System.out.println("enter the user id");
        dto.setId(scanner.nextInt());

        System.out.println("enter the user name");
        dto.setName(scanner.next());

        System.out.println("enter the user address");
        dto.setAddress(scanner.next());

        System.out.println("enter the user phone no");
        dto.setPhoneNumber(scanner.nextLong());

        System.out.println("enter the user password");
        dto.setPassword(scanner.next());

       insta.addUserDto(dto);


       List<UserDTO>lis=new ArrayList<>();

        System.out.println("enter id to get user ");
        UserDTO userDTO=insta.getUserByPhno(scanner.nextInt());
        System.out.println(userDTO);

        System.out.println("enter address to get user ph no");
        UserDTO userDTO1=insta.getuserphnoByAddress(scanner.next());
        System.out.println(userDTO1);

        System.out.println("enter id to update user ph no");


        System.out.println("the data is added sql to excel");
        boolean isDataAddedtoExcel = insta.addDataSqlToExcel();
        System.out.println(isDataAddedtoExcel);


        System.out.println("the data is added excel to sql");
        boolean isDataAddedtoSql = insta.addDataExcelToSql();
        System.out.println(isDataAddedtoSql);





    }
}
