package com.Xworkz.collection.Arraylist;

import java.util.*;


public class SetClass {

    public static void main(String[] args) {
        Set<String> movies=new LinkedHashSet<>();
        //set allows only one null value.
        //set not allows the duplicate value.
        //set not  preserve the order of insertion.

        movies.add("om");
        movies.add("A");
        movies.add("kgf");
        movies.add(null);


        System.out.println(movies);



        Queue<String> movies1=new PriorityQueue<>();

        //queue not accept the null value.

        movies1.add("om");
        movies1.add("A");
        movies1.add("kgf");
        // movies1.add(null);


        System.out.println(movies1);
    }
}
