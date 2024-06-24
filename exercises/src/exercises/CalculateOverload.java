package exercises;

public class CalculateOverload {

    public double calculateArea(double radius) {
        return Math.PI * radius * radius;
    }

    public double calculateArea(double length, double width) {
        return length * width;
    }

    public double calculateArea(double base, double height, boolean isTriangle) {
        if (isTriangle) {
            return 0.5 * base * height;
        } else {
            return 0; // Default return value if not a triangle
        }
    }

    public static void main(String[] args) {
        CalculateOverload calculator = new CalculateOverload();

        double circleArea = calculator.calculateArea(5.0); // Calls method with one double parameter
        double rectangleArea = calculator.calculateArea(4.0, 6.0); // Calls method with two double parameters
        double triangleArea = calculator.calculateArea(3.0, 4.0, true); // Calls method with three parameters

        System.out.println("Area of Circle: " + circleArea);
        System.out.println("Area of Rectangle: " + rectangleArea);
        System.out.println("Area of Triangle: " + triangleArea);
    }
}
