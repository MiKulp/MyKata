package exercises.ExcersisesWithTDD.SevenKyu.MaximumTripetSum;

import java.util.Arrays;
import java.util.Comparator;

public class MaximumTDDkata {

    public static int maxTriSum(int[] numbers) {

        return Arrays.stream(numbers)
                .boxed()
                .sorted(Comparator.reverseOrder())
                .distinct()
                .limit(3)
                .mapToInt(Integer::intValue)
                .sum();

    }
}
