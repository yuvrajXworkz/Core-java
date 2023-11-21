import com.xworkz.hasa.HallTicket;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Setter
@Getter
@AllArgsConstructor



    public class Exam {


    HallTicket hallTicket;
    private  int examFees;

    public Exam(){
    }

    public  boolean allow(HallTicket  hallTicket){
        boolean isAllow=false;

        if(examFees>1700) {
            System.out.println("exam fee is paid");
        }
            if (hallTicket != null) {
                this.hallTicket = hallTicket;
                this.hallTicket.displayDetails();
                isAllow = true;
            } else {
                System.out.println(("details are not found"));
            }



        return isAllow;



    }

    }
