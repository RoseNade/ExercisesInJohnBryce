package exercises17;

import java.util.Arrays;
import java.util.Scanner;

public class exercise2 {
    private static Scanner sc = new Scanner(System.in);
    private static int sum = 0;

    private static final int[] arr1 = {1, 3, 5, 7, 9, 11, 13, 15, 19, 21, 23, 25, 27, 29, 31};
    private static final int[] arr2 = {2, 3, 6, 7, 10, 11, 14, 15, 18, 19, 22, 23, 26, 27, 30, 31};
    private static final int[] arr3 = {4, 5, 6, 7, 12, 13, 14, 15, 20, 21, 22, 23, 28, 29, 30, 31};
    private static final int[] arr4 = {8, 9, 10, 11, 12, 13, 14, 15, 24, 25, 26, 27, 28, 29, 30, 31};
    private static final int[] arr5 = {16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31};

    public static void main(String[] args) {
        start();
        choice();
        end();
    }

    public static void start() {
        System.out.println("Welcome to my magic, choose a number between 1-31");
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(arr3));
        System.out.println(Arrays.toString(arr4));
        System.out.println(Arrays.toString(arr5));
    }

    public static int choice() {
        System.out.println("Please enter in which rows your number exists: (example:1 3 5 etc.(note:spacebar is important))");
        String answer = sc.nextLine();
        String[] arr = answer.split(" ");

        //
        for (String s : arr) {
            switch (s) {
                case "1":
                    sum += arr1[0];
                    break;
                case "2":
                    sum += arr2[0];
                    break;
                case "3":
                    sum += arr3[0];
                    break;
                case "4":
                    sum += arr4[0];
                    break;
                case "5":
                    sum += arr5[0];
                    break;
                default:
                    System.out.println("YOINKERS RAGGY");
                    break;
            }
        }
        return sum;
    }

    public static void end() {
        System.out.println(sum);
        System.out.println("EZE KEF ZE LAASOT MATALOT TAIM LI BAPE");
    }
}