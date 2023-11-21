package com.xworkz.instagram;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString

public class UserDTO {
    private int id;
    private  String name;
    private String address;
    private long phoneNumber;
    private  String password;
    private String email;
}
