package exercises17;

import java.util.Arrays;
import java.util.Scanner;

public class exercise1 {
    private static Scanner sc = new Scanner(System.in);
    private static int numOfMistakes = 0; // num of mistakes till he goes BANANAS
    private static final int answer = random(); // answer in decimal
    private static final int[] numInBinary = numToBinary(answer); // answer in binary
    private static String[] arr = new String[5];

    public static void main(String[] args) {
        System.out.println(answer);
        intro();
        show();
        guess();
        return;
    }

    /**
     * take a decimal number, show it in binary
     * @param num
     * @return the number in binary
     */
    public static int[] numToBinary(int num) {
        int[] binary = new int[5];
        int index = binary.length - 1;
        while (num > 0) {
            binary[index--] = num % 2;
            num /= 2;
        }
        return binary;
    }

    /**
     *
     * @return new arr
     */
    public static void show(){
        for (int i = 0; i < arr.length; i++) {
            arr[i] = "-";
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void showNewArr(String[] hidden, int[] binary){
        for (int i = 0; i < numOfMistakes; i++) {
            hidden[hidden.length - 1 - i] = String.valueOf(binary[binary.length - 1 - i]);
        }
        System.out.println();
        for (String i: hidden) {
            System.out.print(i);
        }
        System.out.println();
    }

    public static void guess() {
        System.out.println("Please guess a number:");
        int userGuess = sc.nextInt();
        if(userGuess != answer){
            incorrect();
        }else{
            correct();
        }
    }

    public static void correct(){
        System.out.println("Winner winner chicken dinner\uD83C\uDFC6\uD83C\uDFC6\n");
        end();
    }

    public static void incorrect(){
        System.out.println("Incorrect answer");
        if(numOfMistakes != 4){
            numOfMistakes++;
            showNewArr(arr, numInBinary);
            guess();
        }else{
            System.out.println("Loser");
            end();
        }
    }

    public static void intro(){
        System.out.println("Welcome to my guessing game between numbers 1-16");

    }

    public static int random() {
        System.out.println("I will now generate a random number between 1-16");
        int number = (int) (Math.random() * 16 + 1);
        return number;
    }

    public static void end(){
        System.out.print("Answer in binary:");
        for (int i = 0; i < numInBinary.length; i++) {
            System.out.print(numInBinary[i]);
        }
        System.out.println();
        System.out.println("Answer is decimals: " + answer);
    }
}
