import lombok.Builder;

public class wrapper {
    //parse-premitive to corresponding wrapper class.
    //wrraper class-primitive data to corresponding of object  type data.

    public static void main(String[] args) {

        String phoneNumber="9845988460";
        long contatctNo=Long.parseLong( phoneNumber);
        System.out.println(phoneNumber);


        String i="25";
        int i1=Integer.parseInt(i);
        System.out.println(i);

        String b="20";

        byte b1=Byte.parseByte(b);
        System.out.println(b);

        String f="0.00";
        float f1=Float.parseFloat(f);
        System.out.println(f);

        String d="2.00";
        double d1=Double.parseDouble(d);
        System.out.println(d);

        String s="20000";
        short s1=Short.parseShort(s);
        System.out.println(s);

    }

}
