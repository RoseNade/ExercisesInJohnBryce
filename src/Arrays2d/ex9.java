package Arrays2d;

import java.util.Arrays;

public class ex9 {
    public static void main(String[] args) {
        int[][] arr = new int[10][10];
        for (int i = 1; i <= 5; i++) {
            fill(arr, i);
        }
        print(arr);
    }

    public static void fill(int[][] arr, int num){
        for (int i = num - 1; i < arr.length - num + 1; i++) {
            if (i == num - 1 || i == arr.length - num) {
                for (int j = num - 1; j < arr[i].length - num + 1; j++) {
                        arr[i][j] = num;
                        arr[j][i] = num;
                    }
                }
        }
    }

    public static void print(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
