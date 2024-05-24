package org.example.day4.task2;

import java.util.LinkedList;
import java.util.List;

public class LinkedListPractice {

    public static void main(String[] argc) {

        LinkedList<String> list = new LinkedList<>();

        list.addFirst("Japan");
        list.addFirst("Korea");
        list.addLast("Turkey");
        list.addLast("Sweden");
        System.out.println("The LinkedList after adding countries to the beginning(Japan, Korea)" +
                " and end(Turkey, Sweden): ");
        System.out.println(list);
        System.out.println("----------------------------\n");

        list.removeFirst();
        list.removeLast();
        System.out.println("The LinkedList after remove First and Last:");
        System.out.println(list);
        System.out.println("----------------------------\n");

        System.out.println("Get First from LinkedList:");
        System.out.println(list.getFirst());
        System.out.println("Get Last from LinkedList:");
        System.out.println(list.getLast());
    }

}
