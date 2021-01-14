package com.company;

public class Main {

    private static final String INVALID_VALUE_MESSAGE = "Invalid Value";

    public static void main(String[] args) {

        // testcode

        System.out.println(getDurationString(65, 45));
        System.out.println(getDurationString(3945));
        System.out.println(getDurationString(-41));
        System.out.println(getDurationString(65, 9));
    }

    // takes an amount of minutes and seconds, converts it to hours, minutes and seconds,
    // then returns a string stating those values

    public static String getDurationString(int minutes, int seconds) {
        if (minutes < 0 || seconds < 0 || seconds > 59) {
            return INVALID_VALUE_MESSAGE;
        }
        else {
            int hours = minutes / 60;
            int remainingMinutes = minutes % 60;

            String hoursString = hours + "h";
            if (hours < 10) {
                hoursString = "0" + hoursString;
            }
            String minutesString = remainingMinutes + "m";
            if (remainingMinutes < 10) {
                minutesString = "0" + minutesString;
            }
            String secondsString = seconds + "s";
            if (seconds < 10) {
                secondsString = "0" + secondsString;
            }

            String duration = hoursString + " " + minutesString + " " + secondsString;
            return duration;
        }
    }

    // takes an amount of seconds and prints a message of how many hours, minutes and seconds that is
    // uses method "getDurationString" to accomplish the last step
    // if negative amount of seconds, returns message stating that value is invalid

    public static String getDurationString(int seconds) {
        if (seconds < 0) {
            return INVALID_VALUE_MESSAGE;
        }
        else {
          int minutes = seconds / 60;
          int remainingSeconds = seconds % 60;
          return getDurationString(minutes, remainingSeconds);
        }
    }
}
