package exercises.EightKyu.SumOfPositive;

import java.util.Arrays;

public class SumOfPositiveKata {

    public static int sum(int[] arr){
        return Arrays.stream(arr).filter(value -> value >= 0).sum();
    }
}
