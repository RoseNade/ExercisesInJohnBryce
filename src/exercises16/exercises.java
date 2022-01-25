package exercises16;

import java.util.Random;
import java.util.Scanner;

public class exercises {
    public static void main(String[] args) {
        Random random = new Random();
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(401) - 200;
        }
        System.out.println(sum(arr));;
    }

    public static void rectangleStar(int side){
        String[][] arr = new String[side][side];
        for (int i = 0; i < side; i++) {
            for (int j = 0; j < side; j++) {
                arr[i][j] = "* ";
            }
            System.out.println();
        }
    }

    public static int firstAppearance(int[] arr, int num){
        int idx = 0;
        for (int i = 0; i < arr.length; i++) {
            if(contains(arr, num)){
                return i;
            }
        }
        return -1;
    }

    public static boolean contains(int[] arr, int num){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == num){
                return true;
            }
        }
        return false;
    }

    public static int maxIdx(int[] arr){
        int maxIdx = 0;
        int maxNum = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > maxNum){
                maxNum = arr[i];
                maxIdx = i;
            }
        }
        return maxIdx;
    }

    public static int sum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public static void showArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static boolean isPrime(int num) {
        for (int i = 2; i < num / 2; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int maxNum(int a, int b, int c) {
        if (a > b) {
            int tmp = a;
            a = b;
            b = tmp;
        }
        if (b > c) {
            int tmp = b;
            b = c;
            c = tmp;
        }
        return c;
    }

    public static int ranNumBetweenTwoNumbers(int min, int max) {
        int range = max - min + 1;
        return (int) (Math.random() * range) + min;
    }

    public static double avgOfShorts(short num1, short num2, short num3, short num4, short num5) {
        double avg = (num1 + num2 + num3 + num4 + num5) / 5.0;
        return avg;
    }

    public static void even2to200() {
        for (int i = 0; i <= 200; i += 2) {
            System.out.println(i);
        }
    }

    public static void f3() {
        System.out.println("f3");
    }

    public static void f2() {
        System.out.println("f2");
        f3();
    }

    public static void f1() {
        System.out.println("f1");
        f2();
    }

    public static void name() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name:");
        String name = sc.nextLine();
        System.out.print(name + "\n");
        sc.close();
    }
}
