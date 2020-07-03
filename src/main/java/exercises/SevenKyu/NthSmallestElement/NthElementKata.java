package exercises.SevenKyu.NthSmallestElement;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class NthElementKata {

    public static int nthSmallest(final int[] arr, final int n) {

        return IntStream.of(arr)
                .sorted()
                .boxed()
                .collect(Collectors.toList())
                .get(n-1);
    }

}
