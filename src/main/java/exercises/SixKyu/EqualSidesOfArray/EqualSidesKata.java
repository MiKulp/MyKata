package exercises.SixKyu.EqualSidesOfArray;

import java.util.Arrays;

public class EqualSidesKata {
    public static void main(String[] args) {
        int result = findEvenIndex(new int[]{4, 5, 6, 7, 8, 9, 10, 9, 8, 7, 6, 5, 4});
        System.out.println(result);
    }

    public static int findEvenIndex(int[] arr) {

        int a, b;

        for (int i = 0 ; i < arr.length ; i++) {

            int[] arrayA = Arrays.copyOfRange(arr, 0, i);
            int[] arrayB = Arrays.copyOfRange(arr, i + 1, arr.length);

            if (Arrays.stream(arrayA).sum() == Arrays.stream(arrayB).sum())
                return i;

        }

        return -1;
    }
}
