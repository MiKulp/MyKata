package exercises.SevenKyu.ExesAndOhs;

import java.util.List;
import java.util.stream.Collectors;

public class ExesKata {

    public static void main(String[] args) {
        System.out.println(getXO("xoXxGEXx3X\n" +
                "oKOXXXHXX\n" +
                "Xx\n" +
                "OR1JoE\n" +
                "xKXXxxZX\n" +
                "A704xTXxNx\n" +
                "OX\n" +
                "LX0XxXAo"));
    }

    public static boolean getXO (String str) {

        List <Character> chars = str.toLowerCase().chars().mapToObj(value -> (char) value).collect(Collectors.toList());

        return chars.stream()
                .filter(character -> character.equals('o'))
                .count() ==

                chars.stream()
                        .filter(character -> character.equals('x'))
                        .count();

    }
}
