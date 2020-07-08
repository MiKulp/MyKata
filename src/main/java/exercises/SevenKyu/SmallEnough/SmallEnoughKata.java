package exercises.SevenKyu.SmallEnough;

import java.util.stream.IntStream;

public class SmallEnoughKata {

    public static boolean smallEnough(int[] a, int limit) {

    return IntStream.of(a).max().getAsInt() <= limit;

    }
}
