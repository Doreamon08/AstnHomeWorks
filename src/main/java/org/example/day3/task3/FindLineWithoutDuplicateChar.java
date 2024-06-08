package org.example.day3.task3;

import java.util.Scanner;

public class FindLineWithoutDuplicateChar {
    public static void main(String[] argc) {

        Scanner scanner = new Scanner(System.in);
        String[] strings = new String[3];

        for (int i = 0; i < 3; i++)
            strings[i] = scanner.next();

        String withoutDupl = findLineWithoutDupl(strings);
        if (withoutDupl != null)
            System.out.println("Line without duplicate characters: " + "\"" + withoutDupl + "\"");
        else
            System.out.println("All lines have a duplicates.");
    }

    private static String findLineWithoutDupl(String[] strings) {

        for (String string : strings) {
            if (!hasDuplicate(string))
                return string;
        }

        return null;
    }

    private static boolean hasDuplicate(String string) {

        for (int i = 0; i < (string.length() - 1); i++) {
            for (int j = 0; j < string.length(); j++) {
                if (i != j && string.charAt(i) == string.charAt(j))
                    return true;
            }
        }

        return false;
    }

}
