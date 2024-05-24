package org.example.day4.task4;

import java.util.ArrayList;
import java.util.List;

class StudentList {
    private List<Student> students;

    public StudentList() {
        students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void filterLowGrades() {
        this.students = students.stream()
                .filter(student -> student.getAverageEval() >= 3)
                .toList();
    }

    public List<Student> getStudents() {
        return students;
    }
}

