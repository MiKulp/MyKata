package exercises.FiveKyu.LongToIpv4;

import java.util.Arrays;

public class LongKata {
    public static void main(String[] args) {
        System.out.println(longToIP(1393624690L));
    }

    public static String longToIP(long ip) {
        int[] arr = new int[4];
        int a = (int) (ip / Math.pow(256, 3));
        int b = (int) (ip % Math.pow(256, 3) / Math.pow(256, 2));
        int c = (int) (ip % Math.pow(256, 2) / 256);
        int d = (int) (ip % 256);

        arr[0] = a;
        arr[1] = b;
        arr[2] = c;
        arr[3] = d;


        return Arrays.stream(arr)
                .mapToObj(String::valueOf)
                .reduce((x, y) -> x.concat(".").concat(y))
                .get();
    }
}
