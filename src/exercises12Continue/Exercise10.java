package exercises12Continue;

public class Exercise10 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            int j = factorial(i);
            System.out.println(j);
        }
    }


    public static int factorial(int x) {
        int s = 1;
        for (int i = 2; i <= x; i++) {
            s *= i;
        }
        return s;
    }
}
