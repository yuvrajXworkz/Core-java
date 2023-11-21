package com.xworkz.shop.Entitymanager;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EnitymanagerFactorySingleton {

    private  static EntityManagerFactory factory=null;

    public  static EntityManagerFactory getFactory()
    {
        return  factory;
    }
    static {
        factory= Persistence.createEntityManagerFactory("com.xworkz");
    }
}
