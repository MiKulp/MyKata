package exercises.SixKyu.ConsonantValue;

import java.util.*;

public class ConsonantValueKata {

    public static void main(String[] args) {

    }

    public static int solve(final String s) {

        String [] str = s.toLowerCase().split("[aeiou]");
        List <Integer> characterList = new ArrayList<>();

        for (String s1 : str) {
            int l = s1.length();
            characterList.add((s1.chars().sum()) - l * 96);
        }

        return  characterList.stream().max(Integer::compareTo).orElse(0);
    }
}
