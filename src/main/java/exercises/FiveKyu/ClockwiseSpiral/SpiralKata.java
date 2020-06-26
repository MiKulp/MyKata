package exercises.FiveKyu.ClockwiseSpiral;

public class SpiralKata {

    public static int[][] createSpiral(int n) {

        int[][] returnArr = new int[n][n];
        int number = 1;
        int colLeft = 0;
        int colRight = n-1;
        int rowTop = 0;
        int rowBottom = n-1;

        while (number <= n*n)
        {
            for (int i = colLeft; i <= colRight; i++) {
                returnArr[rowTop][i] = number;

                number++;
            }

            for (int i = rowTop+1; i <= rowBottom; i++) {
                returnArr[i][colRight] = number;

                number++;
            }

            for (int i = colRight-1; i >= colLeft; i--) {
                returnArr[rowBottom][i] = number;

                number++;
            }

            for (int i = rowBottom-1; i >= rowTop+1; i--) {
                returnArr[i][colLeft] = number;

                number++;
            }

            colLeft++;

            rowTop++;

            colRight--;

            rowBottom--;
        }



        return returnArr;
    }

}
