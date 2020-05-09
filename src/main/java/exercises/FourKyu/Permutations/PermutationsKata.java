package exercises.FourKyu.Permutations;

import java.util.*;
import java.util.stream.Collectors;

public class PermutationsKata {
    public static void main(String[] args) {
        List<String> str = singlePermutations("ab");
        str.stream().forEach(System.out::println);

    }

    public static List<String> singlePermutations(String s) {
        int n = s.length();
        List<Character> characters = s.chars()
                .mapToObj(value -> (char) value)
                .collect(Collectors.toList());
        Set<String> strings = new HashSet<>();

        while (strings.size() < numberOfPermutations(s)) {
            Collections.shuffle(characters);
            strings.add(characters.toString());
        }

        return strings.stream()
                .map(s1 -> s1.replaceAll("[^a-z]", ""))
                .collect(Collectors.toList());
    }

    public static int numberOfPermutations(final String s) {
        int m = 1;
        int k = s.length();

        String string = s.chars()
                .distinct()
                .boxed()
                .map(integer -> Character.toString(integer))
                .collect(Collectors.joining(""));

        for (int i = 0 ; i < string.length() ; i++) {
            int n = 0;

            for (int j = 0 ; j < s.length() ; j++) {
                if (string.charAt(i) == s.charAt(j)) {
                    n = n + 1;
                }
            }

            m *= strong(n);
        }

        return strong(k) / m;
    }

    public static int strong(final int n) {
        int s = 1;

        for (int i = 1 ; i <= n ; i++) {
            s *= i;
        }
        return s;
    }
}
