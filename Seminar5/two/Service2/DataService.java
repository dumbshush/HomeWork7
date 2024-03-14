/*
 * � Создать package – service. Работу продолжаем в нем
� Создать класс DataService с методами в по управлению сущностями User
(create, read) и агрегирующий всех пользователей заведенных в системе
� StudentId должны быть созданы по алгоритму – максимальный id в
коллекции + 1. Аналогично и для TeacherId. Здесь решение через перебор
элементов и instanceOf
 */

package Seminar5.two.Service2;

import java.util.ArrayList;
import java.util.List;

import Seminar5.two.Data.Student5;
import Seminar5.two.Data.Teacher;
import Seminar5.two.Data.User;

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
            Teacher teacher = new Teacher(user.getName(), user.getAge(), null);
            teachers.add(teacher);
        }
    }

    public void read(boolean bool){ // тру студент
        if (bool) {
            System.out.println(students);
        }else if (bool) {
            System.out.println(teachers);
        }
    }
}
