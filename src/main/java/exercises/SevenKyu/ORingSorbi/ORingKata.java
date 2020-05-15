package exercises.SevenKyu.ORingSorbi;

import java.util.ArrayList;
import java.util.List;

public class ORingKata {

    public static void main(String[] args) {
        for (int n :
             orArrays(new int[] {1, 2}, new int[] {1, 2, 3})) {

            System.out.println(n);
        }
    }

    public static int[] orArrays(int[] arr1, int[] arr2) {

        return orArrays(arr1,arr2, 0);
    }

    public static int[] orArrays(int[] arr1, int[] arr2, int over) {
        int opt = over;
        boolean isArr1Short = arr1.length < arr2.length ? true: false ;
        int min = Math.min(arr1.length, arr2.length);
        int max = Math.max(arr1.length, arr2.length);
        List<Integer> integers = new ArrayList<>();

        for (int i = 0 ; i < min  ; i++) {
            integers.add(arr1[i] | arr2[i]);
        }

        for (int i = min ; i < max  ; i++) {
            if (isArr1Short) integers.add( arr2[i] | opt);
            else integers.add(arr1[i] | opt);
        }

        int[] arr = new int[integers.size()];

        for (int i = 0 ; i < integers.size() ; i++) {
            arr[i] = integers.get(i);
        }
        return arr;
    }
}
