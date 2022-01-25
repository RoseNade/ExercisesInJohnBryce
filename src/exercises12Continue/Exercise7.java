package exercises12Continue;

import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for (int i = 1; i <= num; i++) {
            for (int j = i; j <= num; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        sc.close();

//        4
//        3 4
//        2 3 4
//        1 2 3 4
    }
}
