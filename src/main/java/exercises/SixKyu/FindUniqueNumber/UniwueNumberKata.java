package exercises.SixKyu.FindUniqueNumber;

import java.util.Arrays;

public class UniwueNumberKata {
    public static void main(String[] args) {
       double db =  findUniq(new double[]{1, 1, 2, 1, 1, 1});
        System.out.println(db);
    }

    public static double findUniq(double arr[]) {
        // Do the magic
        double n;
        if (arr[0] == arr[1]) n = arr[0];
        else if (arr[0] == arr[2]) n = arr[0];
        else n = arr[1];


      return  Arrays.stream(arr).filter(value -> (value != n)).findFirst().orElse(n);

    }
}
