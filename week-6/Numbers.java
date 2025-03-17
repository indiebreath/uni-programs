import java.util.Arrays;
import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[4];

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Enter number:");
            numbers[i] = scanner.nextInt();
        }

        System.out.println("Enter number to search for:");
        int search = scanner.nextInt();

        Arrays.sort(numbers);

        int result = Arrays.binarySearch(numbers, search);
        boolean found = result >= 0 ? true : false;

        int smallestNumber = numbers[0];
        int largestNumber = numbers[3];

        if (found) {
            System.out.println("The number " + search + " is in the array;");
        } else {
            System.out.println("The number " + search + " is not in the array.");
        }

        System.out.println("The smallest number is " + smallestNumber + ".");
        System.out.println("The largest number is " + largestNumber + ".");

        scanner.close();
    }
}
