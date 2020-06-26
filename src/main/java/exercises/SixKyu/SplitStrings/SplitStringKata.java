package exercises.SixKyu.SplitStrings;

import java.util.Collection;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class SplitStringKata {

    public static void main(String[] args) {
        String[] arr = solution("abcde");

        for (String s : arr) {
            System.out.println(s);
        }


    }

    public static String[] solution(String s) {

        String str;
        AtomicInteger start = new AtomicInteger(0);

        if (s.length() % 2 != 0) str = s.concat("_");
        else str = s;

        Collection<String> stringToSplit = str.chars()
                .mapToObj(value -> String.valueOf((char) value))
                .collect(Collectors.groupingBy(s1 -> start.getAndIncrement() / 2, Collectors.joining()))
                .values();

        return stringToSplit.toArray(new String[0]);
    }

}
