package org.example.day3.task1;

import java.util.Scanner;

public class FindShortestAndLongestLine {
    public static void main(String[] argc) {

        Scanner scanner = new Scanner(System.in);
        String[] strings = new String[3];

        for (int i = 0; i < 3; i++)
            strings[i] = scanner.next();

        String shortestLine = findShortestString(strings);
        System.out.println("Shortest line: " + "\"" + shortestLine + "\""
                + ". Length: " + shortestLine.length());

        String longestLine = findLongestString(strings);
        System.out.println("Longest line: " + "\"" + longestLine + "\""
                + ". Length: " + longestLine.length());
    }

    private static String findShortestString(String[] strings) {

        String shortString = strings[0];

        for (String string : strings) {
            if (string.length() < shortString.length())
                shortString = string;
        }

        return shortString;
    }

    private static String findLongestString(String[] strings) {

        String shortString = strings[0];

        for (String string : strings) {
            if (string.length() > shortString.length())
                shortString = string;
        }

        return shortString;
    }
}
