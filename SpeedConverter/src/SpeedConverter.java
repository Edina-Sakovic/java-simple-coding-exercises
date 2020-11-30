public class SpeedConverter {

    /*
     * if non-negative input, returns rounded amount of kilometers per hour converted to miles per hour,
     * otherwise returns -1
     */
    public static long toMilesPerHour(double kilometersPerHour){
        if (kilometersPerHour < 0) {
            return -1;
        }
        return Math.round(kilometersPerHour / 1.609);
    }

    /*
     * if negative input, reports about invalid input
     * otherwise prints coonverted value from kilometers per hour to miles per hour
     */

    public static void printConversion(double kilometersPerHour) {

        if (kilometersPerHour < 0) {
            System.out.println("Invalid Value");
        }
        else {
            long milesPerHour = toMilesPerHour(kilometersPerHour);
            System.out.println(kilometersPerHour + " km/h = " + milesPerHour + " mi/h");
        }
    }
}
