package com.xworkz.movie.singleTon;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EntityMangerFactorySingleton {
    private  static EntityManagerFactory factory=null;

    public  static EntityManagerFactory getFactory(){
        return  factory;
    }
    static {
        factory= Persistence.createEntityManagerFactory("com.xworkz");
    }
}
