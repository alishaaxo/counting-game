import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Generating a random number between 1 and 50
        Random random = new Random();
        int number = random.nextInt(50) + 1;

        // Setting the number of attempts as 4
        int attempts = 4;

        // Instructions for the user
        System.out.println(
                "I as the computer have chosen a number between 1 and 50");
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
                scanner.close();

                // Exits the function if the user has guessed the number correctly
                return;
            } else if (guess < number) {
                System.out.println(
                        " The number is higher than " + guess);
            } else {
                System.out.println(
                        " The number is lower than " + guess);
            }
        }

        // Text to display to the user if they have reached 4 attempts and haven't guessed correctly
        System.out.println(
                "You have used all your attempts, silly! The correct number was: " + number);
        scanner.close();
    }
}

