package test18;

import java.sql.SQLOutput;
import java.util.Scanner;

public class exercise3 {
    private static char[][] arr = new char[3][3];
    private static char s = 'X';
    private static Scanner sc = new Scanner(System.in);
    private static boolean user1Turn = true;
    private static int turnsPassed = 1;

    public static void main(String[] args) {
        fillArray();
        show();
        input();
        sc.close();
    }


    public static void checkTurn() {
        if (user1Turn) {
            System.out.println("X's turn");
            s = 'X';
        } else {
            System.out.println("O's turn");
            s = 'O';
        }
    }

    // could've used switch but this is a lot more tidier
    public static void whereTo(char[][] arr, int input){
        int row = (input - 1) / 3;
        int col = input - (3*row) - 1;
        if(arr[row][col] == input + '0'){
            arr[row][col] = s;
            user1Turn = !user1Turn;
            turnsPassed++;
        }else{
            System.out.println("Invalid input");
        }
    }

    public static void input() {
        if (turnsPassed <= 9) {
            System.out.print("Choose a place to input:");
            int inputUser = sc.nextInt();
            if(inputUser > 0 && inputUser < 10){
                whereTo(arr, inputUser);
            }else{
                System.out.println("Invalid input, re-enter a number");
                input();
            }
        } else {
            System.out.println("it's a tie");
            return;
        }
        checkTurn();
        show();
        if (!checkWin(arr)) {
            input();
            return;
        }

        if (!user1Turn) {
            System.out.println("X won");
        } else {
            System.out.println("O won");
        }
    }

//    public static boolean hasPlace(char[][] arr) {
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                if (arr[i][j] != 'X' && arr[i][j] != 'O') {
//                    return false;
//                }
//            }
//        }
//        return true;
//    }


    public static boolean checkWin(char[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                // check rows
                if (arr[i][0] == arr[i][1] && arr[i][1] == arr[i][2]) {
                    return true;
                } else if (arr[0][j] == arr[1][j] && arr[1][j] == arr[2][j]) {
                    return true;
                } else if (arr[0][0] == arr[1][1] && arr[1][1] == arr[2][2]) {
                    return true;
                }
            }
        }
        return false;
    }


    public static void show() {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print("|");
                System.out.print(arr[i][j]);
            }
            System.out.print("|");
            System.out.println();
        }
    }


    public static void fillArray() {
        int counter = 1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (char) (counter++ + '0');
            }
        }
    }
}
