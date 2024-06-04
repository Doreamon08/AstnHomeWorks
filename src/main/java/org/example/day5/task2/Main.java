package org.example.day5.task2;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] ac) {

        List<Employee> employees = new ArrayList<>();
        employees = Employee.createListOfEmployees();

        System.out.println("List of employees: ");
        employees.forEach(System.out::println);

        System.out.println();
        System.out.println();

        System.out.println("List of employees older than 30: ");
        List<Employee> olderThan30 = Employee.getEmployeesOlderThan30(employees);
        olderThan30.forEach(System.out::println);

        System.out.println();
        System.out.println();

        System.out.println("The total number of employees in the IT department: ");
        System.out.println(Employee.getCountOfEmployeesFromIt(employees));

        System.out.println();
        System.out.println();

        System.out.println("Employee with higher salary: ");
        System.out.println(Employee.getEmployeeWithMaxSalary(employees));

        System.out.println();
        System.out.println();

        System.out.println("List of HRs names: ");
        List<String> listOfHr = Employee.getNamesOfAllHr(employees);
        listOfHr.forEach(System.out::println);

        System.out.println();
        System.out.println();

        System.out.println("Average salary of employees: ");
        System.out.println(Employee.getAverageSalary(employees));

    }

}
