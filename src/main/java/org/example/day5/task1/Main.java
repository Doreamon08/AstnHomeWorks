package org.example.day5.task1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] ac) {

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            list.add(i);
            list.add(i);
        }
        System.out.println("List before:");
        list.forEach(integer -> System.out.print(integer + " "));

        System.out.println();
        System.out.println();

        ///////////////////////////////////////////////////////////

        List<Integer> distinctList = list.stream().
                distinct()
                .toList();

        System.out.println("List after distinct:");
        distinctList.forEach(integer -> System.out.print(integer + " "));

        System.out.println();
        System.out.println();

        ///////////////////////////////////////////////////////////

        List<Integer> evenList = distinctList.stream().
                filter(integer -> integer % 2 == 0).
                toList();

        System.out.println("List after delete not even integers:");
        evenList.forEach(integer -> System.out.print(integer + " "));

        System.out.println();
        System.out.println();

        ///////////////////////////////////////////////////////////

        int sum = evenList.stream().
                mapToInt(Integer::intValue).
                sum();

        System.out.println("Sum of all element: " + sum);

    }
}
