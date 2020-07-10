package exercises.SixKyu.DataReverse;

import java.util.Arrays;
import java.util.stream.IntStream;

public class DataReverseKata {

    public static int[] DataReverse(int[] data) {

        int[] returnArray = new int[] {};

        int a = data.length - 8;
        int b = data.length;

        for (int i = 0 ; i < data.length / 8  ; i++) {
            returnArray = IntStream.concat(IntStream.of(returnArray), IntStream.of(Arrays.copyOfRange(data, a, b))).toArray();
            a -=  8;
            b -=  8;
        }

        return returnArray;
    }
}
