package exercises14Continuation;

public class Exercise9 {
    public static void main(String[] args) {
        int a1 = 1;
        int a2 = 1;
        int sumEven = 0;
        int sumUneven = 2;

        int[] arr = new int[15];
        arr[0] = 1;
        arr[1] = 1;
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        for (int i = 2; i < arr.length; i++) {
            a2 = a2 + a1;
            a1 = a2 - a1;
            arr[i] = a2;
            System.out.println(arr[i]);
            if(a2 % 2 == 0){
                sumEven += a2;
            }else{
                sumUneven += a2;
            }
        }
        System.out.printf("Sum of even numbers: %d\n", sumEven);
        System.out.printf("Sum of uneven numbers: %d\n", sumUneven);
        if(sumEven > sumUneven){
            System.out.printf("Even sum is bigger");
        }else if(sumUneven < sumEven){
            System.out.printf("Uneven sum is bigger");
        }else{
            System.out.println("Same dawg");
        }
    }
}
