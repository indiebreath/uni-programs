import java.util.Scanner;

public class Intervals {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter lower limit:");
        int lowerLimit = scanner.nextInt();

        System.out.println("Enter upper limit:");
        int upperLimit = scanner.nextInt();

        System.out.println("Enter number:");
        int number = scanner.nextInt();

        if (number >= lowerLimit && number <= upperLimit) {
            System.out.println("Number is within the interval.");
        } else {
            System.out.println("Number is outside of the interval.");
        }

        scanner.close();
    }
}
