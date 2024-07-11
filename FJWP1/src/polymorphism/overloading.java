package polymorphism;

public class overloading {

    public double calculateArea(double radius) {
        return Math.PI * radius * radius;
    }

  
    public double calculateArea(double length, double width) {
        return length * width;
    }

    public double calculateArea(double base, double height, boolean isTriangle) {
        return 0.5 * base * height;
    }

    public static void main(String[] args) {
        overloading calculator = new overloading();

        double circleArea = calculator.calculateArea(5.0);
        System.out.println("Area of circle: " + circleArea);

        double rectangleArea = calculator.calculateArea(4.0, 6.0);
        System.out.println("Area of rectangle: " + rectangleArea);

        double triangleArea = calculator.calculateArea(3.0, 4.0, true);
        System.out.println("Area of triangle: " + triangleArea);
    }
}
