import java.util.Random;
import java.util.Scanner;

public class QuestionThree {
    /**
     * Question Three Attempt for Java Programming Assignment.
     * Written by: Mei Waterman
     * Student Number: s4065282
     * Date: 20/03/2025
     */

    public static void main(String[] args) {
        // Initialise scanner and random generator
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("I am thinking of a number between 1 and 20.");

        int guess = 0;
        // set random number to between 1 and 20
        int randomNumber = random.nextInt(1, 10);


        while (guess != randomNumber) {
            // Ask for guess
            System.out.println("Enter your guess for what it is:");
            guess = scanner.nextInt();

            // Output higher, lower, or correct depending on guess
            if (guess > randomNumber) {
                System.out.println("That guess is too high.");
            } else if (guess < randomNumber) {
                System.out.println("That guess is too low.");
            } else if (guess == randomNumber) {
                System.out.println("That's the number I was thinking off.");
            }
        }

        scanner.close();
    }
}
