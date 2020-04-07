package exercises.FiveKyu.MaxSubSum;

public class MaxSumKata {
    public static void main(String[] args) {

    }

    public static int sequence(int[] arr) {
        int auxSum;
        int returnSum = sumArrEl(0, arr);

        if (arr.length == 0) return 0;

        for (int i = 1; i < arr.length ; i++) {
           auxSum = sumArrEl(i, arr);
           if (auxSum > returnSum) returnSum = auxSum;
        }

//        System.out.println(returnSum);
        return returnSum;
    }

    public static int sumArrEl(int m, int[] arr) {
        int n = 1;

        int resultSum = 0;

        while (n < arr.length) {
            int auxSum = 0;

            for (int i = m ; i <= n ; i++) {
                auxSum += arr[i];
//                System.out.println("Loop " + i + "  " + arr[i]);

            }


            if (auxSum > resultSum) resultSum = auxSum;
            n++;

        }

//        System.out.println(resultSum);
        return resultSum;
    }
}




