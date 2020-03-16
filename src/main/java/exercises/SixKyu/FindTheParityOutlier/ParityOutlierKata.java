package exercises.SixKyu.FindTheParityOutlier;

import java.util.Arrays;

public class ParityOutlierKata {


    public static void main(String[] args) {
        int[] array = new int[]{12, 2, 8, 10, 90, 321};
        int n = find(array);
        System.out.println(n);
    }

    static int find(int[] integers) {
        int x = 0;
        int y = 0;

        for (int i = 0 ; i <= 2 ; i++) {
            if ((integers[i] & 1) == 0) {
                x++;
            } else {
                y++;
            }
        }

        if (x > y) {
            return Arrays.stream(integers).filter(value -> (value & 1) != 0).findFirst().getAsInt();
        } else
            return Arrays.stream(integers).filter(value -> (value & 1) == 0).findFirst().getAsInt();

    }
}
