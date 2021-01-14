package com.company;

public class Main {

    public static void main(String[] args) {

        // exercises with the purpose of practicing the different kinds of loops

        int count = 1;
        while (count != 6) {
            System.out.println("Count value is " + count);
            count++;
        }

        for (int i=1; i<7; i++) {
            System.out.println("Count value is " + i);
        }

        count = 1;
        while (true) {
            if (count == 6) {
                break;
            }
            System.out.println("Count value is " + count);
            count++;
        }

        do {
            System.out.println("Count value was " + count);
            count++;
        } while (count < 6);

        System.out.println(isEvenNumber(53425));

        int number = 4;
        int finishNumber = 20;
        count = 0;

        while (number <= finishNumber) {
            number++;
            if (!isEvenNumber(number)) {
                continue;
            }
            count++;
            System.out.println("Even number " + number);
            if (count == 5) {
                System.out.println(count + " even numbers were found.");
                break;
            }
        }
    }

    public static boolean isEvenNumber(int number) {
        if (number % 2 == 0) {
            return true;
        }
        return false;
    }
}
