package com.xworkz.hasa;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Terminal {

private int TerminalID;
private String name;
private  String place;

public  void displayDetails(){
    System.out.println("terminal  no "+TerminalID);
    System.out.println("terminal name "+name);
    System.out.println("place "+place);


}


}
