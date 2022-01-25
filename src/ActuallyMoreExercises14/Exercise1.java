package ActuallyMoreExercises14;

import java.util.*;

// to do: given two arrays, make a new array where the numbers that appear in the first array and don't appear in the second array
// should come out as: [3 ,  7 ,  6 , 0  ,  7,  0 , 0 ,  0 ,  0]
public class Exercise1 {
    public static void main(String[] args) {
        int[] arr1 = {3 ,  2 ,  7 , 6 , 4 ,  2 ,  1 ,  7 , 9 ,  4};
        int[] arr2 = {8 ,  2 ,  9 , 8 , 4 ,  2 ,  1 ,  4 , 9 ,  1};
        System.out.println(Arrays.toString(noElements(arr1, arr2)));
    }

    /**
     * take an array and return the max number, min number, amount of ones
     * @param arr
     * @return max number, min number, amount of ones
     */
    public static int[] maxMinOnes(int[] arr) {
        int length = arr.length - 1;
        int[] result = new int[3];
        int countOnes = 0;
        // sort the array using the algorithm we made to be from smallest to highest
        sortWithBubble(arr);

        // count the ones
        for (int i = 0; i < length; i++) {
            if(arr[i] == 1){
                countOnes++;
            }
        }
        result[0] = arr[length]; // max number
        result[1] = arr[0]; // min number
        result[2] = countOnes; // amount of ones
        return result;
    }

    /**
     * return the number that exists in an array without the zeroes at the end of it, need to pay attention to zeroes in the middle
     * @param arr
     * @return number that exists in an array without the zeroes at the end of it, need to pay attention to zeroes in the middle
     */
    public static int numInArray(int[] arr) {
        int length = arr.length - 1;
        int count = 0;
        int num = 0;
        for (int i = length; i >= 0; i--) {
            if (arr[i] != 0 || count > 0) {
                num += arr[i] * Math.pow(10, count);
                count++;
            }
        }
        return num;
    }

    /**
     * bubble sort an array
     * @param arr
     * @return new sorted array
     */
    public static int[] sortWithBubble(int[] arr) {
        int tmp;
        int n = arr.length - 1;
        for (int i = 0; i < n; i++) {
            boolean swap = false;
            for (int j = 0; j < n; j++) {
                if (arr[j] > arr[j + 1]) {
                    tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                    swap = true;
                }
            }

            if (swap == false) {
                break;
            }
        }
        return arr;
    }

    /**
     * reverse an array
     * @param arr
     * @return reversed array
     */
    public static int[] reverse(int[] arr) {
        int tmp;
        for (int i = 0; i < arr.length / 2; i++) {
            tmp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = tmp;
        }
        return arr;
    }

    /**
     * check if a number exists in an array
     * @param arr
     * @param num
     * @return if a number exists in an array
     */
    public static boolean contains(int[] arr, int num) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                return true;
            }
        }
        return false;
    }

    /**
     * add only unique elements to a new array
     * @param arr
     * @return only unique elements to a new array
     */
    public static int[] noDupes(int[] arr) {
        int[] result = new int[10];
        int idx = 0;
        for (int i = 0; i < arr.length; i++) {
            if (!contains(result, arr[i])) {
                result[idx++] = arr[i];
            }
        }
        return result;
    }

    /**
     * check 2 arrays for unique elements and add the unique elements to a new array and no dupes
     * @param arr1
     * @param arr2
     * @return an array with unique elements and no dupes
     */
    public static int[] noElements(int[] arr1, int[] arr2) {
        int[] arr = new int[10];
        int idx = 0;

        for (int i = 0; i < arr.length; i++) {
            if (!contains(arr2, arr1[i])) {
                arr[idx++] = arr1[i];
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if (!contains(arr1, arr2[i])) {
                arr[idx++] = arr2[i];
            }
        }

        return noDupes(arr);
    }
}
