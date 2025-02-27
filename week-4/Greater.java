import java.util.Scanner;

public class Greater {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number:");
        Integer numOne = scanner.nextInt();

        System.out.println("Enter second number:");
        Integer numTwo = scanner.nextInt();

        if (numOne > numTwo) {
            System.out.println("First number is greater than second number.");
        } else if (numOne < numTwo) {
            System.out.println("Second number is greater than first number.");
        } else if (numOne == numTwo) {
            System.out.println("The numbers are equal.");
        } else {
            System.out.println("Invalid input");
        }

        scanner.close();
    }
}
