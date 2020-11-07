package exercises.SevenKyu.TwoDimensionalArr;

import java.util.Arrays;

public class TwoDimensionalKata {

    public static void main(String[] args) {

    }

    public static int[] flattenAndSort(int[][] array) {

        return Arrays.stream(array)
                .flatMapToInt(Arrays::stream)
                .sorted()
                .toArray();

    }
}
