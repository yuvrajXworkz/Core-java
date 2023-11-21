public class Tester {


    public static void main(String[] args) {
        System.out.println("main is stated");


        String str=null;
        try {
            System.out.println(str.length());
        }catch (NullPointerException e){
            System.out.println("cannot access the null ref");
        }


        System.out.println("main is ended");
    }
}
