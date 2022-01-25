package Arrays2d;

public class ex9 {
    public static void main(String[] args) {
        int[][] arr = new int[10][10];
        int length = arr.length - 1;
        // when i = 0 --> 1, 1, 1, 1, 1, 1
        // when i = arr.length-1 --> 1, 1, 1, 1, 1, 1

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = 2;
                if(i == 0 || i == length) {
                    arr[i][j] = 1;
                }
                arr[i][0] = 1;
                arr[i][length] = 1;
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
