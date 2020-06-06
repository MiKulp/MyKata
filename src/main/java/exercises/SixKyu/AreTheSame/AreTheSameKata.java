package exercises.SixKyu.AreTheSame;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class AreTheSameKata {

    public static void main(String[] args) {
        String s = "some text";

    }

    public static boolean comp(int[] a, int[] b) {
        if (a == null || b == null) return false;

        List<Integer> listA = Arrays.stream(a).map(i -> (i * i)).boxed().sorted(Integer::compareTo).collect(Collectors.toList());

        List<Integer> listB = Arrays.stream(b).boxed().sorted(Integer::compareTo).collect(Collectors.toList());

        return listA.toString().equals(listB.toString());
    }

}
