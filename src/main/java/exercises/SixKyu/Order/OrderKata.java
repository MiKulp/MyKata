package exercises.SixKyu.Order;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class OrderKata {
    public static void main(String[] args) {
        System.out.println(order("is2 Thi1s T4est 3a"));

    }

    public static String order(String words) {

        if (words.length() == 0) return "";

        String[] auxilliaryArray = words.split(" ");
        String[] wordsArray = words.split(" ");

        List <Integer> stringList = Arrays.stream(auxilliaryArray)
                .map(s -> s.replaceAll("\\D", ""))
                .map(s -> Integer.valueOf(s))
                .collect(Collectors.toList());

        String [] returnArray = new String[auxilliaryArray.length];

        for (int i = 0 ; i <auxilliaryArray.length  ; i++) {
            returnArray[stringList.get(i) - 1] = wordsArray[i];

        }

        return Arrays.stream(returnArray).collect(Collectors.joining(" "));
    }
}
