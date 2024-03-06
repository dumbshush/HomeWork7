package HomeWork3;

public class Student implements Comparable<Student>{
    private String name;
    private int age;
    private String specialization;
    private int grade;

    public Student(String name, int age, String specialization, int grade){
        this.name = name;
        this.age = age;
        this.specialization = specialization;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }
    
    public void setAge(int age) {
        this.age = age;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student{" + "name='" + name + '\'' + ", age=" + age + ", specialization='" 
        + specialization + '\'' + ", grade=" + grade + '}';
    }

    @Override
    public int compareTo(Student student) {
        return this.name.compareTo(student.name);
    }
}