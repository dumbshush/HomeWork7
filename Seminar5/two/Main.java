package Seminar5.two;

import java.util.List;

import Seminar5.two.Data.Student5;
import Seminar5.two.Data.Teacher;
import Seminar5.two.Service2.DataService;

public class Main {
    public static void main(String[] args) {
        DataService dataService = new DataService();

        dataService.create(new Student5("stop", 2));
        dataService.create(new Student5("pls", 3));
        dataService.create(new Student5("help", 4));
        dataService.create(new Teacher("...", 66, null));
        dataService.create(new Teacher("uh", 665, null));
        dataService.create(new Teacher("whait", 64, null));

        dataService.read(true);
        System.out.println();
        dataService.read(false);
    }
}
