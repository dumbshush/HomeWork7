/*
 * Задача 1 - Iterator
� Создать класс Студент
� Создать класс УчебнаяГруппа
� Создать класс УчебнаяГруппаИтератор, заставив его реализовать
интерфейс Iterator
� Реализовать его контракты (включая удаление)
 */

package Seminar3.one;

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

        Iterator<Student> iterator = group.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
