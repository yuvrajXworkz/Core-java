package Array;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class Ecommerce {

    public Customers []customers;
    int index;
    int id;

    public Ecommerce(int size){
        customers=new  Customers[size];

    }

    public  boolean addCustomers(Customers customers){
        boolean isAdded=false;
        if(customers!=null){
            customers.setCustomersID(++id);
            this. customers[index++]= customers;
            isAdded=true;

        }
    else{
            System.out.println("customers is null");
        }
    return  isAdded;

    }


    public boolean updatedCustomerNameByCustomerID(String updatedName,int existingId){
        boolean isUpdatedName=false;
        for (int index=0;index<customers.length;index++){
            if(customers[index].getCustomersID()== existingId){
                customers[index].setCustomersName(updatedName);
                isUpdatedName=true;
            }
        }
        return isUpdatedName;
    }
    public  boolean updateCustomerIdByBloodGroup(int updateId, BloodGroup existingbloodgroup){
        boolean isUpdatedId=false;
        for(int index=0;index<customers.length;index++){
            if(customers[index].getCustomersName().equals(existingbloodgroup)){
                customers[index].setCustomersID( updateId);
                isUpdatedId=true;
            }
        }
        return isUpdatedId;
    }
    public boolean updateCustomerGenderByCustomerId(Gender updateGender,int existingId){
        boolean isUpdatedGender=false;
        for(int index=0; index<customers.length;index++){
            if(customers[index].getCustomersID()==existingId){
                customers[index].setGender( updateGender);
                isUpdatedGender=true;
            }
        }
        return isUpdatedGender;

    }


    public  boolean updateCustomerAddressByCustomerName(String updateAddress,String existingName){
        boolean isUpdatedAddress=false;
        for(int index=0;index<customers.length;index++){
        if(customers[index].getCustomersName()==existingName) {
            customers[index].setCustomersAddress(updateAddress);
            isUpdatedAddress = true;
        }
        }
        return isUpdatedAddress;
    }


    public  void getAllCustomers(){
        for(int customersindex=0;customersindex< customers.length;customersindex++) {
            System.out.println(customers[customersindex]);
        }
        }
public String getCustomersNameByCustomerId( int Id){
            String name=null;
            for(int index=0;index<customers.length;index++){
                if(customers[index].getCustomersID()==Id){
                    name=customers[index].getCustomersName();
                }
            }
        return  name;

    }

public int getCustomersIdByBloodGroup(String BloodGroup){
        int Id=0;
        for(int index=0;index<customers.length;index++){
            if(customers[index].getBloodgroup().equals(BloodGroup)){
                Id=customers[index].getCustomersID();
            }

        }
return Id;
    }
public  Gender getCustomersGenderByCustomersId(int Id){
        Gender gender=null;
        for(int index =0;index<customers.length;index++){
            if(customers[index].getCustomersID()==Id){
                gender=customers[index].getGender();
            }

        }
        return gender;

}

public String getCustomersAddressByCustomersName(String Name){
        String address=null;
        for(int index =0;index<customers.length;index++){
            if(customers[index].getCustomersName()==Name){
                address=customers[index].getCustomersAddress();
            }
        }
        return address;
}
}
