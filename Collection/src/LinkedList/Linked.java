package LinkedList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Linked {
    public static void main(String[] args) {
        LinkedList movies = new LinkedList<>();


        movies.addLast("om");
        movies.addFirst("A");
        movies.add("kanthra");
        System.out.println(movies);



        List<Integer> a=new ArrayList<>();
        a.add(1);
        a.add(10);
        a.add(5);
        a.add(2);
        a.add(30);
        Collections.sort(a);
        System.out.println(a);
    }
}

