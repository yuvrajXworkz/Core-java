package com.xworkz.instagram;

import java.util.List;

public interface Instagram {

    public boolean addUserDto(UserDTO user);


    public List<UserDTO> getAllUserDTO();

    boolean addDataExcelToSql();
    boolean  addDataSqlToExcel();

    public  UserDTO getUserByPhno(long userPhno);

    public  UserDTO getuserphnoByAddress(String address);

    public  boolean updateUserPhnoBYID(long phno,int id);

    public  boolean updateEmailPhnoBYPhno(String email,long phno);

}
