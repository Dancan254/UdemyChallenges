package NestedClassesAndTypes;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>(List.of(
                new Employee(10001, "Ian", 2015),
                new Employee(10005, "Duncan", 2017),
                new Employee(13531, "James", 2023),
                new Employee(10334, "Ann", 2021)
        ));

//        var comparator = new EmployeeComparator<>();
//        employees.sort(comparator);
        employees.sort(new Employee.EmployeeComparator<>());
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}
