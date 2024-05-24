package org.example.day3.task2;

import java.util.Scanner;

public class LessThanAverageLength {
    public static void main(String[] argc) {

        Scanner scanner = new Scanner(System.in);
        String[] strings = new String[3];

        for (int i = 0; i < 3; i++)
            strings[i] = scanner.next();


        double averageLength = getAverageLength(strings);
        System.out.println("Average length: " + averageLength);
        System.out.println("Lines that are shorter than the average length: ");
        for (String s : strings) {
            if (s.length() < averageLength)
                System.out.println("\t" + s);
        }
    }

    private static double getAverageLength(String[] strings) {

        int totalLength = 0;

        for (String s : strings)
            totalLength += s.length();

        return totalLength / 3.0;
    }
}
