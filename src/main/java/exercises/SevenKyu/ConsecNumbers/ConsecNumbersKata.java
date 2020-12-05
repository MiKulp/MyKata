package exercises.SevenKyu.ConsecNumbers;

import java.util.Arrays;

public class ConsecNumbersKata {

    public static void main(String[] args) {


    }

    public static int consecutive(final int[] arr) {

        if (arr.length < 2) return 0;

        Integer max = Arrays.stream(arr)
                .max()
                .getAsInt();

        Integer min = Arrays.stream(arr)
                .min()
                .getAsInt();

        return ((max - min)+1) - arr.length;
    }


}
