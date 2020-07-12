package exercises.SevenKyu.BetweenExtremes;

import java.util.stream.IntStream;

public class ExtremesKata {


    public static int betweenExtremes(int[] numbers) {

        return IntStream.of(numbers).max().getAsInt() - IntStream.of(numbers).min().getAsInt();
    }
}
