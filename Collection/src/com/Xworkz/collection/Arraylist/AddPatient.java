package com.Xworkz.collection.Arraylist;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor


public class AddPatient implements Comparable<AddPatient> {
    private int Age;
    private String name;
    private String address;
    private int patientID;
    private String Attendername;
    private Gender gender;
    private BloodGroup bloodGroup;

    public String toString() {
        return "AddPatient (patientid=" + this.patientID + "patientname=" + this.name + "Address=" + this.address + "AttenderName=" + this.Attendername + ",Gender=" + this.gender + ",Bloodgroup=" + this.bloodGroup + ")";


    }
    @Override
    public  int hashCode(){
        return this.patientID;

    }


@Override
public  boolean equals(Object obj){
      if ( obj instanceof AddPatient){
          AddPatient add=(AddPatient) obj;
          if(this.patientID==add.getPatientID()){
              return  true;
          }
    }
      return false;
}


    @Override
    public int compareTo(AddPatient o) {
        return this.patientID-o.patientID;
      // return this.getAttendername().compareTo(o.getAttendername());
        //
        // return  this.getAddress().compareTo(o.getAddress());


    }

}
