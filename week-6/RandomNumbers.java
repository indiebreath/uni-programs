import java.util.Random;

public class RandomNumbers {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] numbers = new int[50];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt(100, 200);
            System.out.println(numbers[i]);
        }

        int smallestNumber = 200;
        int largestNumber = 0;
        for (int num : numbers) {
            if (num > largestNumber) {
                largestNumber = num;
            }
            
            if (num < smallestNumber) {
                smallestNumber = num;
            }
        }

        int odd = 0;
        int even = 0;
        for (int num : numbers) {
            if (num % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }

        System.out.println("Smallest number: " + smallestNumber);
        System.out.println("Largest number: " + largestNumber);
        System.out.println("Odd numbers: " + odd);
        System.out.println("Even numbers: " + even);
    }
}
