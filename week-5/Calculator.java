import java.util.ArrayList;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter amount of numbers to add:");
        int amount = scanner.nextInt();
        int running = 0;

        for (int i = 0; i < amount; i++) {
            System.out.println("Enter number:");
            running += scanner.nextInt();
        }

        System.out.println("Total amount: " + running);
    }
}
