package exercises.SevenKyu.SimpleConsecutivePairs;

public class ConsecutivePairsKata {

    public static int solve(int[] arr) {

        int pairsNumber;
        int counter = 0;

        if (arr.length % 2 == 0) {
            pairsNumber = arr.length;
        } else pairsNumber = arr.length - 1;

        for (int i = 0 ; i < pairsNumber ; i = i+2) {

            if (arr[i] - arr[i+1] == 1 || arr[i] - arr[i+1] == -1) counter++;
        }

        return counter;
    }
}
