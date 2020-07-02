package exercises.SevenKyu.OddOrEven;

import java.util.stream.IntStream;

public class EvenOrOddKata {

    public static String oddOrEven(int[] array) {

        return IntStream.of(array).sum() % 2 == 0 ? "even" : "odd";
    }
}
