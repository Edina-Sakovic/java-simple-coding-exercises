package com.company;

public class Main {

    public static void main(String[] args) {

        // test code

        System.out.println(isPerfectNumber(496));
        System.out.println(isPerfectNumber(28));
        System.out.println(isPerfectNumber(7));
        System.out.println(isPerfectNumber(-2));
        System.out.println(isPerfectNumber(8128));
        System.out.println(isPerfectNumber(0));
    }

    // returns true if number passed is a perfect number
    // a number is perfect if it is positive and equal to the sum of all of its proper divisors

    public static boolean isPerfectNumber(int number) {
        if (number >= 1) {
            int sumOfDivisors = 1;
            int divisor = 2;
            while (divisor < number) {
                if (number % divisor == 0) {
                    sumOfDivisors += divisor;
                }
                divisor++;
            }
            if (number == sumOfDivisors) {
                return true;
            }
        }
        return false;
    }
}
