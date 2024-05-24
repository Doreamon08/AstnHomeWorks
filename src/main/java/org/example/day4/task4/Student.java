package org.example.day4.task4;

import java.util.List;

public class Student {

    private String name;
    private int group;
    private int course;
    private List<Integer> evaluations;

    public Student(String name, int group, int course, List<Integer> evaluations) {
        this.name = name;
        this.group = group;
        this.course = course;
        this.evaluations = evaluations;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGroup() {
        return group;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public List<Integer> getEvaluations() {
        return evaluations;
    }

    public void setEvaluations(List<Integer> evaluations) {
        this.evaluations = evaluations;
    }

    public double getAverageEval() {
        return evaluations.stream().mapToInt(Integer::intValue).average().orElse(0.0);
    }
}
