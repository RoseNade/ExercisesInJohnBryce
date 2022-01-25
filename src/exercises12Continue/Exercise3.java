package exercises12Continue;

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        while(num != 0){
            System.out.println(factorial(num));
            num = sc.nextInt();
        }

        sc.close();
    }

    public static int factorial(int x) {
        int s = 1;
        for (int i = 2; i <= x; i++) {
            s *= i;
        }
        return s;
    }
}
