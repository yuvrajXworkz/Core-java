import java.io.File;
import java.io.IOException;

public class
CreatNewFile {
    public static void main(String[] args) {


        File file =new File("C:\\Users\\yuvra\\OneDrive\\Desktop\\new.pdf");
                try{
                   if(file.createNewFile()){



                    }else{
                        System.out.println("file with new.pdf already existed");
                    }
                }catch (IOException io){
                    io.printStackTrace();

                }


    }
}
