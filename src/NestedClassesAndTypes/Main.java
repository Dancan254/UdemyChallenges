package NestedClassesAndTypes;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>(List.of(
                new Employee(10001, "Ian", 2015),
                new Employee(10005, "Duncan", 2017),
                new Employee(13531, "James", 2023),
                new Employee(10334, "Ann", 2021) ));

//        var comparator = new EmployeeComparator<>();
//        employees.sort(comparator);
//        employees.sort(new Employee.EmployeeComparator<>("employeeid"));
        employees.sort(new Employee.EmployeeComparator<>("yearStarted").reversed());

        for (Employee employee : employees) {
            System.out.println(employee);
        }
        System.out.println("Store members");
        List<StoreEmployee> storeEmployees = new ArrayList<>(List.of(
                new StoreEmployee(10015, "Meg", 2019, "Target"),
                new StoreEmployee(10515, "Joe", 2021, "Walmart"),
                new StoreEmployee(10929, "Tom", 2020, "QuickMart"),
                new StoreEmployee(10126, "Ian", 2022, "Naivas")
        ));

        //var genericEmployee = new StoreEmployee();

        var comparator = new StoreEmployee().new storeComparator<>();
        storeEmployees.sort(comparator);
        for (StoreEmployee e : storeEmployees){
            System.out.println(e);
        }
    }
}
