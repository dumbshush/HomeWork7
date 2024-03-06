/*
 * Задача 3 - Comparable
� Модифицировать класс Студент, заставив его реализовать интерфейс
Comparable
� Реализовать контракт compareTo () со сравнением по какому-либо
параметру (пример studentId)
� Модифицировать класс УчебнаяГруппаСервис, добавив в него метод
сортировки списка студентов по id
� Модифицировать класс Контроллер, добавив в него метод сортировки
списка студентов по id и вызывать в нем созданный метод из
УчебнаяГруппаСервис
 */

 package Seminar3.three;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class IteratorStudent {

    public static void main(String[] args) {
        Student s1 = new Student("Bard", 19, "Chemistry");
        Student s5 = new Student("Bard", 30, "Chemistry");
        Student s2 = new Student("Rosie", 23, "Chemistry");
        Student s3 = new Student("Wolter", 19, "Chemistry");
        Student s4 = new Student("Black", 24, "Chemistry");
        ArrayList<Student> students = new ArrayList<>();
        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);
        students.add(s5);

        Group group = new Group(students);

        students.sort(new StudentComporator());

        for (Student student : group){
            System.out.println(student);
        }
    }
}