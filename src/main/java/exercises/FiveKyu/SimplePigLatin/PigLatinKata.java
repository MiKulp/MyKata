package exercises.FiveKyu.SimplePigLatin;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PigLatinKata {
    public static void main(String[] args) {
        String pigs = pigIt("Pig latin is cool !");
        System.out.println(pigs);
    }

    public static String pigIt(String str) {

        List<String> listOfStrings = Stream.of(str.split(" ")).collect(Collectors.toList());

        return listOfStrings.stream()
                .map(s -> s = s + s.substring(0, 1)).map(s -> s.substring(1, s.length())).map(s -> {
                    if (!(s.equals("!") || s.equals("?") || s.equals("."))) {
                        s = (s + "ay");
                    } else
                        s = s;
                    return s;
                })
                .collect(Collectors.joining(" "));

    }
}
