package com.company;

public class Main {

    public static void main(String[] args) {

        // testcode

        System.out.println(isOdd(-1));
        System.out.println(isOdd(5));
        System.out.println(isOdd(20));
        System.out.println(isOdd(4));
        System.out.println(sumOdd(3,7));
        System.out.println(sumOdd(4,4));
        System.out.println(sumOdd(8,3));
        System.out.println(sumOdd(5,25));
        System.out.println(sumOdd(20,22));
    }

    // returns true if number passed is positive and odd

    public static boolean isOdd(int number) {
        if (number > 0) {
            if (number % 2 != 0) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    // returns sum of all odd numbers between passed parameters start and end
    // returns -1 if start or end are negative or end is smaller than start

    public static int sumOdd(int start, int end) {
        int sum = 0;
        if (start > 0 && end > 0 && start <= end) {
            for (int i = start; i <= end; i++) {
                if (isOdd(i)) {
                    sum += i;
                }
            }
            return sum;
        }
        return -1;
    }
}
