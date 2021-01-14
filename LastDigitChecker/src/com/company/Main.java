package com.company;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {

        // testcode

        System.out.println(isValid(5));
        System.out.println(isValid(56));
        System.out.println(isValid(-74));
        System.out.println(isValid(1234));
        System.out.println(hasSameLastDigit(67,349,839));
    }

    // using the method "isValid()" below, checks if the 3 parameters are valid numbers
    // returns true if at least 2 of them have the same last digit

    public static boolean hasSameLastDigit(int firstNr, int secondNr, int thirdNr) {
        if (isValid(firstNr) && isValid(secondNr) && isValid(thirdNr)) {
            int firstLastDigit = firstNr % 10;
            int secondLastDigit = secondNr % 10;
            int thirdLastDigit = thirdNr % 10;
            if(firstLastDigit == secondLastDigit | firstLastDigit == thirdLastDigit | secondLastDigit == thirdLastDigit) {
                return true;
            }
        }
        return false;
    }

    // returns true if passed number is between 10 and 1000, otherwise returns false

    public static boolean isValid(int number) {
        if (number >= 10 && number <= 1000) {
            return true;
        }
        else {
            return false;
        }
    }
}
