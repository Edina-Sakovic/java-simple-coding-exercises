public class AreaCalculator {

    // takes the radius as input and returns the surface of a circle with that radius
    // returns -1 if passed number is negative

    public static double area(double radius) {
        if (radius < 0) {
            return -1.0;
        } else {
            double circleArea = Math.PI * radius * radius;
            return circleArea;
        }
    }

    // takes the length and width of a rectangle as input and returns the corresponding surface
    // returns -1 if at least one of the 2 parameters is negative

    public static double area(double x, double y) {
        if (x < 0 || y < 0) {
            return -1.0;
        }
        else {
            double rectanlgeArea = x * y;
            return rectanlgeArea;
        }
    }
}
