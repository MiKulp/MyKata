package exercises.SevenKyu.SmallestValueInArray;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class SmallestValueKata {

    public static void main(String[] args) {
        System.out.println(findSmallest(new int[]{1, 2, 3, -10}, "value"));
    }

    public static int findSmallest(final int[] numbers, final String toReturn) {

        List<Integer> listOfInt = new ArrayList<Integer>();

        for (int i = 0 ; i < numbers.length ; i++) {
            listOfInt.add(numbers[i]);
        }

        int value = IntStream.of(numbers)
                .min()
                .getAsInt();

        return toReturn.equals("value") ? value : listOfInt.indexOf(value);
    }

}
