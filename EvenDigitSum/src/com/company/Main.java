package com.company;

public class Main {

    public static void main(String[] args) {

        // testcode

        System.out.println(getEvenDigitSum(-4));
        System.out.println(getEvenDigitSum(-20));
        System.out.println(getEvenDigitSum(20000));
        System.out.println(getEvenDigitSum(95));
        System.out.println(getEvenDigitSum(6));
        System.out.println(getEvenDigitSum(66));
        System.out.println(getEvenDigitSum(120));
        System.out.println(getEvenDigitSum(88888));
    }

    // returns sum of a non-negative number's even digits, for negative numbers returns -1

    public static int getEvenDigitSum(int number) {
        int sum = 0;
        int digit = 0;
        if (number >= 0) {
            while (number > 0) {
                digit = number % 10;
                if (digit % 2 == 0) {
                    sum += digit;
                }
                number /= 10;
            }
            return sum;
        }
        return -1;
    }
}
