package exercises12Continue;

import java.util.Scanner;

public class Exercise9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lines = sc.nextInt();
        int columns = sc.nextInt();

        for (int i = 1; i <= lines; i++) {
            for (int j = 1; j <= columns; j++) {
                System.out.print('*' + " ");
            }
            System.out.println();
        }
    }
}
