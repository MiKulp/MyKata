package exercises.SevenKyu.MaximumGap;

import java.util.Arrays;

public class MaxGapKata {


    public static int maxGap(int[] numbers) {

        Arrays.stream(numbers).forEach(System.out::println);

        Arrays.sort(numbers);
        int n = numbers[0] - numbers[1];

        for (int i = 2 ; i < numbers.length ; i++) {
            if (n < (numbers[i-1] - numbers[i])) n = (numbers[i-1] - numbers[i]);
        }

        return n;
    }
}
