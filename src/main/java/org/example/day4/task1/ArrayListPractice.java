package org.example.day4.task1;

import java.util.ArrayList;
import java.util.List;

public class ArrayListPractice {

    public static void main(String[] argc) {

        List<String> list = new ArrayList<>();

        list.add("France");
        list.add("Georgia");
        list.add("Japan");

        System.out.println("List: ");
        System.out.println(list);
        System.out.println("----------------------------\n");

        list.set(1, "India");
        System.out.println("List after set new element(India) in index 1: ");
        System.out.println(list);
        System.out.println("----------------------------\n");

        list.remove(1);
        System.out.println("List after remove element by index(1): ");
        System.out.println(list);
        System.out.println("----------------------------\n");


        list.remove("France");
        System.out.println("List after remove element by value(France): ");
        System.out.println(list);
        System.out.println("----------------------------\n");


        int indexOfJapan = list.indexOf("Japan");
        System.out.println("Get index by value(Japan): ");
        System.out.println(indexOfJapan);
        System.out.println("----------------------------\n");

        System.out.println("List contains Object Japan? ");
        System.out.println(list.contains("Japan"));

    }

}
