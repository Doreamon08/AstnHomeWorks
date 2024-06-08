package org.example.day2.task2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
        List<String> hobbies = new ArrayList<>(Arrays.asList("Reading", "Swimming"));
        ImmutablePerson immutablePerson = new ImmutablePerson("Alice", 30, hobbies);

        System.out.println("ImmutablePerson before modification: " + immutablePerson);

        hobbies.add("Running");
        System.out.println("ImmutablePerson after modification attempt: " + immutablePerson);

        MutablePerson mutablePerson = new MutablePerson("Bob", 25, new ArrayList<>(Arrays.asList("Gaming", "Cycling")));

        System.out.println("MutablePerson before modification: " + mutablePerson);

        mutablePerson.setName("Robert");
        mutablePerson.setAge(26);
        mutablePerson.getHobbies().add("Hiking");
        System.out.println("MutablePerson after modification: " + mutablePerson);
    }
}

