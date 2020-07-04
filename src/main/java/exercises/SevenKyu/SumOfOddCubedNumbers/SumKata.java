package exercises.SevenKyu.SumOfOddCubedNumbers;

import java.util.stream.IntStream;

public class SumKata {
    public static void main(String[] args) {
        System.out.println(cubeOdd(new int[]{1, 2, 3, 4}));
    }

     public static int cubeOdd(int[] arr) {

      return (int) IntStream.of(arr).filter(value -> value % 2 != 0).mapToDouble(value -> (double) value).map(operand ->  Math.pow(operand, 3)).sum();
    }

}
