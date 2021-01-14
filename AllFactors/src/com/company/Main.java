package com.company;

public class Main {

    public static void main(String[] args) {

        // testcode

        printFactors(75);
        System.out.println("---------------");
        printFactors(5);
        System.out.println("---------------");
        printFactors(64);
        System.out.println("---------------");
        printFactors(24);
        System.out.println("---------------");
        printFactors(-20);
    }

    // if number passed is positive, prints out all divisors of the number
    // the divisor 1 and the number itself are excluded from the list
    // if the number is a prime number, the method will print that as a message

    public static void printFactors(int number) {
        if (number >= 1) {
            int divisor = 2;
            int divisorCount = 0;
            while (divisor < number) {
                if(number % divisor == 0) {
                    System.out.println(divisor);
                    divisorCount++;
                }
                divisor++;
            }
            if (divisorCount == 0) {
                System.out.println("The number passed is a prime number.");
            }
        } else {
            System.out.println("Invalid Value");
        }
    }
}
