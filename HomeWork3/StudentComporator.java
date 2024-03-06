package HomeWork3;

import java.util.Comparator;

public class StudentComporator implements Comparator<Student>{

    public int compare(Student s1, Student s2){
        return Integer.compare(s1.getGrade(), s2.getGrade());
    }
    
}
