package exercises.SevenKyu.StantonArray;

import java.util.Arrays;

public class StantonKata {

    public static int stantonMeasure(int[] arr) {

        return (int) Arrays.stream(arr).filter(i -> i == (int) Arrays.stream(arr).filter(j -> j == 1).count()).count();
    }

}
