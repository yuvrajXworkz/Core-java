package Ecommerce;

import com.Xworkz.collection.Arraylist.BloodGroup;
import com.Xworkz.collection.Arraylist.Gender;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class EcommerceDto implements Comparable<EcommerceDto>{

    private  int customersID;
    private  String customersName;
    private String  customersAddress;
    private Gender gender;
    private BloodGroup bloodgroup;

    public String toString(){
        return "Ecommerce-(customerId="+ this.customersID+",name="+ this.customersName+",Address="+ this.customersAddress+",gender="+ this.gender+",BloodGroup="+ this.bloodgroup+")";
    }


    @Override
    public int compareTo(EcommerceDto o) {
        return this.customersID-o.customersID;
    }
}
