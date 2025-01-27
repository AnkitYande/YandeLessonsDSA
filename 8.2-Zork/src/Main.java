import java.util.*;

public class Main {
    public static void main(String[] args) {
        Player player = new Player();
        Map map = new Map();
        Scanner scanner = new Scanner(System.in);

        // Game Loop
        boolean gameRunning = true;
        while (gameRunning) {
            System.out.println("What would you like to do next:");
            String userInput = scanner.nextLine().toUpperCase();
            switch (userInput) {
                // TODO: Handle user input
            }
        }

        scanner.close();
    }
}
