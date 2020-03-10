package exercises.SevenKyu.HighestAndLowest;

import java.util.Arrays;

public class HighestAndLowestKata {

    public static void main(String[] args) {
        System.out.println(
highAndLow("8 3 -5 42 -1 0 0 -9 4 7 4 -4"));
    }

    public static String highAndLow(String numbers) {
        // Code here or

        String [] arrayString = numbers.split(" ");
        int max = Arrays.stream(arrayString).map(s -> Integer.valueOf(s)).max(Integer::compareTo).get();
        int min = Arrays.stream(arrayString).map(s -> Integer.valueOf(s)).min(Integer::compareTo).get();

        return (max + " " + min);
    }
}
