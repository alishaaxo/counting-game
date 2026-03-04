import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        // Generating a random number between 1 and 50
        Random random = new Random();

        int playerWinCount = 0;
        int computerWinCount = 0;

        while (playerWinCount < 2 && computerWinCount < 2) {
            System.out.println("New Game woop woop!");
        }

        int number = random.nextInt(50) + 1;
        // Setting the number of attempts as 4
        int attempts = 4;
        boolean guessedCorrectly = false;

        // Instructions for the user
        System.out.println(
                "I, the glorius computer have chosen a number between 1 and 50");
        System.out.println(
                "You have " + attempts + " attempts to guess the correct number, good luck!");

        // Loop for attempts
        for (int i = 0; i < attempts; i++) {
            System.out.print("Enter your guess: ");
            int guess = scanner.nextInt();

            // Checking the conditions
            if (guess == number) {
                System.out.println(
                        " Congratulations! You have guessed the correct number.");
                playerWinCount++;
                guessedCorrectly = true;
                break;
            } else if (guess < number) {
                System.out.println(
                        " The number is higher than " + guess);
            } else {
                System.out.println(
                        " The number is lower than " + guess);
            }
        }

        if (!guessedCorrectly) {
            System.out.println("MWAHAHAHAHAH! You have lost this round! The correct number was: " + number);
            computerWinCount++;
        }

        // Text to display whoever has won the best of three
        if (playerWinCount == 2) {
            System.out.println("You have won the best of three... has to be AI");
        } else {
            System.out.println("I, THE GLORIUS COMPUTER, HAVE WON THE BEST OF THREE! MWAHAHAH!");
        }
        scanner.close();
    }
}

