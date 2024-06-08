package org.example.day4.task4;

import java.util.List;

public class Main {

    public static void main(String[] ac) {

        StudentList studentList = new StudentList();
        studentList.addStudent(new Student("Jack", 23, 3, List.of(3, 4, 5)));
        studentList.addStudent(new Student("Lola", 23, 3, List.of(3, 4, 5, 5)));
        studentList.addStudent(new Student("Lilya", 23, 3, List.of(3, 4, 5, 2)));
        studentList.addStudent(new Student("Ivan", 23, 3, List.of(3, 4, 5, 1, 1, 1)));
        studentList.addStudent(new Student("Chan", 23, 3, List.of(3, 4, 5, 3, 2, 2, 2, 2)));

        studentList.filterLowGrades();

        printStudents(studentList.getStudents(), 4);
    }

    private static void printStudents(List<Student> students, int course) {
        System.out.println("List of students in the  " + course + "th year: ");
        System.out.println(students.stream()
                .filter(student -> student.getCourse() == course)
                .map(Student::getName)
                .toList());
    }

}
