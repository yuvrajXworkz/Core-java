public class Blocks {
    //2 types of blocks..init block and static block.

    static {
        System.out.println("invokeing  the init block");
    }
    public static void main(String[] args) {
        System.out.println("invokeing the main method");
        Blocks b=new Blocks();


    }

    {
        System.out.println("invokeing of b1 init block");
    }

    {
        System.out.println("invokeing of b2  init block");
    }
    {
        System.out.println("invokeing of b3  init block");
    }
    {
        System.out.println("invokeing of b4  init block");
    }

    }


