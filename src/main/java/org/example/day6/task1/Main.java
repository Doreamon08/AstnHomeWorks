package org.example.day6.task1;

import org.example.day6.task1.Exceptions.WrongLoginException;
import org.example.day6.task1.Exceptions.WrongPasswordException;

public class Main {
    public static void main(String[] ac) {
        try {
            boolean result = Validator.validationOfAutontification("Login", "password1", "password1");
            System.out.println("Result of validate: " + result);
        } catch (WrongLoginException | WrongPasswordException e) {
            throw new RuntimeException(e);
        }
    }



}
