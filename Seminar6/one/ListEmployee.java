package Seminar6.one;

import java.util.ArrayList;

public class ListEmployee {
    ArrayList<Employee> EmployeeList = new ArrayList<Employee>();
    
    public void saveEmployee(Employee employee) {
        // Сохранение данных сотрудника в базу данных
        EmployeeList.add(employee);
    }
}
