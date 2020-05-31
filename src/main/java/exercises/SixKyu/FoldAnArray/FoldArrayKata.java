package exercises.SixKyu.FoldAnArray;

public class FoldArrayKata {

    public static int[] foldArray(int[] array, int runs) {

        if (runs == 0) return array;
        int[] arrayAux = array;
        int[] retArr = new int[0];

        for (int i = 0 ; i < runs  ; i++) {
            retArr = divideAndSumArray(arrayAux);
            arrayAux = retArr;
        }

        return retArr;

//        return divideAndSumArray(array);
    }

    private static int[] divideAndSumArray(int[] arr) {

        if (arr.length == 1) return arr;

        int n;

        if (arr.length % 2 == 0) n = arr.length / 2;
        else n = arr.length / 2 + 1;

        int[] arrayToReturn = new int[n];


        for (int i = 0, j = arr.length - 1 ; i < arrayToReturn.length ; i++, j--) {
            arrayToReturn[i] = arr[i] + arr[j];
        }

        if (arr.length % 2 != 0) {
            arrayToReturn[arrayToReturn.length - 1] = arr[arrayToReturn.length - 1];
        }

        return arrayToReturn;
    }


}
