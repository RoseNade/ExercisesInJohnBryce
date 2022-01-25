package exercises14;

import java.util.Random;

public class Exercise10 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        Random random = new Random();
        int max = 0;
        int maxIdx = 0;
        int min = 101;
        int minIdx = 0;
        int sum = 0;
        int sumEvenNumbers = 0;
        int sumUnevenNumbers = 0;


        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100) + 1;
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        for (int i = 0; i <arr.length ; i++) {
            sum += arr[i];
            if(arr[i] >= max){
                max = arr[i];
                maxIdx = i;
            }else if(arr[i] <= min) {
                min = arr[i];
                minIdx = i;
            }
            if(arr[i] % 2 == 0){
                sumEvenNumbers += arr[i];
            } else{
                sumUnevenNumbers += arr[i];
            }

        }

        float avg = sum/arr.length;

        System.out.printf("max number is: %d\n", max);
        System.out.printf("max number index is: %d\n", maxIdx);
        System.out.printf("min number is: %d\n", min);
        System.out.printf("min number index is: %d\n", minIdx);
        System.out.printf("sum of numbers in the array is: %d\n", sum);
        System.out.printf("avg of numbers in the array is: %.1f\n", avg);
        System.out.printf("sum of even numbers in the array is: %d\n", sumEvenNumbers);
        System.out.printf("sum of uneven numbers in the array is: %d\n", sumUnevenNumbers);
    }
}
