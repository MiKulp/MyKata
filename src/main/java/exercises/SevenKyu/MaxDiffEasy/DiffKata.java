package exercises.SevenKyu.MaxDiffEasy;

import java.util.stream.IntStream;

public class  DiffKata {

    public static void main(String[] args) {
        System.out.println(maxDiff(new int[]{}));
    }

    public static int maxDiff (int[] lst) {

        if (lst.length == 0) return 0;

        return
        IntStream.of(lst)
                .max()
                .getAsInt() -


        IntStream.of(lst)
                .min()
                .getAsInt();

    }
}
