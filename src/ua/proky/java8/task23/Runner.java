package ua.proky.java8.task23;

import java.util.List;
import java.util.stream.Stream;

public class Runner {

    public static void main(String[] args) {
        long threshold = 20_000;
        String depCodeStart = "111-";

        List<Employee> firstDepEmployees = List
            .of(new Employee("William", 20000),
                new Employee("Sophia", 10000));

        List<Employee> secondDepEmployees = List
            .of(new Employee("John", 50000));

        Department firstDep = new Department("dep-1", "111-1", firstDepEmployees);
        Department secondDep = new Department("dep-2", "222-1", secondDepEmployees);

        List<Department> departments = List.of(firstDep, secondDep);

        long count = departments.stream()
            .filter(department -> department.getCode().startsWith(depCodeStart))
            .flatMap(department -> department.getEmployees().stream())
            .filter(employee -> employee.getSalary() >= threshold)
            .count();

        System.out.println(count);
    }
}
