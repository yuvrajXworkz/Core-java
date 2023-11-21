package Array.Exception;

public class BookNameNotFoundException extends Exception{

    public BookNameNotFoundException(String errorMessage)
    {
        System.out.println(errorMessage);
    }
}
