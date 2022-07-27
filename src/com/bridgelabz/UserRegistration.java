package com.bridgelabz;


import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistration {
    public static void main(String[] args) {
                System.out.println("Welcome to user registration program");
                Scanner scanner = new Scanner(System.in);
                System.out.println("Enter first name");
                String firstName = scanner.next();
                System.out.println(Pattern.matches("[A-Z][a-z]{2,}", firstName));

                System.out.println("Enter last name");
                String lastName = scanner.next();
                System.out.println(Pattern.matches("[A-Z][a-z]{2,}",lastName));

                System.out.println("Enter emailId");
                String emailId = scanner.next();
                System.out.println(Pattern.matches("[a-z][A-Z a-z 0-9]+[@][a-z]+[.][a-z]{2,}", emailId));
    }
}



                              


                                               