import java.util.Scanner;

public class QuestionOne {
    /**
     * Question One Attempt for Java Programming Assignment.
     * Written by: Mei Waterman
     * Student Number: s4065282
     * Date: 20/03/2025
     */

    public static void main(String[] args) {
        // Initiate scanner for input
        Scanner scanner = new Scanner(System.in);

        // Get input for operation and two numbers
        System.out.println("Enter operation (+, -, /, *):");
        String operation = scanner.next();
        System.out.println("Enter first number:");
        double numOne = scanner.nextDouble();
        System.out.println("Enter second number:");
        double numTwo = scanner.nextDouble();

        // Operate on the numbers depending on the operation and set result to the
        // result
        double result = 0;
        if (operation.contains("+")) {
            result = numOne + numTwo;
        } else if (operation.contains("-")) {
            result = numOne - numTwo;
        } else if (operation.contains("*")) {
            result = numOne * numTwo;
        } else if (operation.contains("/")) {
            result = numOne / numTwo;
        } else {
            // Exit program if there is an incorrect input
            System.out.println("Incorrect input");
            scanner.close();
            return;
        }

        // Print result and close scanner
        System.out.println("Result:");
        System.out.println(result);

        scanner.close();
    }
}
