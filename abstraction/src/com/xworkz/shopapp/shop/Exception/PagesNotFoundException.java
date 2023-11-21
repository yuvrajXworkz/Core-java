package com.xworkz.shopapp.shop.Exception;

public class PagesNotFoundException extends RuntimeException{
    public  PagesNotFoundException(String error){
        System.out.println(error);
    }
}
