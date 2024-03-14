package HomeWork5.Data;

import java.util.ArrayList;
import java.util.List;

public class Teacher extends User {
    private List<String> lessions;

    public Teacher(String name, int age, List<String> lessions){
        this.name = name;
        this.age = age;
        this.lessions = lessions;
    }

    public List<String> getLessions() {
        return lessions;
    }

    public void setLessions(ArrayList<String> lessions) {
        lessions = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "Teacher [name= " + this.name + ", lessions=" + this.lessions + ", age= " + this.age + "]";
    }

    
}
