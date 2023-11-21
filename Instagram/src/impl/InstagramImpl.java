package impl;

import com.xworkz.instagram.Instagram;
import com.xworkz.instagram.UserDTO;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.*;
import java.sql.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class InstagramImpl implements Instagram {
    @Override
    public boolean addUserDto(UserDTO user) {
        Connection con = null;
        PreparedStatement stmt = null;
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/instagram", "root", "Xworkz@123");
            stmt = con.prepareStatement("insert into instaprofile values(?,?,?,?,?)");


            stmt.setInt(1, user.getId());
            stmt.setString(2, user.getName());
            stmt.setString(3, user.getAddress());
            stmt.setLong(4, user.getPhoneNumber());
            stmt.setString(5, user.getPassword());

            stmt.executeUpdate();

            con.setAutoCommit(false);
            con.commit();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            con.rollback();
        } catch (SQLException e) {

        }

        return false;
    }

    @Override
    public List<UserDTO> getAllUserDTO() {
        Connection con = null;
        PreparedStatement stmt = null;
        List<UserDTO> list = new ArrayList<>();
        ResultSet rs = null;


        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/instagram", "root", "Xworkz@123");
            stmt = con.prepareStatement("select * from instaprofile");
            rs = stmt.executeQuery();

            while (rs.next()) {
                UserDTO dto = new UserDTO();
                dto.setId(rs.getInt(1));
                dto.setName(rs.getString(2));
                dto.setAddress(rs.getString(3));
                dto.setPhoneNumber(rs.getLong(4));
                dto.setPassword(rs.getString(5));

                list.add(dto);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return list;

    }

    public boolean addDataSqlToExcel() {
        boolean isDataAddedSqlTOExcel=false;
        Connection con = null;
        PreparedStatement psmt = null;
        ResultSet rs = null;
        try {
            con =DriverManager.getConnection("jdbc:mysql://localhost:3306/instagram","root","Xworkz@123");
            psmt = con.prepareStatement("select * from user_info");
            rs = psmt.executeQuery();
            XSSFWorkbook workbook = new XSSFWorkbook();
            XSSFSheet sheet = workbook.createSheet("userDetails");
            int rownum = 0;

            while (rs.next()) {
                Row row = ((XSSFSheet) sheet).createRow(rownum++);
                Cell cell0 = row.createCell(0);
                Cell cell1= row.createCell(1);
                Cell cell2 = row.createCell(2);
                Cell cell3 = row.createCell(3);
                Cell cell4= row.createCell(4);

                cell0.setCellValue(rs.getInt(1));
                cell1.setCellValue(rs.getString(2));
                cell2.setCellValue(rs.getString(3));
                cell3.setCellValue(rs.getLong(4));
                cell4.setCellValue(rs.getString(5));

            }
            try {

                // Writing the workbook
                FileOutputStream out = new FileOutputStream(new File("C:\\Users\\yuvraj\\OneDrive\\Desktop\\user.xls"));
                workbook.write(out);
                // Closing file output connections
                out.close();
                // Console message for successful execution of program
                System.out.println("user.xls written successfully on disk.");
                isDataAddedSqlTOExcel=true;
            }
            catch (Exception e) {

                e.printStackTrace();
            }


        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return isDataAddedSqlTOExcel;
    }
    @Override
    public boolean addDataExcelToSql() {
        boolean isDataAddedExcelToSql=false;
        Connection con =null;
        Statement stm = null;
        PreparedStatement psmt = null;

        try {
            // Reading file from local directory
            FileInputStream file = new FileInputStream(new File("C:\\Users\\yuvraj\\OneDrive\\Desktop\\user.xls"));
            // Create Workbook instance holding reference to
            // .xlsx file
            XSSFWorkbook workbook = new XSSFWorkbook(file);

            // Get first/desired sheet from the workbook
            XSSFSheet sheet = workbook.getSheetAt(0);

            // Iterate through each rows one by one
            Iterator<Row> rowIterator = sheet.iterator();

            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/","root","Xworkz@123");
            con.setAutoCommit(false);
            stm=con.createStatement();
            String sql = " create table user_details " +
                    "(user_id INTEGER not NULL AUTO_INCREMENT ," +
                    " user_name varchar(30),"+
                    "email varchar(50)," +
                    "ph_no BigInt,"+
                    "address varchar(30),"+
                    "primary key(user_id))";
            stm.executeUpdate(sql);
            System.out.println("the user table is created succesfully");

            psmt = con.prepareStatement("insert into user_details (user_name,email,ph_no,address) values(?,?,?,?)");

            rowIterator.next();
            
            while (rowIterator.hasNext()) {

                Row row = rowIterator.next();
                // For each row, iterate through all the columns
                Iterator<Cell> cellIterator = row.cellIterator();

                while (cellIterator.hasNext()) {

                    Cell cell = cellIterator.next();
                    int columnIndex = cell.getColumnIndex();

                    // Checking the cell type and format accordingly
                    switch (columnIndex) {
                        case 0:
                            break;
                        case 1:
                            String name = cell.getStringCellValue();
                            psmt.setString(1, name);
                            break;
                        case 2:
                            String email =cell.getStringCellValue();
                            psmt.setString(2, email);
                            break;

                        case 3:
                            long phNo = (long)cell.getNumericCellValue();
                            psmt.setLong(3, phNo);
                            break;
                        case 4:
                            String address =  cell.getStringCellValue();
                            psmt.setString(4, address);
                    }
                }
            }
            // Closing file output streams
            workbook.close();
            file.close();
            psmt.executeUpdate();
            con.commit();
            con.close();
            isDataAddedExcelToSql=true;
        } catch (IOException ex1) {
            System.out.println("Error reading file");
            ex1.printStackTrace();
        } catch (SQLException ex2) {
            System.out.println("Database error");
            ex2.printStackTrace();
        } catch (Exception e) {

            e.printStackTrace();
        }
        return isDataAddedExcelToSql;
}

                        @Override
    public UserDTO getUserByPhno(long userPhno) {

        UserDTO userDTO = new UserDTO();
        Connection con = null;
        PreparedStatement pre = null;
        List<UserDTO> list = new ArrayList();
        ResultSet rs = null;
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/instagram", "root", "Xworkz@123");
            pre = con.prepareStatement("select*from instaprofile where ph_no=?");
            pre.setLong(1, userPhno);

           rs= pre.executeQuery();

            while (rs.next()) {
                userDTO.setId(rs.getInt(1));
                userDTO.setName(rs.getString(2));
                userDTO.setAddress(rs.getString(3));
                userDTO.setPhoneNumber(rs.getLong(4));
                userDTO.setPassword(rs.getString(5));

                list.add(userDTO);
            }
        } catch (SQLException sql) {
            sql.printStackTrace();
        }
     return  userDTO ;
    }

    @Override
    public UserDTO getuserphnoByAddress(String address) {
        UserDTO userDTO=new UserDTO();
        Connection con=null;
        PreparedStatement ps=null;
        List<UserDTO>list=new ArrayList<>();
        ResultSet rs=null;
        try {
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/instagram","root","Xworkz@123");
           // ps=con.prepareStatement("select from table name where
            // cvvNumber like '3%' ");
            ps=con.prepareStatement("select from instaprofile  where ph no=? ");
            ps.setString(3,address);
            rs=ps.executeQuery();
            while (rs.next()){
                userDTO.setId(rs.getInt(1));
                userDTO.setName(rs.getString(2));
                userDTO.setAddress(rs.getString(3));
                userDTO.setPhoneNumber(rs.getLong(4));
                userDTO.setPassword(rs.getString(5));

                list.add(userDTO);
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
        return userDTO;
    }


    @Override
    public boolean updateUserPhnoBYID(long phno, int id) {
        Connection con=null;
        PreparedStatement ps=null;
        List<UserDTO>list=new ArrayList<>();
        ResultSet rs=null;
        try {
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/instagram","root","Xworkz@123");
            ps=con.prepareStatement("update instaprofile  set ph_no=? where id=?");
            ps.setLong(1,phno);
            ps.setInt(2,id);
            ps.executeUpdate();

            return true ;

        }catch (SQLException sql)
        {
            sql.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean updateEmailPhnoBYPhno(String email, long phno) {
        Connection con= null;
        PreparedStatement ps=null;
        List<UserDTO>list=new ArrayList();
        ResultSet rs=null;
        try {
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/instagram","root","Xworkz@123");
            ps=con.prepareStatement("update instaprofile set =email,where=phno");
            ps.setString(1,email);
            ps.setLong(2,phno);
            ps.executeUpdate();
            return true;
        }catch (SQLException e){
            e.printStackTrace();
        }
        return false;
    }
}

