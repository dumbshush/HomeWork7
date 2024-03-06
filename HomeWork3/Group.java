package HomeWork3;
import java.util.ArrayList;
import java.util.Iterator;

public class Group implements Iterable<Student> {
    ArrayList<Student> students;
    private static StudentComporator studentComparator = new StudentComporator();

    public Group(ArrayList<Student> students){
        this.students = students;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    @Override
    public Iterator<Student> iterator() {
        ArrayList<Student> sortedStudents = new ArrayList<>(students);
        sortedStudents.sort(studentComparator);
        return sortedStudents.iterator();
    }

}
