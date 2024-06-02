package org.example.day6.task2;

import java.io.FileOutputStream;

import java.io.*;

public class ReplaceSpaces {
    public static void main(String[] args) {

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String inputString = reader.readLine();

            try (FileOutputStream fos = new FileOutputStream("tms.txt")) {
                fos.write(inputString.getBytes());
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        try (FileInputStream fis = new FileInputStream("tms.txt")) {
            StringBuilder stringBuilder = new StringBuilder();
            int character;
            while ((character = fis.read()) != -1) {
                if (character == ' ')
                    stringBuilder.append('_');
                else
                    stringBuilder.append((char) character);

            }

            System.out.println(stringBuilder);

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}

