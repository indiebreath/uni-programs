public class CopyArray {
    public static void main(String[] args) {
        int[] originalArray = {3, 8, 12};

        int[] copyArray = originalArray;

        System.out.println("Original: " + originalArray);
        System.out.println("Copy: " + copyArray);

        for (int i = 0; i < originalArray.length; i++) {
            System.out.println("Original Array Index " + i + ": " + originalArray[i]);
            System.out.println("Copied Array Index " + i + ": " + copyArray[i]);
        }
    }
}
