package com.xworkz.shopapp.shop;

import Impl.RamamandirLibrary;
import com.xworkz.shopapp.shop.Exception.BookIdNotFoundException;
import com.xworkz.shopapp.shop.Exception.BookNameNotFoundException;
import com.xworkz.shopapp.shop.Exception.PagesNotFoundException;

import java.util.Arrays;
import java.util.Scanner;

public class LibraryTester {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the size");
        int Size = scanner.nextInt();

        Library library = new RamamandirLibrary(Size);
        RamamandirLibrary ramamandirLibrary = new RamamandirLibrary(Size);

        for (int index = 0; index < ramamandirLibrary.books.length; index++) {
            Books books = new Books();

            System.out.println("book name is");
            books.setBookName(scanner.next());
            System.out.println("bookAuthor name is");
            books.setAuthorName(scanner.next());
            System.out.println("no of pages");
            books.setNoOfPages(scanner.nextInt());
            System.out.println("published year");
            books.setPublishedYear(scanner.nextInt());
            System.out.println("book type");
            books.setType(BookType.valueOf(scanner.next()));
            System.out.println("book price");
            books.setBookPrice(scanner.nextDouble());
            System.out.println("book publisher");
            books.setPublisher(scanner.next());

            library.addDetails(books);
        }
        String userInput = null;
        do {
            System.out.println("press 1: to get all book details");
            System.out.println("press 2 : to get bookName by author name");
            System.out.println("press 3:to get book enter the year of publishing");
            System.out.println("press 4 :to get no of pages  by book name");
            System.out.println("press 5:to get book price by book name");
            System.out.println("press 6:to get book id by  book author");
            System.out.println("press 7:to get book name by publisher");
            System.out.println("press 8:to get book by id");
            System.out.println("press 9:to update no of pages by book name");
            System.out.println("press 10:to update book name by book author");
            System.out.println("press 11:to update book price by book name");
            System.out.println("press 12:to update book id by author ");
            System.out.println("press 13:delete book by id");
            System.out.println("press 14:to get book name by year of publish");


            int option = scanner.nextInt();
            switch (option) {

                case 1:
                    library.getAllBooks();
                    break;
                case 2:
                    System.out.println("enter the author name to get book name");
                    try {
                        String booksName = library.getBookNameByBookAuthor(scanner.next());
                        System.out.println("book name is " + booksName);
                    }catch (BookNameNotFoundException b){
                        b.printStackTrace();
                    }
                    break;
                case 3:
                    System.out.println("enter the year of publishing to get book");
                    Books[] sameYearBook=library.getBookByYearOfPublishing(scanner.nextInt());
                    System.out.println("**********");
                    for(Books books:sameYearBook){
                        System.out.println(books.toString());
                    }
                    break;
                case 4:
                    System.out.println("enter the bookName to get no of pages");
                    try {
                        int NoOfPages = library.getNoOfPagesByBookName(scanner.next());
                        System.out.println("no of pages is " + NoOfPages);
                    }catch (PagesNotFoundException p){
                        p.printStackTrace();
                    }
                    break;
                case 5:

                    System.out.println("enter the bookname to get book price");
                    try {
                        double bookPrice = library.getBookPriceByBookName(scanner.next());
                        System.out.println("enter book price " + bookPrice);
                    }catch (BookNameNotFoundException b){
                        b.printStackTrace();

                    }
                    break;
                case 6:

                    System.out.println("enter book author to get book id");
                    try {
                        int BookId = library.getBookIDByBookAuthor(scanner.next());
                        System.out.println("enter book id " + BookId);
                    }catch (BookIdNotFoundException b){
                        b.printStackTrace();
                    }
                    break;
                case 7:

                    System.out.println("enter the publisher name to get book name");
                    try {
                        String BookName = library.getBookNameByPublisher(scanner.next());
                        System.out.println("book name is " + BookName);
                    }catch (BookNameNotFoundException b){
                        b.printStackTrace();
                    }
                    break;
                case 8:

                    System.out.println("enter the id to get book");
                    Books Book = library.getBookById(scanner.nextInt());
                    System.out.println("enter the book " + Book);
                    break;
                case 9:

                    System.out.println("enter the bookname to update no of pages");
                    String existingBookName = scanner.next();
                    System.out.println("enter the update pages ");
                    int updatePages = scanner.nextInt();
                    boolean isUpdatedPages = library.updateNoOfPagesByBookName(updatePages, existingBookName);
                    System.out.println("no of pages is " + updatePages);
                    library.getAllBooks();
                    break;
                case 10:


                    System.out.println("enter the author name to update book name");
                    String existingAuthor = scanner.next();
                    System.out.println("enter the update name");
                    String updateName = scanner.next();
                    boolean isUpdatedName = library.updateBooksNameByBooksAuthor(updateName, existingAuthor);
                    System.out.println("update book name is " + isUpdatedName);
                    library.getAllBooks();
                    break;
                case 11:

                    System.out.println("enter the book name to update book price");
                    String existingName = scanner.next();
                    System.out.println("enter the update price");
                    double updatePrice = scanner.nextInt();
                    boolean isUpdatedPrice = library.updateBookPriceByBookName(updatePrice, existingName);
                    System.out.println("update price is " + updatePrice);
                    library.getAllBooks();
                    break;
                case 12:

                    System.out.println("enter the book author to update bookId");
                    String existingAuthorName = scanner.next();
                    System.out.println("enter update book id");
                    int UpdateBookID = scanner.nextInt();
                    boolean isUpdatedBookId = library.updateBookIDByBookAuthor(UpdateBookID, existingAuthorName);
                    System.out.println("update id " + UpdateBookID);
                    library.getAllBooks();
                    break;
                case 13:
                    System.out.println("enter the book id to delete book");
                    int id=scanner.nextInt();
                    boolean isdeleteBook=library.deleteBookById(id);
                    break;
                case 14:
                    System.out.println("enter the year of publish to get book name");
                    String[] bookNames=library.getBookNameByYearOfPublisher(scanner.nextInt());
                    System.out.println("book names are:" + Arrays.toString(bookNames));
                    break;
                case 15:
                    System.out.println("enter the author  name get book name ");
                    Books[] book=library.getBookByAuthorName(scanner.next());
                    System.out.println("book name is "+book);
                    break;
                case 16:
                default:
                    System.out.println("plz enter the valid option");
                    break;

            }

            System.out.println("enter yes/no to further continue");
            userInput = scanner.next();
        }while (userInput.equals("yes"));
        System.out.println("thank you for using.....");
    }
}