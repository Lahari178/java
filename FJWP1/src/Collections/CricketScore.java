package Collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CricketScore {
    public static void main(String[] args) {
       
        Map<String, Integer> cricketerScores = new HashMap<>();

        cricketerScores.put("Virat Kohli", 120);
        cricketerScores.put("Rohit Sharma", 85);
        cricketerScores.put("Joe Root", 105);
        cricketerScores.put("Steve Smith", 95);

        System.out.println("Cricketer Scores Map:");
        System.out.println(cricketerScores);

        Scanner scanner = new Scanner(System.in);
        System.out.print("\nEnter the cricketer's name to search: ");
        String cricketerName = scanner.nextLine();

        if (cricketerScores.containsKey(cricketerName)) {
            int score = cricketerScores.get(cricketerName);
            System.out.println("Score of " + cricketerName + ": " + score);
        } else {
            System.out.println("Cricketer " + cricketerName + " not found in the records.");
        }

        scanner.close();
    }
}
