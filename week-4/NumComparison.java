import java.util.Scanner;

public class NumComparison {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final int MAX = 25, LIMIT = 100;

        System.out.println("Enter first number:");
        int numOne = scanner.nextInt();

        System.out.println("Enter second number:");
        int numTwo = scanner.nextInt();

        System.out.println("Enter third number:");
        int numThree = scanner.nextInt();

        if (numOne < MAX) {
            System.out.println("Apple");
        }

        if (numTwo <= MAX) {
            System.out.println("Apple");
            System.out.println("Orange");
        }

        if (numThree < MAX) {
            System.out.println("Apple");
            System.out.println("Orange");
        }

        if (numThree >= LIMIT) {
            System.out.println("Apple");
            System.out.println("Orange");
            System.out.println("Pear");
        }

        if (numTwo == MAX) {
            System.out.println("Apple");
            System.out.println("Orange");
        }
        System.out.println("Pear");

        if (numThree - numTwo > 2 * MAX) {
            System.out.println("Apple");
        } else {
            System.out.println("Orange");
        }

        if (LIMIT + numThree <= 150) {
            System.out.println("Apple");
            System.out.println("Orange");
        } else {
            System.out.println("Pear");
        }

        if (2 * numOne != numTwo) {
            System.out.println("Apple");
        } else {
            System.out.println("Orange");
            System.out.println("Pear");
        }

        if (LIMIT % numOne + 4 == numOne + (MAX - numTwo)) {
            System.out.println("Apple");
            System.out.println("Orange");
        } else {
            System.out.println("Pear");
            System.out.println("Banana");
        }

        if (numOne < MAX) {
            if (LIMIT >= numTwo) {
                System.out.println("Apple");
                System.out.println("Orange");
            }
        }

        if (LIMIT <= LIMIT) {
            if (numThree == numOne) {
                System.out.println("Apple");
                System.out.println("Orange");
            }
        }

        if (numTwo > 18) {
            if (numOne < 0) {
                System.out.println("Apple");
            } else {
                System.out.println("Orange");
                System.out.println("Pear");
            }
        }

        scanner.close();
    }
}
