package exercises.SixKyu.SortOddNumbers;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class OddNumbers {

    public static void main(String[] args) {

    }

    public static int[] sortArray(int[] array) {
        int n = 0;

        List <Integer> listInt =
                Arrays.stream(array).filter(value -> (value & 1) != 0).sorted().boxed().collect(Collectors.toList());

        for (int i = 0 ; i < array.length ; i++) {
            if ((array[i] & 1) != 0) {
                array[i] = listInt.get(n);
                n++;
            }
        }

        return array;
    }

}
