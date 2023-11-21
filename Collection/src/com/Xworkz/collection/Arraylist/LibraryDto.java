package com.Xworkz.collection.Arraylist;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
@AllArgsConstructor

public class LibraryDto implements Comparable<LibraryDto> {



    private String bookName;
    private Double bookPrice;
    private int noOfPages;
    private int publishedYear;
    private String authorName;
    private int booksID;
    private BookType type;
    private String publisher;

    public String toString(){

        return "LibraryDto-(Bookname="+ this.bookName+",price="+ this.bookPrice+",noOfpages="+ this.noOfPages+",publishyear="+ this.publishedYear+",authorName="+this.authorName+",id="+ this.booksID+",type="+ this.type+")";
    }


    @Override
    public int compareTo(LibraryDto o) {
        return this.booksID-o.booksID;
    }
}