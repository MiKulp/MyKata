package exercises.SixKyu.FindTheOddInt;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindOdd {

    public static void main(String[] args) {
        int n = findIt(new int[]{20, 1, -1, 2, -2, 3, 3, 5, 5, 1, 2, 4, 20, 4, -1, -2, 5});
        System.out.println(n);
    }

    public static int findIt(int[] a) {
        List<Integer> list = Arrays.stream(a).boxed().collect(Collectors.toList());
        Map<Integer, Long> mapFromList = list.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        Optional <Integer> returnInt = mapFromList.entrySet().stream()
                .filter(integerLongEntry -> integerLongEntry.getValue() % 2 != 0)
                .map(integerLongEntry -> integerLongEntry.getKey())
                .findFirst();

        return returnInt.get();
    }

}
