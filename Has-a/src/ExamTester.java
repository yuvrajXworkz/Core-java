import com.xworkz.hasa.HallTicket;

public class ExamTester {


    public static void main(String[] args) {

      Exam exam =new Exam();
exam.setExamFees(1800);

HallTicket hall=new HallTicket();
hall.setStudentName("yuvraj");
hall.setUsn("4ub19cv058");
  hall.setSubjectCode("18bn23");
  hall.setSubjectName("geo");

exam.allow(hall);


    }
}
