package Impl;

import com.xworkz.shopapp.shop.Books;
import com.xworkz.shopapp.shop.Exception.BookIdNotFoundException;
import com.xworkz.shopapp.shop.Exception.BookNameNotFoundException;
import com.xworkz.shopapp.shop.Exception.PagesNotFoundException;
import com.xworkz.shopapp.shop.Library;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Arrays;

@Getter
@Setter
@ToString

public class RamamandirLibrary implements Library {
    public Books[] books;
    int index;
    int id;

    public  RamamandirLibrary(int Size)

            
    {
        books = new Books[Size];
    }


    @Override
    public boolean addDetails(Books book) {
        boolean isAdded = false;
        if (books != null) {
            book.setBooksID(++id);
            this.books[index++] = book;
            isAdded = true;
        } else {
            System.out.println("books is null");

        }
        return isAdded;
    }

    @Override
    public boolean updateBooksNameByBooksAuthor(String updateName, String existingAuthor) {
        boolean isUpdatedName = false;
        for (int index = 0; index < books.length; index++) {
            if (books[index].getAuthorName() == existingAuthor) {
                books[index].setBookName(updateName);
                isUpdatedName = true;
            }
        }
        return isUpdatedName;
    }

    @Override
    public boolean updateNoOfPagesByBookName(int updatePages, String existingBookName) {

        boolean isUpdatedPages = false;
        for (int index = 0; index < books.length; index++) {
            if (books[index].getBookName() == existingBookName) {
                books[index].setNoOfPages(updatePages);
                isUpdatedPages = true;
            }
        }
        return isUpdatedPages;
    }

    @Override
    public boolean updateBookPriceByBookName(double updatePrice, String existingName) {
        boolean isUpdatedPrice = false;
        for (int index = 0; index < books.length; index++) {
            if (books[index].getBookName() == existingName) {
                books[index].setBookPrice(updatePrice);
                isUpdatedPrice = true;
            }
        }
        return isUpdatedPrice;
    }

    @Override
    public boolean updateBookIDByBookAuthor(int UpdateBookID, String existingAuthorName) {
        boolean isUpdatedBookId = false;
        for (int index = 0; index < books.length; index++) {
            if (books[index].getAuthorName() == existingAuthorName) {
                books[index].setBooksID(UpdateBookID);
                isUpdatedBookId = true;
            }
        }
        return isUpdatedBookId;
    }



    @Override
    public void getAllBooks() {
        for (int index = 0; index < books.length; index++) {
            System.out.println(books[index]);
        }


    }

    @Override
    public String getBookNameByBookAuthor(String BookAuthor)throws BookNameNotFoundException {
        String booksName = null;
        for (int index = 0; index < books.length; index++) {
            if (books[index].getAuthorName() == BookAuthor) {
                booksName = books[index].getBookName();
            }

        }
        if(booksName==null){
            throw new BookNameNotFoundException("book name not found "+BookAuthor);
        }
        return booksName;
    }

    @Override
    public Books[] getBookByYearOfPublishing(int yearOfPublishing) {
       Books[] sameYearWork=null;
       int newIndex=0;
       for(int oldIndex=0;oldIndex<books.length;oldIndex++){
           if(books[oldIndex].getPublishedYear()==yearOfPublishing){
               sameYearWork[newIndex++]=books[oldIndex];
           }
       }
       sameYearWork=new Books[newIndex];
       newIndex=0;
        for(int oldIndex=0;oldIndex<books.length;oldIndex++){
            sameYearWork[newIndex++]=books[oldIndex];
        }
       return sameYearWork;
    }

    @Override
    public Books[] getBookByAuthorName(String authorName) {
        Books[] Book = null;
        int newIndex = 0;
        for (int oldIndex = 0; oldIndex < books.length; oldIndex++) {
            if (books[oldIndex].getAuthorName() == authorName) {
                Book[newIndex++] = books[oldIndex];
            }
        }
        Book=new Books[newIndex];
        newIndex=0;
        for (int oldIndex = 0; oldIndex < books.length; oldIndex++){
            Book[newIndex++]=books[oldIndex];
        }
        return Book;
    }

    @Override
    public String[] getBookNameByYearOfPublisher(int yearOfPublisher) {
        String[] BookName=null;
        int newIndex=0;
        for(int index=0;index<books.length;index++) {
            if (books[index].getPublishedYear() == yearOfPublisher) {
                newIndex++;
            }
        }
            BookName=new String[newIndex];
            newIndex=0;
            for(int index=0;index<books.length;index++){
                if(books[index].getPublishedYear()==yearOfPublisher){
                    BookName[newIndex++]=this.books[index].getBookName();
                }
            }
        return BookName;
        }



    @Override
    public int getNoOfPagesByBookName(String BookName) {
        int NoOfPages = 0;
        for (int index = 0; index < books.length; index++) {
            if (books[index].getBookName() == BookName) {
                NoOfPages = books[index].getNoOfPages();
            }
        }
        if(NoOfPages==0){
            throw  new PagesNotFoundException("pages not found here "+BookName);
        }
        return NoOfPages;
    }

    @Override
    public double getBookPriceByBookName(String bookName)throws BookNameNotFoundException {
        double bookPrice = 0;
        for (int index = 0; index < books.length; index++) {
            if (books[index].getBookName() == bookName) {
                bookPrice = books[index].getBookPrice();
            }
        }
        if(bookName==null){
            BookNameNotFoundException bookNameNotFoundException=new BookNameNotFoundException("Bookname not found");
            throw bookNameNotFoundException;
        }
        return bookPrice;
    }

    @Override
    public int getBookIDByBookAuthor(String AuthorName) {
        int BookId = 0;
        for (int index = 0; index < books.length; index++) {
            if (books[index].getAuthorName() == AuthorName) {
                BookId = books[index].getBooksID();
            }
        }
        if(BookId==0){
            throw new BookIdNotFoundException("bookId not found "+AuthorName);
        }
        return BookId;
    }

    @Override
    public String getBookNameByPublisher(String publisher)throws BookNameNotFoundException {
        String BookName = null;
        for (int index = 0; index < books.length; index++) {
            if (books[index].getPublisher() == publisher) {
                BookName = books[index].getBookName();
            }
        }
        if(BookName==null){
            throw  new BookNameNotFoundException("Book nmae not found "+publisher);
        }
        return BookName;
    }

    @Override
    public Books getBookById(int Id) {
        Books Book =null;
        for( int index=0;index<books.length;index++){
            if(books[index].getBooksID()==Id){
                Book= books[index];
            }
        }
        return Book;
    }

    @Override
    public boolean deleteBookById(int id) {
        boolean isdeleteBook=false;
        Books newBooks[]=new Books[books.length-1];
        int oldIndex,newIndex;
        for(oldIndex=0,newIndex=0;oldIndex<books.length;oldIndex++){
            if(!(books[oldIndex].getBooksID()==id)){
                newBooks[newIndex++]=this.books[oldIndex];
                isdeleteBook=true;

            }
        }
        books= Arrays.copyOf(books,newIndex);
        System.out.println(Arrays.toString(newBooks));
        return isdeleteBook;
    }
}
