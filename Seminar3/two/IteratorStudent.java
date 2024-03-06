/*
 * Задача 2 - Iterable
� Модифицировать класс УчебнаяГруппа, заставив его реализовать
интерфейс Iterable
� Реализовать метод iterator() возвращающий экземпляр созданного нами
итератора
� Создать класс УчебнаяГруппаСервис, добавив в него метод удаления
студента по ФИО
� Создать класс Контроллер, добавив в него метод удаления студента и
вызывать в нем созданный метод из УчебнаяГруппаСервис
 */

package Seminar3.two;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorStudent {

    public static void main(String[] args) {
        Student s1 = new Student("Bard", 19, "Chemistry");
        Student s2 = new Student("Rosie", 23, "Chemistry");
        Student s3 = new Student("Wolter", 19, "Chemistry");
        Student s4 = new Student("Black", 24, "Chemistry");
        ArrayList<Student> students = new ArrayList<>();
        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);

        Group group = new Group(students);

        for (Student student : group){
            System.out.println(student.compareTo(s2));
        }
    }
}