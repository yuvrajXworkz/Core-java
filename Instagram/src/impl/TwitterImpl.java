package impl;

import com.xworkz.instagram.Twitter.ProfileDto;
import com.xworkz.instagram.Twitter.Twitter;

import java.sql.*;
import java.util.Collections;

public class TwitterImpl implements Twitter {
    @Override
    public boolean addProfileDto(ProfileDto dto) {
        Connection con=null;
        PreparedStatement ps=null;
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/instagram", "root", "Xworkz@123");
             ps= con.prepareStatement("insert into instaprofile values(?,?,?,?,? )");

              ps.setInt(1,dto.getId());
              ps.setString(2,dto.getName());
              ps.setLong(3,dto.getPhoneNumber());
              ps.setString(4,dto.getAddress());
              ps.setString(5,dto.getPassword());

              ps.executeUpdate();

        }catch (SQLException sql)
        {
            sql.printStackTrace();
        }
       return false;
    }

    @Override
    public ProfileDto getprofileByname(String name) {

        Connection con = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        ProfileDto dto = new ProfileDto();

        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/instagram", "root", "Xworkz@123");
            stmt = con.prepareStatement("select from instaprofile where name ?");
            stmt.setString(1, name);

            stmt.executeUpdate();

            rs = stmt.executeQuery();

            while (rs.next()) {

                dto.setId(rs.getInt(1));
                dto.setName(rs.getString(2));

            }


        } catch (SQLException e) {
            e.printStackTrace();
        }

        return dto;
    }

    @Override
    public boolean updateprofileIdByname(int id, String name) {
        Connection con=null;
        PreparedStatement stmt=null;
        ResultSet rs=null;
        try {
            con=DriverManager.getConnection("");
            stmt=con.prepareStatement("");
            stmt.setInt(1,id);
            stmt.setString(2,name);
            stmt.executeUpdate();

        }catch (SQLException e){
            e.printStackTrace();
        }

       return false;
    }
}
