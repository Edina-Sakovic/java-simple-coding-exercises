package com.company;

public class Main {

    public static void main(String[] args) {

        // testcode

        printDayOfTheWeek(0);
        printDayOfTheWeek(1);
        printDayOfTheWeek(2);
        printDayOfTheWeek(3);
        printDayOfTheWeek(4);
        printDayOfTheWeek(5);
        printDayOfTheWeek(6);
        printDayOfTheWeek(7);

        printDayOfTheWeekUsingIfElse(0);
        printDayOfTheWeekUsingIfElse(1);
        printDayOfTheWeekUsingIfElse(2);
        printDayOfTheWeekUsingIfElse(3);
        printDayOfTheWeekUsingIfElse(4);
        printDayOfTheWeekUsingIfElse(5);
        printDayOfTheWeekUsingIfElse(6);
        printDayOfTheWeekUsingIfElse(7);
    }

    // prints the day of the week, depending on the passed int parameter between 0 and 6, using a switch statement
    // prints message that the passed value is invalid, if the number is not between 0 and 6

    public static void printDayOfTheWeek(int day) {
        switch (day) {
            case 0:
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalid Day");
                break;
        }
    }

    // does the same as the previous method,
    // the only difference being that the following method uses an if-else-statement instead of a switch statement

    public static void printDayOfTheWeekUsingIfElse(int day) {
        if (day == 0) {
            System.out.println("Sunday");
        } else if (day == 1) {
            System.out.println("Monday");
        } else if (day == 2) {
            System.out.println("Tuesday");
        } else if (day == 3) {
            System.out.println("Wednesday");
        } else if (day == 4) {
            System.out.println("Thursday");
        } else if (day == 5) {
            System.out.println("Friday");
        } else if (day == 6) {
            System.out.println("Saturday");
        } else {
            System.out.println("Invalid Day");
        }
    }
}
