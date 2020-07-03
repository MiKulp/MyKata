package exercises.SevenKyu.SumOfFirstNthElements;

import java.util.stream.DoubleStream;

public class SumKata {
    public static void main(String[] args) {
        System.out.println(seriesSum(58));
    }

    public static String seriesSum(int n) {

        return String.format("%.2f", (double) Math.round
                (DoubleStream.iterate(1, i -> i + 3)
                        .limit(n)
                        .map(operand -> 1 / operand)
                        .sum() * 100) / 100)
                        .replace(",", ".");
    }
}
