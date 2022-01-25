package exercises14;

public class Exercise3 {
    public static void main(String[] args) {
        int count = 0;
        String name2 = "Sara Shara Shir Cameach";
        char[] charArray2 = new char[name2.length()];


        for (int i = 0; i < charArray2.length; i++) {
            charArray2[i] = name2.charAt(i);
        }


        for (int i = 0; i < charArray2.length; i++) {
            if(charArray2[i] == 'a' || charArray2[i] == 'e' || charArray2[i] == 'i' || charArray2[i] == 'o' || charArray2[i] == 'u'){
                count++;
            }
        }
        System.out.println(count);
    }
}
