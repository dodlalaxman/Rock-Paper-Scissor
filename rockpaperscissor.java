import java.util.Scanner;
import java.util.Random;

public class RockPaperScissor {
    public static void main(String[] args) {

        while (true) {
            String[] rps = {"r", "p", "s"};
            String computerMove = rps[new Random().nextInt(rps.length)];

            Scanner scanner = new Scanner(System.in); // Changed variable name to lowercase
            String playerMove;

            while (true) {
                System.out.println("Please enter your move (r, p, or s):");
                playerMove = scanner.nextLine();

                if (playerMove.equals("r") || playerMove.equals("p") || playerMove.equals("s")) {
                    break;
                }

                System.out.println(playerMove + " is not a valid move.");
            }

            System.out.println("Computer played: " + computerMove);

            if (playerMove.equals(computerMove)) {
                System.out.println("The game was a tie!");
            } else if (computerMove.equals("r")) {
                if (playerMove.equals("p")) {
                    System.out.println("You win!");
                } else if (playerMove.equals("s")) {
                    System.out.println("You lose!");
                }
            } else if (computerMove.equals("p")) {
                if (playerMove.equals("r")) {
                    System.out.println("You lose!");
                } else if (playerMove.equals("s")) {
                    System.out.println("You win!");
                }
            } else if (computerMove.equals("s")) {
                if (playerMove.equals("p")) {
                    System.out.println("You lose!");
                } else if (playerMove.equals("r")) {
                    System.out.println("You win!");
                }
            }
        }
    }
}
