package exercises12;

import java.util.Random;

public class Exercise10 {
    public static void main(String[] args) {
        Random random = new Random();
        int num = random.nextInt(200) + 1;

        for (int i = 1; i <= num; i++) {
            if (i % 7 == 0 || i % 10 == 7 || (i / 10) % 10 == 7) {
                System.out.println("Boom!");
            } else {
                System.out.println(i);
            }
        }
    }
}
