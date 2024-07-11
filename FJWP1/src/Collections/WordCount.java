package Collections;

import java.util.Scanner;

public class WordCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the string: ");
        String inputString = scanner.nextLine();

        System.out.println("Enter the word to count: ");
        String wordToCount = scanner.nextLine();

        int count = countOccurrences(inputString, wordToCount);

        System.out.println("The word '" + wordToCount + "' occurs " + count + " times.");

        scanner.close();
    }

    public static int countOccurrences(String inputString, String wordToCount) {
       
        String[] words = inputString.split("\\s+");

        int count = 0;
       
        for (String word : words) {
            if (word.equalsIgnoreCase(wordToCount)) {
                count++;
            }
        }

        return count;
    }
}
