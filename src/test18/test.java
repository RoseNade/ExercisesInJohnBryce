package test18;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = num1;

        while (num1 <= num2) {
            num3 = num1;
            while (num3 > 0) {
                if (num3 % 10 == 7) {
                    num3 = 7;
                    break;
                }
                num3/=10;
            }
            if (num1 % 7 == 0 || num3 == 7) {
                System.out.println("BOOM!");
            } else {
                System.out.println(num1);
            }
            num1++;
        }
    }
}
