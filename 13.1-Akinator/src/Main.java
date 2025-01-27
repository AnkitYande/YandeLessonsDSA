import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        AkinatorGame game = new AkinatorGame();
        boolean playgame = true;
        while(playgame){
            System.out.println("\nWould you like to play Akinator? (yes/no)");
            String answer = scn.nextLine().trim().toLowerCase();
            if (answer.equals("yes")) {
                game.play();
            } else {
                playgame = false;
            }
        }
        scn.close();
    }
}
