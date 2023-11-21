import java.io.File;
//jvm will handle all the exception.
//forName-load the another type of class in the memory.
//throws-help us to specify the exception of caller.


public class ExceptionTester {
    public static void main(String[] args) {
        System.out.println(" main started");
        try{

            Class ExceptionTester = Class.forName("com.xworkz.Travel.ExceptionTester");
            System.out.println("class loded successFully FQCN "+ExceptionTester);


        }catch (ClassNotFoundException e){
            e.printStackTrace();

        }
        System.out.println("main ended");
    }
}
