public class Temperatures {
    public static void main(String[] args) {
        int[][] temperatures = { {12, 18, 13}, {19, 21, 14}, {1, 2, 3}, {4, 5, 6},
            {7, 8, 9}, {10, 11, 12}, {13, 14, 15} };
        String[] days = { "Sunday", "Monday", "Tuesday", "Wednesday",
            "Thursday", "Friday", "Saturday" };
        String[] times = { "Morning", "Afternoon", "Evening" };

        for (int i = 0; i < days.length; i++) {
            for (int j = 0; i < times.length; i++) {
                System.out.println(days[i] + " " + times[j]
                    + " Temperature: " + temperatures[i][j]);
            }
        }
    }
}
