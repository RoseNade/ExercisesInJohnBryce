package exercises14;

import java.util.Random;

public class Exercise6 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] intArr = new int[10];

        for (int i = 0; i < intArr.length; i++) {
            intArr[i] = random.nextInt(90) + 10;
        }

        int max = intArr[0];

        for (int i = 0; i < intArr.length; i++) {
            System.out.println(intArr[i]);
            if (intArr[i] >= max) {
                max = intArr[i];
            }
        }
        System.out.printf("max number is: %d", max);
    }
}
