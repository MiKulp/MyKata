package exercises.SevenKyu.SpacifyKata;

import java.util.Arrays;
import java.util.stream.Collectors;

public class SpacifyKata {


    public static String spacify(String str) {

        return String.join(" ", str.split(""));
    }
}
