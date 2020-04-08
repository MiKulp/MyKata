package exercises.FiveKyu.CountIP;

import java.net.Inet4Address;
import java.net.UnknownHostException;

public class CountIpKata {
    public static void main(String[] args) throws UnknownHostException {
        System.out.println(ipsBetween("10.0.0.0", "10.0.0.50"));

    }

    public static long ipsBetween(String start, String end) throws UnknownHostException {
        return ipValue(end) - ipValue(start);
    }

    public static long ipValue(String s) {
        long returnLong = 0;
        String[] arr = s.split("\\.");

        for (int i = 3 ; i >= 0  ; i--) {
            long value = Long.valueOf(arr[3 - i]);
            returnLong |= value << (i * 8);
        }

        return returnLong;
    }
}
