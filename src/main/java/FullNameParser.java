package com.pluralsight;

import java.util.Scanner;

public class FullNameParser {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String fullName, middleName, lastName;
        System.out.print("Please enter your name (first last, or first middle last):\t");
        fullName = scan.nextLine().trim();

        int firstSpace = fullName.indexOf(" ");
        String firstName = fullName.substring(0, firstSpace);

        String remainder = fullName.substring(firstSpace+1).trim();

        int secondSpace = remainder.indexOf(" ");

        if(secondSpace == -1) {
            middleName = "(none)";
            lastName = remainder.trim();
        } else {
            middleName = remainder.substring(0, 1) + ".";
            lastName = remainder.substring(secondSpace+1).trim();
        }

        System.out.println("First name: " + firstName.trim());
        System.out.println("Middle name: " + middleName);
        System.out.println("Last name: " + lastName.trim());

        scan.close();
    }
}
