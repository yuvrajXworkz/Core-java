package com.xworkz.instagram.Twitter;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class ProfileDto {
    private  int id;
    private  String name;
    private  Long phoneNumber;
    private String address;
    private String password;
}
