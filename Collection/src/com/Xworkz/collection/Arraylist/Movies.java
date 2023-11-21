package com.Xworkz.collection.Arraylist;

import java.util.*;

public class Movies {
    public static void main(String[] args) {
//<>- symbol called Genaric.
        Collection<String> moviesName=new ArrayList(10);



        moviesName.add("A");
        moviesName.add("om");
        moviesName.add("jawan");
        moviesName.add("SSE");
        moviesName.add("jailer");
        moviesName.add("jogi");
        moviesName.add("uppi");
        moviesName.add("kgf2");

        System.out.println(moviesName.size());
        for(String MovieName:moviesName){
            System.out.println(MovieName);
        }


        Collection<String> moviesName1=new TreeSet();

        moviesName1.add("A");
        moviesName1.add("om");
        moviesName1.add("kgf");
        moviesName1.add("jogi");
        moviesName1.add("charlee");
        moviesName1.add("jawan");
        moviesName1.add("jogi");

        System.out.println(moviesName1);//print horizently.

        for(String Movie:moviesName1){
            System.out.println(Movie);//print line by line;
        }





        }

    }

