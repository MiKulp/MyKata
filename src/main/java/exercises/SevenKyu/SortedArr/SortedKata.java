package exercises.SevenKyu.SortedArr;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SortedKata {

    public static void main(String[] args) {
        System.out.println(isSortedAndHow(new int[]{1, 5, 9, 3, 8}));
    }

    public static String isSortedAndHow(int[] array) {

        String first = IntStream.of(array).mapToObj(String::valueOf).collect(Collectors.joining(""));



        int[] sortedArray = Arrays.copyOf(array, array.length);
        Arrays.sort(sortedArray);

        String sorted = IntStream.of(sortedArray).mapToObj(String::valueOf).collect(Collectors.joining(""));
        String sortedDesc = new StringBuilder(sorted).reverse().toString();


        System.out.println("first  "+first);
        System.out.println("sorted  "+sorted);
        System.out.println("sortedDesc  "+sortedDesc);

        if (first.equals(sorted)) return "yes, ascending";
        else if (first.equals(sortedDesc)) return "yes, descending";

        return "no";
    }
}
