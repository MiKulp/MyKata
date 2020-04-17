package exercises.SixKyu.DifferenceOf2;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Diff2Kata {
    public static void main(String[] args) {
        int[][] array = twosDifference(new int[]{4, 3, 1, 5, 6});
        System.out.println(Arrays.deepToString(array));
    }

    public static int[][] twosDifference(int[] array) {

        int [] arrayTemp = Arrays.stream(array).sorted().toArray();
        List<Integer> tempList = new LinkedList<>();

        for (int i = 0 ; i < arrayTemp.length ; i++) {

            for (int j = i + 1 ; j < arrayTemp.length ; j++) {
                if (arrayTemp[i] + 2 == arrayTemp[j]) {
                    tempList.add(arrayTemp[i]);
                    tempList.add(arrayTemp[j]);
                }
            }
        }

        int size = tempList.size() / 2;
        int[][] arrarInt = new int[size][2];

        int j = 1;
        int k = 0;

        for (int i = 0; i < size ; i++) {
            arrarInt[i] = new int[]{(int) tempList.get(k), (int) tempList.get(j)};
            j = j + 2;
            k = k + 2;
        }


        return arrarInt;
    }
}
