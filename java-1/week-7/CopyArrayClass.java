import java.util.Arrays;

public class CopyArrayClass {
    public static void main(String[] args) {
        int[] originalArray = {3, 18, 12, 4, 9};
        int[] copyArray = Arrays.copyOf(originalArray, 5);

        System.out.println("Original: " + originalArray);
        System.out.println("Copy: " + copyArray);

        for (int i = 0; i < originalArray.length; i++) {
            System.out.println("Original Array Index " + i + ": " + originalArray[i]);
            System.out.println("Copied Array Index " + i + ": " + copyArray[i]);
        }

        Arrays.sort(copyArray);

        System.out.println("\nSorted values:");
        for (int i = 0; i < originalArray.length; i++) {
            System.out.println("Original Array Index " + i + ": " + originalArray[i]);
            System.out.println("Copied Array Index " + i + ": " + copyArray[i]);
        }
    }
}
