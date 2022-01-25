package exercises12Continue;

import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        while (num != 0) {
            boolean isPrime = true;
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    isPrime = false;
                }
            }
            if(isPrime == true){
                System.out.println("Prime");
            }else{
                System.out.println("Not prime");
            }
            num = sc.nextInt();
        }
        sc.close();
    }
}
