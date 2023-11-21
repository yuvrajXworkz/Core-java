public class ExecutionTester {
    public static void main(String[] args) {
        System.out.println("main started");
        try{
           Class ExecutionTester= Class.forName("com.xworkz.Travel.ExecutionTester");
            System.out.println("class loaded sucessfully with FQCN "+ExecutionTester);

        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }
        System.out.println("main ended");
    }
}
