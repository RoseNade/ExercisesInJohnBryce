package exercises14;

public class Exercise4 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,1,2,3,3,2,1,9,5,1,1,9};

        int num3 = 0;
        int num1 = 0;
        int num2or5 = 0;

        for (int i = 0; i < arr.length; i++) {
                if(arr[i] == 3){
                    num3++;
                }else if(arr[i] == 1){
                    num1++;
                }else if(arr[i] == 2 || arr [i] == 5){
                    num2or5++;
                }
        }
        System.out.printf("amount of the number 3: %d\n", num3);
        System.out.printf("amount of the number 1: %d\n", num1);
        System.out.printf("amount of the numbers 2,5: %d", num2or5);
    }
}
