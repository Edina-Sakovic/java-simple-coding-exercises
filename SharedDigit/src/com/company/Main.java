package com.company;

public class Main {

    public static void main(String[] args) {

        // testcode

        System.out.println(hasSharedDigit(56,67));
        System.out.println(hasSharedDigit(-3,67));
        System.out.println(hasSharedDigit(24,56));
        System.out.println(hasSharedDigit(78,80));
        System.out.println(hasSharedDigit(21,20));
    }

    // compares digits of 2 two-digit numbers and returns true if they have a digit in common, otherwise returns false

    public static boolean hasSharedDigit(int firstNumber, int secondNumber) {
        if (firstNumber >= 10 && firstNumber <= 99 && secondNumber >= 10 && secondNumber <= 99) {
            int firstDigit1 = firstNumber % 10;
            int firstDigit2 = firstNumber / 10;
            int secondDigit1 = secondNumber % 10;
            int secondDigit2 = secondNumber / 10;
            if (firstDigit1 == secondDigit1 || firstDigit1 == secondDigit2 || firstDigit2 == secondDigit1 || firstDigit2 == secondDigit2) {
                return true;
            }
        }
        return false;
    }
}
