package com.Xworkz.collection.Arraylist;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class SetTester {
    public static void main(String[] args) {

        Map<Integer,String>map=new HashMap<>();
        System.out.println("put");
        System.out.println(map.put(1,"yuvraj"));
        System.out.println(map.put(1,"yuvraj"));

       // System.out.println("map");
        System.out.println(map.get(1));

        Map<AddPatient,Integer>map1=new HashMap<>();
       map1.put(new AddPatient(25,"rahul","rrnagar",2,"harsha",Gender.MALE,BloodGroup.BPOS),1);
       map1.put(new AddPatient(26,"uday","rajajinagar",3,"uday",Gender.MALE,BloodGroup.ANEG),2);
       map1.put(new AddPatient(27,"kiran","krpuram",4,"manoj",Gender.MALE,BloodGroup.BPOS),3);
       map1.put(new AddPatient(29,"praveen","magadi",5,"venky",Gender.MALE,BloodGroup.APOS),4);



        Set<Map.Entry<AddPatient,Integer>>set= map1.entrySet();


        //iterator
        //purpose-fetch the data from map.

        Iterator<Map.Entry<AddPatient,Integer>>itr= set.iterator();
        while (itr.hasNext()){
            Map.Entry<AddPatient,Integer>entryset=itr.next();
            System.out.println(entryset.getKey()+" "+entryset.getValue());
        }



        System.out.println("java 8");
        set.stream().forEach(System.out::println);



        for (Map.Entry<AddPatient,Integer> entryset: set){
            System.out.println(entryset.getKey()+"  "+entryset.getValue());


            Map<Integer,LibraryDto>map2=new HashMap<>();
            map2.put(1,new LibraryDto("beloved",200.00,300,2000,"toni",1,BookType.drama,"aa"));
            map2.put(2,new LibraryDto("romeo juliet",300.00,200,2006,"sheaksphere",2,BookType.love,"bb"));

            Set<Map.Entry<Integer,LibraryDto>>set1=map2.entrySet();

            for (Map.Entry<Integer,LibraryDto>entryset1:set1){
                System.out.println(entryset1.getKey()+" "+entryset1.getValue());




            }

        }



    }
}
