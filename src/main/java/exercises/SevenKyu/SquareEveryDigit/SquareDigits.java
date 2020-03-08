package exercises.SevenKyu.SquareEveryDigit;

import java.util.*;
import java.util.stream.Collectors;

public class SquareDigits {
    public static void main(String[] args) {

        int n = 3212;
        System.out.println(squareDigits(n));
    }


    public static int squareDigits(int n) {
        List<Integer> integerList = new ArrayList<>();
        StringBuilder builder = new StringBuilder();

        while (n > 0) {
            integerList.add(n % 10);
            n = n / 10;
        }
        Collections.reverse(integerList);
        List<Integer> returnList = integerList.stream().map(i -> i * i).collect(Collectors.toList());

        for (Integer integer : returnList) {
            builder.append(integer);
        }

        return Integer.parseInt(builder.toString());
    }


}
