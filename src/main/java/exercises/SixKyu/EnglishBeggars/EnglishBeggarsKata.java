package exercises.SixKyu.EnglishBeggars;

import java.util.Arrays;

public class EnglishBeggarsKata {
    public static void main(String[] args) {

        int[] arrA = beggar(new int[]{1, 2, 3, 4, 5}, 0);

    }

    public static int[] beggar(int[] values, int n) {
        if (n == 0) return new int[]{};

        int[] returnArray = new int[n];
        int k = 0;

        while (true) {
            for (int i = 0 ; i < n ; i++) {
                if (i + k > values.length - 1) return returnArray;
                returnArray[i] += values[i + k];
            }
            k += n;
        }

    }
}
