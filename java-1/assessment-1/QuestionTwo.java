import java.util.Scanner;

public class QuestionTwo {
    /**
     * Question Two Attempt for Java Programming Assignment
     * Written by: Mei Waterman
     * Student Number: s4065282
     * Date: 20/03/2025
     */

    public static void main(String[] args) {
        // Initalise scanner
        Scanner scanner = new Scanner(System.in);

        // Prompt for the starting number, ending number, and interval,
        // in double for a wider array of number possibilities
        System.out.println("Enter starting number:");
        double startingNumber = scanner.nextDouble();
        System.out.println("Enter ending number:");
        double endingNumber = scanner.nextDouble();
        System.out.println("Enter interval:");
        double interval = scanner.nextDouble();

        // Print out the number in between starting and ending,
        // with a gap of interval between each number
        System.out.println("Numbers:");
        for (double i = startingNumber; i < endingNumber; i += interval) {
            System.out.println(i);
        }

        scanner.close();
    }
}
