package exercises12Continue;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;
        int count = 0;
        int average = 0;

        while (num >= 0) {
            sum += num;
            num = sc.nextInt();
            count++;
        }
        if(count == 0){
            System.out.println("yikes mate, you tried to divide by zero");
        }else {
            average = sum / count;
            System.out.println(average);
        }
    }
}
