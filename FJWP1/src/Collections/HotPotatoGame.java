package Collections;

import java.util.LinkedList;
import java.util.Queue;

public class HotPotatoGame {
    public static void main(String[] args) {
        Queue<String> players = new LinkedList<>();

        players.add("Alice");
        players.add("Bob");
        players.add("Charlie");
        players.add("David");
        players.add("Eve");

        while (players.size() > 1) {
          
            String currentPlayer = players.remove();
            System.out.println("Player " + currentPlayer + " is out.");

            players.add(currentPlayer);

            System.out.println("Current players in the circle: " + players);
        }

        System.out.println("The winner is: " + players.remove());
    }
}