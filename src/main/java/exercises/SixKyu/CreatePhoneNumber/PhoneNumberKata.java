package exercises.SixKyu.CreatePhoneNumber;

import java.util.Arrays;
import java.util.stream.Collectors;

public class PhoneNumberKata {
    public static void main(String[] args) {

        System.out.println(
                createPhoneNumber(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 0}));
    }


    public static String createPhoneNumber(int[] numbers) {

        String s = Arrays.stream(numbers).mapToObj(value -> String.valueOf(value)).collect(Collectors.joining());

        String pre = s.substring(0, 3);
        String mid = s.substring(3, 6);
        String suff = s.substring(6, numbers.length);


        return String.format("(%s) %s-%s",pre, mid, suff );
    }
}
