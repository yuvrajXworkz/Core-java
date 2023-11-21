package Array;

import Array.Exception.BookNameNotFoundException;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Arrays;

@Setter
@Getter
@ToString


public class Library {

    public  Books[]books;
    int index;
    int id;
    public Library(int Size)

    {
       books=new  Books[Size];
    }

    public  boolean addDetails(Books book) {
     boolean isAdded=false;
     if(books!=null){
         book.setBooksID(++id);
         this.books[index++]=book;
         isAdded=true;
     }
     else{
         System.out.println("books is null");
     }
     return isAdded;
    }

    public  boolean updateBooksNameByBooksAuthor(String updateName,String existingAuthor){
        boolean isUpdatedName=false;
        for (int index=0;index<books.length;index++){
            if(books[index].getAuthorName()==existingAuthor){
                books[index].setBookName( updateName);
                isUpdatedName=true;
            }
        }
        return isUpdatedName;
    }

    public  boolean updateNoOfPagesByBookName(int updatePages,String existingBookName){
        boolean isUpdatedPages=false;
        for (int index=0;index<books.length;index++){
            if (books[index].getBookName()==existingBookName){
                books[index].setNoOfPages(updatePages);
                isUpdatedPages=true;
            }
        }
    return isUpdatedPages;
    }
public  boolean updateBookPriceByBookName(double updatePrice,String existingName){
        boolean isUpdatedPrice=false;
        for(int index=0;index<books.length;index++){
            if(books[index].getBookName()==existingName){
                books[index].setBookPrice(updatePrice);
                isUpdatedPrice=true;
            }
        }
        return  isUpdatedPrice;
}

public boolean updateBookIDByBookAuthor(int UpdateBookID,String existingAuthorName){
        boolean isUpdatedBookId=false;
        for(int index=0;index<books.length;index++){
            if(books[index].getAuthorName()==existingAuthorName){
                books[index].setBooksID(UpdateBookID);
                isUpdatedBookId=true;
            }
        }
        return isUpdatedBookId;
}
public  boolean updateBookPagesByBookName(int updatedPages,String existingName){
        boolean isUpdatePages=false;
        for( int index=0;index<books.length;index++){
            if(books[index].getBookName()==existingName){
                books[index].setNoOfPages(updatedPages);
                isUpdatePages=true;
            }
        }
       return  isUpdatePages;
}

public boolean deleteBookById(int id){
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

    public  void getAllBooks(){
        for(int index=0;index<books.length;index++){
            System.out.println(books[index]);
        }
    }
    public  String getBookNameByBookAuthor(String BookAuthor)throws BookNameNotFoundException{
       String booksName=null;
        for(int index=0;index<books.length;index++){
            if (books[index].getAuthorName()==BookAuthor){
                booksName=books[index].getBookName();
            }
        }
        if(booksName==null){
            throw new BookNameNotFoundException("book name not found execption "+BookAuthor);
        }
        return booksName;
    }
public  int  getNoOfPagesByBookName(String BookName){
        int NoOfPages=0;
        for(int index=0;index<books.length;index++){
            if(books[index].getBookName()==BookName){
                NoOfPages=books[index].getNoOfPages();
            }
        }
return NoOfPages;
    }

public double getBookPriceByBookName(String bookName){
        double bookPrice=0;
        for(int index=0;index<books.length;index++){
            if(books[index].getBookName()==bookName){
                bookPrice=books[index].getBookPrice();
            }
        }
        return bookPrice;
}

public int getBookIDByBookAuthor(String AuthorName){
        int BookId=0;
        for( int index=0;index<books.length;index++){
            if(books[index].getAuthorName()==AuthorName){
                BookId=books[index].getBooksID();
            }
        }
        return BookId;
}

public  String getBookNameByPublisher(String publisher){
        String BookName=null;
        for(int index=0;index<books.length;index++){
            if(books[index].getPublisher()==publisher){
                BookName=books[index].getBookName();
            }
        }
        return BookName;
}


public  Books getBookById(int Id){
        Books Book =null;
        for( int index=0;index<books.length;index++){
            if(books[index].getBooksID()==Id){
                Book= books[index];
            }
        }
        return Book;
}




}



