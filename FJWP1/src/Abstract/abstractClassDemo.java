package Abstract;

abstract class Shape {
    abstract double calculateArea();

    public void display() {
        System.out.println("Displaying shape");
    }
}
class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    double calculateArea() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    double calculateArea() {
        return length * width;
    }
}

public class abstractClassDemo{
    public static void main(String[] args) {
         Shape circle = new Circle(5);
        Shape rectangle = new Rectangle(4, 6);

        circle.display();
        System.out.println("Area of the circle: " + circle.calculateArea());

        rectangle.display();
        System.out.println("Area of the rectangle: " + rectangle.calculateArea());
    }
}