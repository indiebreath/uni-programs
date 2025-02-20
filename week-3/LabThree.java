import java.util.ArrayList;
import java.util.Scanner;

public class LabThree {
    static void Maths() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number: ");
        Double numOne = scanner.nextDouble();

        System.out.println("Enter second number: ");
        Double numTwo = scanner.nextDouble();

        Double sum = numOne + numTwo;
        Double diff = numOne - numTwo;
        Double prod = numOne * numTwo;
        Double quot = numOne / numTwo;

        System.out.println("Results:");
        System.out.println("Sum: " + Double.toString(sum));
        System.out.println("Difference: " + Double.toString(diff));
        System.out.println("Product: " + Double.toString(prod));
        System.out.println("Quotient: " + Double.toString(quot));

        scanner.close();
    }

    static void NamesAndAges() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<String>();
        ArrayList<String> ages = new ArrayList<String>();

        System.out.println("Enter first name: ");
        names.add(scanner.nextLine());

        System.out.println("Enter first age: ");
        ages.add(scanner.nextLine());

        System.out.println("Enter second name: ");
        names.add(scanner.nextLine());

        System.out.println("Enter second age: ");
        ages.add(scanner.nextLine());

        System.out.println("Enter third name: ");
        names.add(scanner.nextLine());

        System.out.println("Enter third age: ");
        ages.add(scanner.nextLine());

        System.out.println("Enter fourth name: ");
        names.add(scanner.nextLine());

        System.out.println("Enter fourth age: ");
        ages.add(scanner.nextLine());

        System.out.println("Enter fifth name: ");
        names.add(scanner.nextLine());

        System.out.println("Enter fifth age: ");
        ages.add(scanner.nextLine());

        for (Integer i = 0; i < names.size(); i++) {
            System.out.println("Name: " + names.get(i));
            System.out.println("Age: " + ages.get(i) + "\n");
        }
        scanner.close();
    }

    static void Calculate() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number: ");
        Double number = scanner.nextDouble();

        System.out.println("Enter second number: ");
        number += scanner.nextDouble();

        System.out.println("Enter third number: ");
        number += Double.parseDouble(scanner.nextLine());

        System.out.println("Enter fourth number: ");
        number += Double.parseDouble(scanner.nextLine());

        System.out.println("Total: " + number);

        scanner.close();
    }

    static void Name() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your first name: ");
        String firstName = scanner.nextLine();

        System.out.println("Enter last name: ");
        String lastname = scanner.nextLine();
    }

    public static void main(String[] args) {
        Maths();
        // NamesAndAges();
        // Calculate();
    }
}
