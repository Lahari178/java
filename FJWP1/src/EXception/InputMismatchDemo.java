package EXception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputMismatchDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Please enter an integer: ");
            int number = scanner.nextInt();
            System.out.println("You entered: " + number);
        } catch (InputMismatchException e) {
            System.err.println("Invalid input! Please enter a valid integer.");
        } finally {
            scanner.close();
        }

        System.out.println("Program continues after handling the exception.");
    }
}