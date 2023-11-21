import lombok.Builder;
@Builder
public class ArrayTester {
    public static void main(String[] args) {
        System.out.println("main is started");
        String str[]= new String[2];
        try {
            str[0] = "yuvi";
            str[1] = "yy";
            str[2] = "zz";
            str[3]="uu";
        }catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }
            System.out.println("main is ended");
ArrayTester ar=ArrayTester.builder().build();


    }
}
