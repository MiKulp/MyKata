package exercises.SevenKyu.TheSpeedLetters;

import java.util.Arrays;
import java.util.stream.Collectors;

public class SpeedLettersKata {

    public static void main(String[] args) {
      String str = speedify("EJNERXQFAPHPWUOWZHCPCRGJUGWZYFAGHMFKDDNRIUOTZCQLZLCYTIZPWOGBLFLYPHMUXPRRXMQWYHYROYGUHLLGCJUMRFOGQFSS");
        System.out.println(str);
        System.out.println("str.length" +str.length());

    }

    public static String speedify(final String input) {

//        String inputS = "EJNERXQFAPHPWUOWZHCPCRGJUGWZYFAGHMFKDDNRIUOTZCQLZLCYTIZPWOGBLFLYPHMUXPRRXMQWYHYROYGUHLLGCJUMRFOGQFSS";
//        String received = "    E  EA J F  N H  CRC H P G AGJUF  GRDDZ  UK CI  NC   O L BIQ G F  ZPLHL Y  MP    HM RG CH GOXLLF YGFM Y  ORU Q   S";
//        String pro = "    E  EA J F  N H  CRC H P G AGJUF  GRDDZ  UK CI  NC   O L BIQ G F  ZPLHL Y  MP    HM RG CH GOXLLF YGFM Y  ORU Q   SS";
//
//        System.out.println(received.length());
//        System.out.println(pro.length());

        System.out.println("input.length() " + input.length());

        char[] arr = input.toCharArray();
        String[] returnArray = new String[input.length() + 25];
        int limit = 0;

        for (int i = 0 ; i < returnArray.length ; i++) {
            returnArray[i] = " ";
        }

        for (int i = 0 ; i < arr.length ; i++) {

            int index = (arr[i] - 65) + i;
            returnArray[index] = String.valueOf(arr[i]);
            System.out.println(arr[i] + "  " + index);

            if (limit <= index) {
                limit = index + 1;
            }

        }
        System.out.println("limit " +limit);

        String s = Arrays.stream(returnArray).limit(limit).collect(Collectors.joining(""));
        return s;
    }
}
