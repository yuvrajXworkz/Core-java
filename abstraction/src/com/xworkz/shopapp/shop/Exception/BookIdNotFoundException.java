package com.xworkz.shopapp.shop.Exception;

public class BookIdNotFoundException extends RuntimeException{
    public BookIdNotFoundException(String error){
        System.out.println(error);
    }

}
