package exercises;
import java.util.Scanner;
import java.time.Year;

public class VotingEligibility {
    private int birthYear;
    private int age;

    public VotingEligibility(int birthYear) {
        this.birthYear = birthYear;
        this.age = calculateAge();
    }
    private int calculateAge() {
        int currentYear = Year.now().getValue();
        return currentYear - birthYear;
    }

    public void checkEligibility() {
        if (age >= 18) {
            System.out.println("You are " + age + " years old. You are eligible to vote.");
        } else {
            System.out.println("You are " + age + " years old. You are not eligible to vote.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter your birth year: ");
        int birthYear = scanner.nextInt();
        
        VotingEligibility eligibility = new VotingEligibility(birthYear);
        eligibility.checkEligibility();
        
        scanner.close();
    }
}
