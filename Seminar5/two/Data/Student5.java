package Seminar5.two.Data;

public class Student5 extends User{
    private int id;
    
    public Student5(String name, int age){
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Student{" + "name= " + name + ", id= " + id + ", age= " + age +  '}';
    }
}
