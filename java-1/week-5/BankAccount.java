import java.util.Scanner;

public class BankAccount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double balance = 0;

        System.out.println("Enter deposit amount:");
        balance += scanner.nextDouble();

        while (balance != 0) {
            System.out.println("You have $" + balance + " in your account.");
            System.out.println("Enter withdrawal amount:");
            double withdrawal = scanner.nextDouble();

            if (balance - withdrawal >= 0) {
                balance -= withdrawal;
                System.out.println("Transcation complete.");
            } else {
                System.out.println("Error, withdrawal amount greater than remaining balance.");
            }
        }

        System.out.println("Account balance is $0. Ending session.");
    }
}
