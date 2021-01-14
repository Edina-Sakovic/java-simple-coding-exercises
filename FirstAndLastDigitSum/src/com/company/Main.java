package com.company;

public class Main {

    public static void main(String[] args) {

        // testcode

        System.out.println(sumFirstAndLastDigit(6));
        System.out.println(sumFirstAndLastDigit(85));
        System.out.println(sumFirstAndLastDigit(2000));
        System.out.println(sumFirstAndLastDigit(-20));
    }

    // returns digit of positive single digit number multiplied by 2;
    // for positive multiple digit numbers returns sum of first and last digit
    // for negative numbers returns -1

    public static int sumFirstAndLastDigit(int number) {
        if (number >= 0) {
            int sum = 0;
            int divider = 10;
            int rest = number / divider;
            while (rest >= 10) {
                rest /= divider;
            }
            if (rest == 0) {
                sum = 2 * (number % 10);
            } else {
                sum = rest + number % 10;
            }
            return sum;
        } else {
            return -1;
        }
    }
}
