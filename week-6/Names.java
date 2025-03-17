import java.util.Arrays;
import java.util.Scanner;

public class Names {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] names = new String[4];

        for (int i = 0; i < names.length; i++) {
            System.out.println("Enter name:");
            names[i] = scanner.nextLine();
        }

        for (String element : names) {
            System.out.println(element);
        }

        System.out.println("Enter name to search for:");
        String search = scanner.nextLine();

        boolean result = Arrays.asList(names).contains(search);
        if (result) {
            System.out.println("The name " + search + " was found in the array;");
        } else {
            System.out.println("The name " + search + " was not found in the array;");
        }
    }
}
