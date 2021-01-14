package com.company;

public class Main {

    public static void main(String[] args) {

        // testcode

        System.out.println(sumDigits(700800980));
        System.out.println(sumDigits(-4));
        System.out.println(sumDigits(-16));
        System.out.println(sumDigits(6545));
    }

    // for a number larger than or equal to 10 returns the sum of its digits,
    // for numbers smaller than 10 returns -1

    public static int sumDigits(int number) {
        int sum = 0;
        if (number >= 10) {
            for (int i=1; number / i != 0; i *= 10) {
                sum += (number / i) % 10;
            }
            return sum;
        }
        return -1;
    }
}
