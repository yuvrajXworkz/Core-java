package com.xworkz.shopapp.shop;

import com.xworkz.shopapp.shop.Exception.BookNameNotFoundException;

public interface Library {

    public  boolean addDetails(Books book);
    public  boolean updateBooksNameByBooksAuthor(String updateName,String existingAuthor);
    public  boolean updateNoOfPagesByBookName(int updatePages,String existingBookName);
    public  boolean updateBookPriceByBookName(double updatePrice,String existingName);
    public boolean updateBookIDByBookAuthor(int UpdateBookID,String existingAuthorName);
    public  void getAllBooks();
    public String getBookNameByBookAuthor(String BookAuthor)throws BookNameNotFoundException;
    public Books[] getBookByYearOfPublishing(int yearOfPublishing);
    public Books[] getBookByAuthorName(String authorName);
    public  String[]  getBookNameByYearOfPublisher(int yearOfPublisher);
    public  int  getNoOfPagesByBookName(String BookName);
    public double getBookPriceByBookName(String bookName)throws BookNameNotFoundException;
    public int getBookIDByBookAuthor(String AuthorName);
    public  String getBookNameByPublisher(String publisher)throws BookNameNotFoundException;
    public  Books getBookById(int Id);
    public boolean deleteBookById(int id);







}
