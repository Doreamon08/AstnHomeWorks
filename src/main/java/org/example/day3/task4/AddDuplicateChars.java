package org.example.day3.task4;

import java.util.Scanner;

public class AddDuplicateChars {
    public static void main(String[] argc) {

        Scanner scanner = new Scanner(System.in);

        String string = scanner.next();

        System.out.println(addDuplicates(string));
    }

    private static String addDuplicates(String string) {

        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < string.length(); i++) {
            stringBuilder.append(string.charAt(i));
            stringBuilder.append(string.charAt(i));
        }

        return stringBuilder.toString();
    }

}
