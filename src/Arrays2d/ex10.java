package Arrays2d;

import java.util.Random;

public class ex10 {
    public static void main(String[] args) {
        Random random = new Random();
        int[][] arr = new int[10][10];
        int sumRow = 0;
        int sumColumn = 0;
        int sumDiagonal = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                int ran = random.nextInt(10);
                arr[i][j] = ran;
                sumRow += arr[i][j];

            }
        }
        if(sumRow == sumColumn && sumRow == sumDiagonal){

        }
    }
}
