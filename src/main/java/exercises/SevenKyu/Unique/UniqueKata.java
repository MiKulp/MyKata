package exercises.SevenKyu.Unique;

import java.util.Arrays;

public class UniqueKata {

    public static int[] unique(int[] integers) {
        return Arrays.stream(integers).distinct().toArray();
    }
}
