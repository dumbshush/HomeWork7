/*
 * — Создать класс Поток, содержащий в себе список УчебныхГрупп и реализующий интерфейс Iterable;
— Создать класс StreamComparator, реализующий сравнение количества групп, входящих в Поток;
— Модифицировать Comparator для студента таким образом, что бы была возможность сравнения оценок студентов(предвадительно необходимо добавить соотвествующее поле в Student)

Формат сдачи: ссылка на гитхаб проект
 */

 package HomeWork3;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Group> groups1 = createGroups(2);
        Flow flow1 = new Flow(groups1);

        ArrayList<Group> groups2 = createGroups(3);
        Flow flow2 = new Flow(groups2);

        System.out.println("Количество групп в первом потоке: " + flow1.getGroups().size());

        for (Group group : flow1) {
            System.out.println("Учебная группа:");
            for (Student student : group) {
                System.out.println(" - " + student.getName());
            }
        }        

        System.out.println("Количество групп во втором потоке: " + flow2.getGroups().size());

        for (Group group : flow2) {
            System.out.println("Учебная группа:");
            for (Student student : group) {
                System.out.println(" - " + student.getName());
            }
        }  

    }

    private static ArrayList<Group> createGroups(int numGroups) {

        ArrayList<Group> groups = new ArrayList<>();

        for (int i = 0; i < numGroups; i++) {
            ArrayList<Student> students = new ArrayList<>();
            students.add(new Student("Student" + (i * 2 + 2), 18 + i, "Chemistry", i + 2));
            students.add(new Student("Student" + (i * 2 + 2), 19 + i, "Chemistry", i + 2));
            students.add(new Student("Student" + (i * 2 + 2), 20 + i, "Chemistry", i + 2));
            Group group = new Group(students);
            groups.add(group);
        }
        return groups;
    }
}