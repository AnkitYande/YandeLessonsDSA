import java.util.Scanner;

public class AkinatorGame {
    BinaryTree tree;
    Scanner scanner;

    public AkinatorGame() {
        tree = initializeTree();
        scanner = new Scanner(System.in);
    }

    // Initialize the tree with some default questions and answers
    private BinaryTree initializeTree() {
        // TODO: Create your decision tree here
        return null;
    }
    

    // Method to start the game
    public void play() {
        System.out.println("Think of something, and I will try to guess it.");
        System.out.println("Your options are: " + tree.getLeafNodes());
        
        // TODO : create your game loop here
    }
}