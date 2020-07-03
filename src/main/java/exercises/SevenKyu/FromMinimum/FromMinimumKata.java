package exercises.SevenKyu.FromMinimum;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FromMinimumKata {

    public static int minValue(int[] values){

    return Integer.parseInt(IntStream.of(values)
                    .distinct()
                    .sorted()
                    .mapToObj(String::valueOf)
                    .collect(Collectors.joining()));
    }

}
