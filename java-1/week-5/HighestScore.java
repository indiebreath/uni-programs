import java.util.ArrayList;
import java.util.Scanner;

public class HighestScore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number of students in class:");
        int[] scores = new int[scanner.nextInt()];
        int highestScore = 0;
        int highestScoreIndex = 0;

        for (int i = 0; i < scores.length; i++) {
            System.out.println("Enter score for student #" + i + ":");
            scores[i] = scanner.nextInt();
            if (scores[i] > highestScore) {
                highestScore = scores[i];
                highestScoreIndex = i;
            }
        }

        System.out.println("The highest score was " + highestScore + " belonging to student #" + highestScoreIndex + ".");
    }
}
