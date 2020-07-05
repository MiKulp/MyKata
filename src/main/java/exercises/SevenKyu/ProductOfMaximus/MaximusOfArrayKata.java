package exercises.SevenKyu.ProductOfMaximus;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class MaximusOfArrayKata {

    public static long maxProduct(int[] numbers, int sub_size) {

        Arrays.stream(numbers).forEach(System.out::println);
        System.out.println("***");

        if (sub_size == 0) return 0;

        List<Integer> workList = Arrays.stream(numbers)
                .boxed()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());

        return workList
                .subList(0, sub_size)
                .stream().sorted(Comparator.reverseOrder())
                .mapToLong(Long::valueOf)
                .reduce((integer, integer2) -> ( integer * integer2)).orElse(-1);



    }
}
