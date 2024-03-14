/*
 * � Создать package – service. Работу продолжаем в нем
� Создать класс DataService с методами в по управлению сущностями User
(create, read) и агрегирующий всех пользователей заведенных в системе
� StudentId должны быть созданы по алгоритму – максимальный id в
коллекции + 1. Аналогично и для TeacherId. Здесь решение через перебор
элементов и instanceOf
 */

package HomeWork5.Service2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import HomeWork5.Data.Student5;
import HomeWork5.Data.Teacher;
import HomeWork5.Data.User;

public class DataService {

    private ArrayList<Teacher> teachers;
    private ArrayList<Student5> students;

    public DataService(){
        this.teachers = new ArrayList<>();
        this.students = new ArrayList<>();
    }

    public void create(User user){
        if (user instanceof Student5) {
            int id = students.size();
            Student5 student5 = new Student5(user.getName(), user.getAge());
            student5.setId(id+1);
            students.add(student5);
        }else if(user instanceof Teacher){
            List<String> les = new ArrayList<>(Arrays.asList("Математика", "Химия", "Физика"));
            Teacher teacher = new Teacher(user.getName(), user.getAge(), les);
            teachers.add(teacher);
        }
    }

    public Student5 findStudentByName(String name) {
        for (Student5 student : students) {
            if (student.getName().equals(name)) {
                return student;
            }
        }
        return null;
    }

    public Student5 findStudentByAge(int age) {
        for (Student5 student : students) {
            if (student.getAge() == age) {
                return student;
            }
        }
        return null;
    }

    public void read(boolean bool){ // тру студент
        if (bool) {
            System.out.println(students);
        }else if (bool) {
            System.out.println(teachers);
        }
    }
}
