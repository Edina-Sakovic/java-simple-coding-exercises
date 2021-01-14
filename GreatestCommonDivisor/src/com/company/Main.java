package com.company;

public class Main {

    public static void main(String[] args) {

        // testcode

        System.out.println(getGreatestCommonDivisor(21,70));
        System.out.println(getGreatestCommonDivisor(7,20));
        System.out.println(getGreatestCommonDivisor(-6,20));
        System.out.println(getGreatestCommonDivisor(50,150));
        System.out.println(getGreatestCommonDivisor(40,20));
        System.out.println(getGreatestCommonDivisor(48,24));
        System.out.println(getGreatestCommonDivisor(75,25));
        System.out.println(getGreatestCommonDivisor(25,75));
        System.out.println(getGreatestCommonDivisor(50,50));
    }

    // if numbers passed are at least as large as 10, returns their greatest common divisor
    // this is done by decrementing the smaller one of the two numbers by 1 until it is a common divisor
    // otherwise returns -1

    public static int getGreatestCommonDivisor(int first, int second) {
        if (first >= 10 && second >= 10) {
            int divisor = isTheSmallerOfTheTwo(first, second);
            while (first % divisor != 0 || second % divisor != 0) {
                divisor--;
            }
            return divisor;
        }
        return -1;
    }

    // returns the smaller one of 2 numbers

    public static int isTheSmallerOfTheTwo(int first, int second) {
        int theSmallerOne;
        if (first >= second) {
            theSmallerOne = second;
        } else {
            theSmallerOne = first;
        }
        return theSmallerOne;
    }
}
