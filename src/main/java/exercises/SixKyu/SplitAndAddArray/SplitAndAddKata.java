package exercises.SixKyu.SplitAndAddArray;

public class SplitAndAddKata {
    public static void main(String[] args) {

    }

    public static int[] splitAndAdd(int[] numbers, int n) {

        if (numbers.length < 2 || n == 0) return numbers;

        int x = numbers.length / 2;
        int y = numbers.length - x;

        int[] arrFirst = new int[x];
        int[] arrSecond = new int[y];

        for (int i = 0 ; i < x ; i++) {
            arrFirst[i] = numbers[i];
        }


        for (int i = 0, j = x ; i < y ; i++, j++) {
            arrSecond[i] = numbers[j];
        }


        for (int i = arrFirst.length - 1, j = arrSecond.length - 1 ; i >= 0 ; i--, j--) {
            arrSecond[j] += arrFirst[i];
        }
        n--;
        return splitAndAdd(arrSecond, n);
    }
}
