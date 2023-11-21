package com.Xworkz.collection.Arraylist;

import java.util.LinkedHashSet;
import java.util.Set;

public class Film {
    public static void main(String[] args) {
        Set<String>films=new LinkedHashSet<>();
        films.add("A");
        films.add("A");
        films.add(null);
        films.add(null);


        System.out.println("film name is"+films);



    }
}
