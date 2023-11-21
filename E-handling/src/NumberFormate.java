public class NumberFormate {

    /*wrapper class-it is coversion of premitive data into non premitive;*/
    //exception handling-unwanted or unexcepted event trigger during the execution of program.
    //to overcome we use try and catch.

    public static void main(String[] args) {
        System.out.println("main started");
        String num="152lk";

        try {
            System.out.println(Integer.parseInt(num));

        }catch (NumberFormatException nf){
            System.out.println("String with number and char not converted to int");
            nf.printStackTrace();
        }

        System.out.println("main ended");
    }
}
