package com.pluralsight;

import java.util.Scanner;

public class CompareNumbers {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a random number: ");
        int number1 = input.nextInt();
        System.out.println(isEven(number1));
        System.out.print("Enter another random number: ");
        double number2 = input.nextDouble();
        System.out.println(isPositive(number2));


    }

    public static boolean isEven(int number) {
            return number % 2 == 0;
    }

    public static boolean isPositive(double number) {
            return number >= 0;

    }

}
