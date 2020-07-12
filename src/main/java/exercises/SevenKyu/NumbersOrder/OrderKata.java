package exercises.SevenKyu.NumbersOrder;

public class OrderKata {

    public static boolean isAscOrder(final int[] arr) {

        boolean returnB = true;

        for (int i = 1 ; i < arr.length ; i++) {
            if (arr[i-1] > arr[i]) return false;
        }

        return returnB;

    }
}
