package comparator;

import com.Xworkz.collection.Arraylist.AddPatient;

import java.util.Comparator;

public class PatientAgeComparator implements Comparator<AddPatient> {
    @Override
    public int compare(AddPatient o1, AddPatient o2) {
        return  o1.getAge()-o2.getAge();
    }
}
