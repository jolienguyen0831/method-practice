package com.pluralsight;

import java.util.Scanner;

public class Format {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your first name: ");
        String first = input.nextLine();

        System.out.print("Please enter your last name: ");
        String last = input.nextLine();

        System.out.println(formatName(first, last));
    }

    public static String formatName(String first, String last) {
        return last + ", " + first;
    }
}