/*
 * Создать package – view. Работу продолжаем в нем
Создать класс StudentView, содержащий в себе метод 
вывода в консоль данных студента поданных на вход — 
Всё вышеуказанное создать согласно принципам ООП, пройдённым на семинаре.
 */

package HomeWork5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import HomeWork5.Data.Student5;
import HomeWork5.Data.Teacher;
import HomeWork5.Service2.DataService;
import HomeWork5.view.StudentView;

public class Main {
    public static void main(String[] args) {
        DataService dataService = new DataService();
        Scanner scanner = new Scanner(System.in);
        StudentView studentView = new StudentView();
        List<String> les = new ArrayList<>(Arrays.asList("Математика", "Химия", "Физика"));

        dataService.create(new Student5("Ann", 15));
        dataService.create(new Student5("Bob", 16));
        dataService.create(new Student5("Jack", 20));
        dataService.create(new Teacher("Olivia", 66, les));
        dataService.create(new Teacher("Rizzly", 665, les));
        dataService.create(new Teacher("Paul", 64, les));

        System.out.println("Введите имя или возраст студента:");
        String input = scanner.nextLine();

        try {
            int age = Integer.parseInt(input);
            Student5 foundByAge = dataService.findStudentByAge(age);
            if (foundByAge != null) {
                studentView.printStudentDetails(foundByAge);
            } else {
                System.out.println("Студент не найден.");
            }
        } catch (NumberFormatException e) {
            Student5 foundByName = dataService.findStudentByName(input);
            if (foundByName != null) {
                studentView.printStudentDetails(foundByName);
            } else {
                System.out.println("Студент не найден.");
            }
        }

        // dataService.readStudentsByName("Bob");

        // dataService.readStudentsByAge(21);

        // dataService.read(true);
        // System.out.println();
        // dataService.read(false);
    }
}
