package org.example.day5.task2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Employee {

    private String name;
    private int age;
    private String department;
    private int salary;

    public Employee(String name, int age, String department, int salary) {
        this.name = name;
        this.age = age;
        this.department = department;
        this.salary = salary;
    }

    public static List<Employee> createListOfEmployees() {

        return Stream.of(
                new Employee("Alice", 30, "IT", 70000),
                new Employee("Bob", 25, "HR", 50000),
                new Employee("Charlie", 35, "Finance", 80000),
                new Employee("David", 40, "IT", 90000),
                new Employee("Eve", 28, "Marketing", 60000),
                new Employee("Frank", 45, "IT", 100000),
                new Employee("Grace", 32, "HR", 55000),
                new Employee("Hank", 29, "IT", 72000)
        ).collect(Collectors.toList());

    }

    static public List<Employee> getEmployeesOlderThan30(List<Employee> employees) {

        return employees.stream().
                filter(employee -> employee.getAge() > 30).
                sorted(Comparator.comparingInt(Employee::getAge)).
                toList();

    }

    static public long getCountOfEmployeesFromIt(List<Employee> employees) {

        return employees.stream().
                filter(employee -> employee.getDepartment().equals("IT")).
                count();

    }

    static public Employee getEmployeeWithMaxSalary(List<Employee> employees) {

        return employees.stream().
            max(Comparator.comparingInt(Employee::getSalary)).
                orElse(null);

    }

    static public List<String> getNamesOfAllHr(List<Employee> employees) {

        return employees.stream().
                filter(employee -> employee.getDepartment().equals("HR")).
                map(Employee::getName).
                sorted().
                toList();

    }

    static public double getAverageSalary(List<Employee> employees) {

        return employees.stream()
                .mapToInt(Employee::getSalary)
                .average()
                .orElse(0);

    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getDepartment() {
        return department;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return  name + ", " + age + ", " + department + ", " + salary;

    }
}
