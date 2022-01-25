package exercises14;

public class Exercise1 {
    public static void main(String[] args) {
        char[] arr = {'a', 'b', 'c', 'a', 'b', 'd', 'r', 'c'};
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == 'a' || arr[i] == 'c'){
                count++;
            }
        }
        System.out.println(count);
    }
}
