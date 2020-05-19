package exercises.FourKyu.NextBiggerNumber;

import java.util.*;
import java.util.stream.Collectors;

public class NextBiggerNumberKata {
    public static void main(String[] args) {
        System.out.println(nextBiggerNumber(2017));

//        Set<String> strings = biggerNumber("513");
//        strings.forEach(System.out::println);
    }

    public static long nextBiggerNumber(long n) {

        Set<String> strings = biggerNumber(String.valueOf(n));
        List<Long> longList = strings.stream().map(s -> Long.valueOf(s)).collect(Collectors.toList());
        
        longList = longList.stream().sorted(Long::compareTo).collect(Collectors.toList());
        int indexOf = longList.indexOf(n);

        return longList.get(indexOf+1);
    }

    public static Set<String> biggerNumber(String s) {

        if (s.length() == 1) {
            return Collections.singleton(s);
        }

        Set<String> longSet = new HashSet<>();
        for (int i = 0 ; i < s.length() ; i++) {
            for (String str : biggerNumber(s.substring(0, i) + s.substring(i + 1))) {
                longSet.add(s.charAt(i) + str);
            }
        }

        return longSet;
    }


}
