package Collections;

import java.util.Scanner;
import java.util.TreeMap;

public class Dictionary {
    public static void main(String[] args) {
       
        TreeMap<String, String> dictionary = new TreeMap<>();

        Scanner scanner = new Scanner(System.in);

        dictionary.put("apple", "a fruit with red or green skin and a rounded shape");
        dictionary.put("book", "a set of written or printed pages, usually bound with protective covers");

        boolean exit = false;
        while (!exit) {
            System.out.println("\nDictionary Application Menu:");
            System.out.println("1. Add a Word and Definition");
            System.out.println("2. Search for a Definition");
            System.out.println("3. Display All Words and Definitions (Alphabetical Order)");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    
                    System.out.print("Enter the word: ");
                    String word = scanner.nextLine().toLowerCase(); // Convert to lowercase for consistency
                    System.out.print("Enter the definition: ");
                    String definition = scanner.nextLine();
                    dictionary.put(word, definition);
                    System.out.println("Word '" + word + "' added to the dictionary.");
                    break;
                case 2:
                    
                    System.out.print("Enter the word to search for: ");
                    String searchWord = scanner.nextLine().toLowerCase(); // Convert to lowercase for consistency
                    if (dictionary.containsKey(searchWord)) {
                        System.out.println("Definition of '" + searchWord + "': " + dictionary.get(searchWord));
                    } else {
                        System.out.println("Word '" + searchWord + "' not found in the dictionary.");
                    }
                    break;
                case 3:
                    System.out.println("Dictionary Entries (Alphabetical Order):");
                    for (String key : dictionary.keySet()) {
                        System.out.println(key + ": " + dictionary.get(key));
                    }
                    break;
                case 4:
                    exit = true;
                    System.out.println("Exiting Dictionary Application.");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number from 1 to 4.");
                    break;
            }
        }

        scanner.close();
    }
}
