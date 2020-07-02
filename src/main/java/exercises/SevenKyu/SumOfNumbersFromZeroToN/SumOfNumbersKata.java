package exercises.SevenKyu.SumOfNumbersFromZeroToN;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SumOfNumbersKata {

    static String showSequence(final int value) {

        if (value == 0) return "0=0";

        String result = IntStream
                .rangeClosed(0, value)
                .mapToObj(i -> String.valueOf(i))
                .collect(Collectors.joining("+"));

        return value >= 0 ? result.concat(String.format("=%d", IntStream.rangeClosed(0, value).sum())) : String.format("%d<0", value);
    }

}
