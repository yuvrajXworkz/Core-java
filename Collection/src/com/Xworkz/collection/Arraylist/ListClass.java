package com.Xworkz.collection.Arraylist;

import java.util.ArrayList;
import java.util.List;

public class ListClass {
    public static void main(String[] args) {

        List<String> movies=new ArrayList();
        //list allow duplicate value
        //list allows the null value
        //list preserve the order of insertion.



        movies.add("om");
        movies.add("A");
        movies.add("kanthra");
        movies.add(null);
        movies.add(null);
        movies.add(null);




        List<String>movies1=new ArrayList();

        movies1.add("om");
        movies1.add("kanthra");
        movies1.add("kgf");
//        movies1.add(null);
//        movies1.add(null);


//        movies1.add(null);

        movies1.retainAll(movies);
        System.out.println("the movies name "+movies);
        System.out.println("the movies name "+movies1);

       // movies.addAll(movies1);

      /*  System.out.println(movies.contains("kgf2"));
        System.out.println(movies.containsAll(movies1));

        System.out.println(movies.size());

       System.out.println( movies.remove("om"));
       // System.out.println( movies.removeAll(movies1));

        //movies1.clear();



        boolean retained=movies.retainAll(movies1);
        System.out.println(retained);


        System.out.println(movies);*/









    }
}
