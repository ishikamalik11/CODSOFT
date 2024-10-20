import java.util.Scanner;
import java.util.Random;

public class NumberGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        boolean playAgain = true;
        int totalRounds = 0;
        int totalAttempts = 0;

        System.out.println("Welcome to the Number Guessing Game!");

        while (playAgain) {
            int targetNumber = random.nextInt(100) + 1;  
            int guess = 0;
            int attempts = 0;
            boolean correctGuess = false;

            System.out.println("\nRound " + (totalRounds + 1) + ":");
            System.out.println("I'm thinking of a number between 1 and 100. Can you guess it?");
            
            while (!correctGuess) {
                System.out.print("Enter your guess: ");
                guess = scanner.nextInt();
                attempts++;

                if (guess == targetNumber) {
                    System.out.println("Congratulations! You guessed the correct number.");
                    correctGuess = true;
                } else if (guess < targetNumber) {
                    System.out.println("Too low! Try again.");
                } else {
                    System.out.println("Too high! Try again.");
                }
            }

            System.out.println("You found the number in " + attempts + " attempts.");
            totalRounds++;
            totalAttempts += attempts;

            System.out.print("Do you want to play another round? (y/n): ");
            char response = scanner.next().charAt(0);
            playAgain = (response == 'y' || response == 'Y');
        }
        System.out.println("\nGame Over!");
        System.out.println("You played " + totalRounds + " rounds.");
        System.out.println("Total attempts: " + totalAttempts);
        System.out.println("Average attempts per round: " + (totalAttempts / (double) totalRounds));

        scanner.close();
    }
}


