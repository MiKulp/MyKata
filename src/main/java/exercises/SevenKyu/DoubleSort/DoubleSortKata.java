package exercises.SevenKyu.DoubleSort;

import java.util.Arrays;
import java.util.stream.Stream;

public class DoubleSortKata {

    public static void main(String[] args) {


        Arrays.stream(dbSort(new Object[]{"Banana", "Orange", "Apple", "Mango", 0, 2, 2})).forEach(System.out::println);

    }


    public static Object[] dbSort(Object[] a) {


        Object[] arrNumbers = Arrays.stream(a)
                .filter(o -> o instanceof Number)
                .sorted()
                .toArray();

        Object[] arrStrings = Arrays.stream(a)
                .filter(o -> o instanceof String)
                .sorted()
                .toArray();

        return Stream.of(arrNumbers, arrStrings).flatMap(Stream::of).toArray();
    }

}
