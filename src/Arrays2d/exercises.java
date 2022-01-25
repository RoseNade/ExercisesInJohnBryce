package Arrays2d;

import java.util.Random;

public class exercises {
    public static void main(String[] args) {
        Random random = new Random();
        int[][] students = new int[3][10];
        double totalAvg = 0;
        double maxAvg = 0;
        int maxIdx = 0;
        double minAvg = 100;
        int minIdx = 0;
        for (int i = 0; i < students.length; i++) {
            double avg = 0;
            int sum = 0;
            for (int j = 0; j < students[i].length; j++) {
                int grade = random.nextInt(41) + 60;
                students[i][j] = grade;
                sum += grade;
            }
            avg = sum / 10.0;
            System.out.printf("average for student %d: %f", i, avg);
            System.out.println();
            totalAvg += avg;
            if (avg > maxAvg) {
                maxAvg = avg;
                maxIdx = i + 1;
            }
            if (minAvg > avg) {
                minAvg = avg;
                minIdx = i + 1;
            }
        }
        totalAvg = totalAvg / 3;
        System.out.printf("average overall is: %f\n", totalAvg);
        System.out.printf("lowest average overall is student's %d\n", minIdx);
        System.out.printf("highest average overall is student's %d\n", maxIdx);
    }
}
