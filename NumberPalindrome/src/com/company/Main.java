package com.company;

public class Main {

    public static void main(String[] args) {

        // testcode

        System.out.println(isPalindrome(670));
        System.out.println(isPalindrome(202));
        System.out.println(isPalindrome(-202));
        System.out.println(isPalindrome(88188));
        System.out.println(isPalindrome(3));
        System.out.println(isPalindrome(2552));
        System.out.println(isPalindrome(670670));
    }

    // determines the reverse of a number and based on that decides if number passed is a palindrome
    // also works with negative numbers, because it takes the absolute value

    public static boolean isPalindrome(int number) {
        number = Math.abs(number);
        int changedNumber = number;
        int reverse = 0;
        while (changedNumber > 0) {
            reverse += changedNumber % 10;
            changedNumber /= 10;
            reverse *= 10;
        }
        reverse /= 10;

        if (reverse == number) {
            return true;
        } else {
            return false;
        }
    }
}
