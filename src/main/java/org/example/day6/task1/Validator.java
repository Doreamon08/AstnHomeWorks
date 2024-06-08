package org.example.day6.task1;

import org.example.day6.task1.Exceptions.WrongLoginException;
import org.example.day6.task1.Exceptions.WrongPasswordException;

public class Validator {

    public static boolean validationOfAutontification(
            String login, String password, String confirmPassword
    ) throws WrongLoginException, WrongPasswordException {

        if (login.length() > 20 || login.contains(" ")) {
            throw new WrongLoginException(
                    "Login length should be less than 20 characters" +
                            " and should not contain spaces");
        }

        if (password.length() > 20 || password.contains(" ")
                || !containsDigits(password) || !password.equals(confirmPassword))
            throw new WrongPasswordException(
                    "The password must be less than 20 characters, " +
                            "contain no spaces, and match the password confirmation");


        return true;
    }
    private static boolean containsDigits(String str) {
        for (char c : str.toCharArray()) {
            if (Character.isDigit(c)) {
                return true;
            }
        }
        return false;
    }

}
