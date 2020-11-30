package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(isOdd(-1));
        System.out.println(sumOdd(3,7));
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

    public static int sumOdd(int start, int end) {
        int sum = 0;
        if(start > 0 && end > 0 && start <= end) {
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
