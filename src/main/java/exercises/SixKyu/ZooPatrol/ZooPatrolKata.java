package exercises.SixKyu.ZooPatrol;

import java.util.Arrays;

public class ZooPatrolKata {


    public static int findMissingNumber(int[] numbers) {

        double length = numbers.length;

//        double sumAllElements = (1.0 + (length + 1.0)) / 2.0 * (length + 1.0);
//        double sumPassElements = Arrays.stream(numbers).sum();

        return (int) ((1.0 + (length + 1.0)) / 2.0 * (length + 1.0)) - (Arrays.stream(numbers).sum());
    }
}
