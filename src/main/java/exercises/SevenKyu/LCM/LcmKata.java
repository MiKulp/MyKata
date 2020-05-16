package exercises.SevenKyu.LCM;

public class LcmKata {
    public static void main(String[] args) {
        int n = sumDifferencesBetweenProductsAndLCMs(new int[][]{{15, 18}, {4, 5}, {12, 60}});
        System.out.println(n);
//        GCD(new int [] {15, 18});

    }

    public static int sumDifferencesBetweenProductsAndLCMs(final int[][] pairs) {

        if (pairs.length == 0) return 0;

        int returnInt = 0;

        for (int i = 0 ; i < pairs.length ; i++) {

           returnInt += product(pairs[i]) - GCD(pairs[i]);
        }

        return returnInt;
    }

    public static int GCD(int[] arr) {

        if (arr[1] == 0) return 0;

        int a = arr[0];
        int b = arr[1];
        int c;

        while (b != 0) {
            c = a % b;
            a = b;
            b = c;
        }

        return arr[0] * arr[1] / a;
    }

    public static int product(int[] arr) {

        if (arr[1] == 0) return 0;

        return arr[0] * arr[1];
    }
}
