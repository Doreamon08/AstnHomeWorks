package org.example.day4.task3;

import java.util.HashSet;

public class HashSetPractice {

    public static void main(String[] ac) {

        HashSet<Person> hashSet = new HashSet<>();

        Person person1 = new Person();
        Person person2 = new Person();
        Person person3 = new Person();

        hashSet.add(person1);
        hashSet.add(person2);
        hashSet.add(person3);

        System.out.println("HashSet after adding: ");
        for (Person p : hashSet)
            System.out.println(p);
        System.out.println("----------------------------\n");

        hashSet.remove(person1);
        hashSet.remove(person2);
        System.out.println("HashSet after remove 2 element: ");
        for (Person p : hashSet)
            System.out.println(p);

    }

}
