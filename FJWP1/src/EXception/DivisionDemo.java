package EXception;

import java.util.Scanner;

public class DivisionDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter the numerator: ");
            double numerator = scanner.nextDouble();

            System.out.print("Enter the denominator: ");
            double denominator = scanner.nextDouble();

            double result = numerator / denominator;
            System.out.println("The result of the division is: " + result);
        } catch (ArithmeticException e) {
            System.err.println("Error: Division by zero is not allowed.");
        } finally {
            scanner.close();
        }

        System.out.println("Program continues after handling the exception.");
    }
}