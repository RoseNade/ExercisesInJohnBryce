// to do, find every fibonacci sequence between two random numbers and also the biggest even number

package exercises12;

import java.util.Random;

public class Exercise9 {
    public static void main(String[] args) {
        Random random = new Random();

        int a1 = 1;
        int a2 = 1;
        int start = random.nextInt(196) + 5;
        int end = random.nextInt(196) + 5;
        end = Math.max(start, end);
        start = Math.min(start, end);
        System.out.println(start);
        System.out.println(end);

        int maxEven = 0;

        while (a2 < end) {
            if (a2 >= start) {
                System.out.println(a2 + " ");
                if (a2 > maxEven && a2 % 2 == 0) {
                    maxEven = a2;
                }
            }

            a2 = a2 + a1;
            a1 = a2 - a1;
        }

        if(maxEven != 0){
            System.out.println("Max even number is:" + maxEven);
        }

    }
}
