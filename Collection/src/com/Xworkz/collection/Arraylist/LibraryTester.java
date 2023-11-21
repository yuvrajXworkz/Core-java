package com.Xworkz.collection.Arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class LibraryTester {



    public static void main(String[] args) {
        List<LibraryDto> library=new ArrayList<LibraryDto>();
        library.add(new LibraryDto("beloved",200.00,300,2000,"toni",1,BookType.drama,"aa"));
        library.add(new LibraryDto("romeo juliet",300.00,200,2006,"sheaksphere",2,BookType.love,"bb"));
        library.add(new LibraryDto("shreeramayana",300.00,500,1968,"kuvempu",4,BookType.novel,"cc"));
        library.add(new LibraryDto("nakuthanti",500.00,400,1973,"darabendre",5,BookType.novel,"dd"));
        library.add(new LibraryDto("salt the weather",250.00,300,2020,"condice",3,BookType.novel,"ee"));

        System.out.println(library.stream().sorted().collect(Collectors.toList()));
        System.out.println(library.stream().sorted(Comparator.comparing(LibraryDto::getPublisher)).findFirst());
       /* Collections.sort(library);

        for(LibraryDto lib:library){
            System.out.println(lib);
        }*/

    }
}
