package Seminar3.three;

import java.util.Comparator;

public class StudentComporator implements Comparator<Student>{

    public int compare(Student s1, Student s2){
        String Matt = s1.getName() + s1.getAge();
        String Alex = s2.getName() + s2.getAge();
        return Matt.compareTo(Alex);
    }
    
}
