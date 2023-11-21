package com.xworkz.instagram.Twitter;

import impl.TwitterImpl;

import java.util.Scanner;

public class TwitterTester {
    public static void main(String[] args) {
        Twitter twit=new TwitterImpl();
        Scanner sc=new Scanner(System.in);



                ProfileDto dto = new ProfileDto();

                System.out.println("enter the id");
                dto.setId(sc.nextInt());

                System.out.println("enter the name");
                dto.setName(sc.next());

                System.out.println("enter the ph no");
                dto.setPhoneNumber(sc.nextLong());

                System.out.println("enter the address");
                dto.setAddress(sc.next());

                System.out.println("enter the password");
                dto.setPassword(sc.next());

                twit.addProfileDto(dto);

                    System.out.println("enter id here");









    }
}
