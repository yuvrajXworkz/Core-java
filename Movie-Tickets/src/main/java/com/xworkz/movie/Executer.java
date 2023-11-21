package com.xworkz.movie;

import com.xworkz.movie.singleTon.EntityMangerFactorySingleton;

import javax.persistence.EntityManagerFactory;

public class Executer {
    public static void main(String[] args) {

        EntityManagerFactory entityManagerFactory= EntityMangerFactorySingleton.getFactory();
        System.out.println(entityManagerFactory);
    }
}
