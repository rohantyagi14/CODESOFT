import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int score = 0;
        char playAgain;

        do {

            int secretNumber = random.nextInt(100) + 1;
            int attempts = 5;
            boolean guessed = false;

            System.out.println("\n===== NUMBER GAME =====");
            System.out.println("Guess a number between 1 and 100");
            System.out.println("You have " + attempts + " attempts.");

            while (attempts > 0) {

                System.out.print("Enter your guess: ");
                int guess = sc.nextInt();

                if (guess == secretNumber) {
                    System.out.println(" Congratulations! You guessed the correct number.");
                    score++;
                    guessed = true;
                    break;
                } else if (guess < secretNumber) {
                    System.out.println(" Too Low!");
                } else {
                    System.out.println(" Too High!");
                }

                attempts--;

                if (attempts > 0) {
                    System.out.println("Attempts Left: " + attempts);
                }
            }

            if (!guessed) {
                System.out.println("\n You Lost!");
                System.out.println("The correct number was: " + secretNumber);
            }

            System.out.println("Current Score: " + score);

            System.out.print("\nDo you want to play again? (Y/N): ");
            playAgain = sc.next().charAt(0);

        } while (playAgain == 'Y' || playAgain == 'y');

        System.out.println("\n===== GAME OVER =====");
        System.out.println("Final Score: " + score);
        System.out.println("Thanks for Playing!");

        sc.close();
    }
}