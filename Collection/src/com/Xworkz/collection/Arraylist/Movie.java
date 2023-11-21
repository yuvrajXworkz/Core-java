package com.Xworkz.collection.Arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Movie {

    public static void main(String[] args) {
        List<String> movies=new ArrayList();
        movies.add("om");
        movies.add("om");
        movies.add("kgf");
        movies.add(null);
        movies.add(null);

       ArrayList<String>  mylist= new ArrayList<>();
       if(mylist.isEmpty()){
           System.out.println("arraylist is empty");
       }else {
           System.out.println("arraylist is not empty");
       }

        System.out.println("movies name is"+movies);


        LinkedList<String> movies2=new LinkedList<>();

        movies2.addFirst("kgf");
        movies2.addLast("om");
        movies2.add("ugram");
        movies2.addLast("om");
        movies2.add("ugram");


        System.out.println(movies2);

        List<Integer>a=new ArrayList<>();
        a.add(5);
        a.add(4);
        a.add(7);
        a.add(3);
        Collections.sort(a);
        System.out.println(a);

    }
}
