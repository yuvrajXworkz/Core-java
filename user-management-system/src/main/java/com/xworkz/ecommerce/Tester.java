package com.xworkz.ecommerce;

import com.xworkz.ecommerce.dto.CartItemDto;
import com.xworkz.ecommerce.dto.UserDto;
import com.xworkz.ecommerce.repository.UserCartRepository;
import com.xworkz.ecommerce.repository.UserCartRepositoryImpl;
import com.xworkz.ecommerce.service.UserCartService;
import com.xworkz.ecommerce.service.UserCartServiceImpl;

import java.util.Date;
import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int size=scanner.nextInt();

        UserDto userDto=new UserDto();
        System.out.println("enter the user  name");
        userDto.setUserName(scanner.next());

        System.out.println("enter first name");
        userDto.setFirstname(scanner.next());

        System.out.println("enter teh last name");
        userDto.setLastName(scanner.next());

        System.out.println("enter teh password");
        userDto.setPassword(scanner.next());

        System.out.println("enter the phone no");
        userDto.setPhone(scanner.nextLong());

        System.out.println("enter date ");
        userDto.setCreatedAt(new Date());

        System.out.println("enter modify date");

        userDto.setModifiedAt(new Date());

        CartItemDto cartItemDto=new CartItemDto();

        System.out.println("enter cart id");
        cartItemDto.setCartItemId(scanner.nextInt());

        System.out.println("enter product id");
        cartItemDto.setProductid(scanner.nextInt());

        System.out.println("enter quantity");
        cartItemDto.setQuantity(scanner.nextInt());

        System.out.println("enter date");
        cartItemDto.setCreatedAt(new Date());

        System.out.println("enter date");
        cartItemDto.setModifiedAt(new Date());


        userDto.setCartItemDto(cartItemDto);

//cartItemDto.setUserDto(userDto);

        UserCartService userCartService =new UserCartServiceImpl();
       userCartService.validateAndSave(userDto);

    }
}
