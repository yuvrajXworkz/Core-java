package com.xworkz.instagram.Twitter;

public interface Twitter {

    public  boolean addProfileDto(ProfileDto dto);

    public  ProfileDto getprofileByname(String name);
    public  boolean updateprofileIdByname(int id,String name);

    }

