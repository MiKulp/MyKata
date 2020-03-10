package exercises.SevenKyu.DescendingOrder;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class DescendingOrderKata {

    public static void main(String[] args) {

        int sorted = sortDesc(1234);
//        System.out.println(sorted);
    }

    public static int sortDesc(int num) {

        int number = num;
        List<Integer> integerList = new ArrayList<>();

        while (number > 0) {
            integerList.add(number % 10);
            number /= 10;
        }

        String string = integerList.stream()
                .sorted(Comparator.reverseOrder())
                .map(integer -> String.valueOf(integer))
                .collect(Collectors.joining());

        return Integer.valueOf(string);
    }
}
