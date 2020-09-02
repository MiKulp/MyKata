package exercises.SevenKyu.ArrayElementParity;

import java.util.stream.IntStream;

public class ParityKata {

    public static int solve(int[] arr) {

        return IntStream.of(arr).distinct().sum();

    }
}
