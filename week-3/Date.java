import java.util.Scanner;

public class Date {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter day (Monday, Tuesday, etc.): ");
        String day = scanner.nextLine();

        System.out.println("Enter date (26, 21, 31, etc.): ");
        Integer date = scanner.nextInt();

        System.out.println("Enter month: ");
        String month = scanner.nextLine();

        System.out.println("Enter year: ");
        Integer year = scanner.nextInt();

        System.out.println("American Format: ");
        System.out.println(day + " " + month + " " + date + " " + year);

        System.out.println("European Format: ");
        System.out.println(day + " " + date + " " + month + " " + year);

        System.out.println("Japanese Format: ");
        System.out.println(year + " " + month + " " + date + " " + day);

        scanner.close();
    }
}
