import java.util.ArrayList;
import java.util.Scanner;

public class Sales {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number of sales this week:");
        int sales = scanner.nextInt();
        ArrayList<Integer> salesValues = new ArrayList<Integer>();

        for (int i = 0; i < sales; i++) {
            System.out.println("Enter value of sale:");
            salesValues.add(scanner.nextInt());
        }

        double wage = 200;
        int running = 0;
        for (Integer value : salesValues) {
            if (value > 200) {
                wage += value * 0.05;
            }
            running += value;
        }
        
        if (running > 2000) {
            wage += 50;
        }

        System.out.println("You earned $" + wage + " this week.");

        scanner.close();
    }
}
