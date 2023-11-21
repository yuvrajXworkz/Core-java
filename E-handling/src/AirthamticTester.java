import java.util.Scanner;

public class AirthamticTester {

    //handle multiple exception in single catch.(useing | -symbol)
    public static void main(String[] args) {
        System.out.println("main is started");
        int a = 5;
        int b = 0;
         String str = null;
        Scanner sc=null;

        try {
            sc=new Scanner(System.in);
            String str1= sc.next();

            System.out.println(a / b);
            System.out.println(str.length());


        } catch (ArithmeticException | NullPointerException e) {
            e.printStackTrace();


        }
        //finally-it is a block close all costly resources with thre help of try and catch.
        //block purpose-initialize the variable in a class.
        finally {
            System.out.println("inside finallly  block,closeing sc" );

            if(sc!=null){
                sc.close();
            }
        }
        System.out.println("main is ended");
    }
}
