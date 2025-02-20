import java.util.Random;
import java.util.Scanner;

public class NumberGuess {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int number = random.nextInt(100) + 1;

        System.out.println("I am thinking of a number between 1 and 100 (includive).\nCan you guess what it is?");
        int input = scanner.nextInt();

        System.out.println("Your guess is: " + input);
        System.out.println("The number I was thinking of is: " + number);
        System.out.println("You were off by " + Math.abs((number - input)));

        scanner.close();
    }
}
