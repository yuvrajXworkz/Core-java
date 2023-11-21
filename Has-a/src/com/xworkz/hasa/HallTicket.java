package com.xworkz.hasa;

import lombok.Getter;
import lombok.Setter;
import org.omg.CORBA.WStringSeqHelper;
@Getter
@Setter

public class HallTicket {

private  String StudentName;
private  String usn;
private  String subjectCode;
private String subjectName;


public void displayDetails(){
    System.out.println("the student name is "+StudentName);
    System.out.println("the usn "+usn);
    System.out.println("the subjectCode "+subjectCode);
    System.out.println("the subjectName is "+subjectName);



}






}



