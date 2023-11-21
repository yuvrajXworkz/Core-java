package Ecommerce;

import com.Xworkz.collection.Arraylist.BloodGroup;
import com.Xworkz.collection.Arraylist.Gender;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class EcommerceTester {
    public static void main(String[] args) {
        List<EcommerceDto> dto=new ArrayList<EcommerceDto>();
        dto.add(new EcommerceDto(1,"rahul","rrnagar", Gender.MALE, BloodGroup.ANEG));
        dto.add(new EcommerceDto(3,"vikas","jpnagar", Gender.MALE, BloodGroup.APOS));
        dto.add(new EcommerceDto(4,"vinod","vijaynagar", Gender.MALE, BloodGroup.APOS));
        dto.add(new EcommerceDto(6,"manoj","magadi", Gender.MALE, BloodGroup.APOS));
        dto.add(new EcommerceDto(7,"vijay","jayanagar", Gender.MALE, BloodGroup.APOS));
        dto.add(new EcommerceDto(5,"santhosh","kengeri", Gender.MALE, BloodGroup.ANEG));
        dto.add(new EcommerceDto(2,"Pavan","mleshwaram", Gender.MALE, BloodGroup.APOS));
        dto.add(new EcommerceDto(10,"yashwanth","yashwanthpura", Gender.MALE, BloodGroup.BNEG));
        dto.add(new EcommerceDto(9,"manju","nandinilayout", Gender.MALE, BloodGroup.APOS));
        dto.add(new EcommerceDto(8,"vikas","jpnagar", Gender.MALE, BloodGroup.BNEG));



        System.out.println(dto.stream().sorted().collect(Collectors.toList()));
        System.out.println(dto.stream().sorted(Comparator.comparing(EcommerceDto::getCustomersName)).findFirst());

      /*  Collections.sort(dto);

        for(EcommerceDto ecom:dto){
            System.out.println(ecom);
        }*/
    }
}
