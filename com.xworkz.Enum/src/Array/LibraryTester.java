package Array;

import Array.Exception.BookNameNotFoundException;

import java.util.Scanner;
import java.util.SortedMap;

public class LibraryTester {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the size");
        int Size= scanner.nextInt();

        Library library=new Library(Size);

        for(int index=0;index<library.books.length;index++){
            Books books=new Books();

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

            library.addDetails(books);
        }
        library.getAllBooks();

        System.out.println("enter the author name to get book name");
        try {
            String booksName = library.getBookNameByBookAuthor(scanner.next());
            System.out.println("book name is " + booksName);
        }catch (BookNameNotFoundException b){
            b.printStackTrace();
        }

        System.out.println("enter the bookname to get no of pages");
        int NoOfPages=library.getNoOfPagesByBookName(scanner.next());
            System.out.println("no of pages is "+NoOfPages);

        System.out.println("enter the bookname to get book price");
        double bookPrice=library.getBookPriceByBookName(scanner.next());
        System.out.println("enter book price "+bookPrice);

        System.out.println("enter book author to get book id");
        int BookId=library.getBookIDByBookAuthor(scanner.next());
        System.out.println("enter book id "+BookId);

        System.out.println("enter the publisher name to get book name");
        String BookName=library.getBookNameByPublisher(scanner.next());
        System.out.println("book name is "+ BookName);

        System.out.println("enter the id to get book");
        Books Book=library.getBookById(scanner.nextInt());
        System.out.println("enter the book "+ Book);

        System.out.println("enter the bookname to update no of pages");
        String existingBookName=scanner.next();
        System.out.println("enter the update pages ");
        int updatePages=scanner.nextInt();
        boolean isUpdatedPages=library.updateNoOfPagesByBookName( updatePages,existingBookName);
        System.out.println("no of pages is "+updatePages);
        library.getAllBooks();


        System.out.println("enter the author name to update book name");
        String existingAuthor=scanner.next();
        System.out.println("enter the update name");
        String updateName=scanner.next();
        boolean isUpdatedName=library.updateBooksNameByBooksAuthor( updateName, existingAuthor);
        System.out.println("update book name is "+ isUpdatedName);
        library.getAllBooks();

        System.out.println("enter the book name to update book price");
        String  existingName=scanner.next();
        System.out.println("enter the update price");
        double updatePrice=scanner.nextInt();
        boolean isUpdatedPrice=library.updateBookPriceByBookName(updatePrice,existingName);
        System.out.println("update price is "+updatePrice);
        library.getAllBooks();

        System.out.println("enter the book author to update bookId");
        String existingAuthorName=scanner.next();
        System.out.println("enter update book id");
        int UpdateBookID=scanner.nextInt();
        boolean isUpdatedBookId=library.updateBookIDByBookAuthor(UpdateBookID,existingAuthorName);
        System.out.println("update id "+ UpdateBookID);
        library.getAllBooks();

        System.out.println("enter the book name to update book pages");
        String existingbookName=scanner.next();
        System.out.println("enter the update book pages");
        int updatedPages=scanner.nextInt();
        boolean isUpdatePages=library.updateNoOfPagesByBookName(updatedPages,existingName);
        System.out.println("updated pages "+updatedPages);
        library.getAllBooks();

        System.out.println("entern the book id to delete book");
        int id=scanner.nextInt();
        boolean isdeleteBook=library.deleteBookById(id);

        


    }
}
