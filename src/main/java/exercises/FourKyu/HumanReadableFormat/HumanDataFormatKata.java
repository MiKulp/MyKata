package exercises.FourKyu.HumanReadableFormat;

import java.util.Arrays;
import java.util.List;

public class HumanDataFormatKata {
    public static void main(String[] args) {

//        System.out.println(formatDuration(3662));
        System.out.println(printArray(createArray(120)));

        int[] list = createArray(3662);


    }

    public static String formatDuration(int seconds) {
      return seconds > 0 ? printArray(createArray(seconds)): "now";
    }

    public static int[] createArray(int seconds) {
        int auxInt = 0;
        int[] returnArray = new int[5];

        if (seconds >= 31536000) {
            auxInt = seconds / 31536000;
            returnArray[0] = auxInt;
            seconds -= auxInt * 31536000;
        }
        if (seconds < 31536000 && seconds >= 86400) {
            auxInt = seconds / 86400;
            returnArray[1] = auxInt;
            seconds -= auxInt * 86400;

        }
        if (seconds < 86400 && seconds >= 3600) {
            auxInt = seconds / 3600;
            returnArray[2] = auxInt;
            seconds -= auxInt * 3600;
        }

        if (seconds < 3600 && seconds >= 60) {
            auxInt = seconds / 60;
            returnArray[3] = auxInt;
            seconds -= auxInt * 60;

        }

        if (seconds < 60 && seconds >= 1) {
            auxInt = seconds / 1;
            returnArray[4] = auxInt;
        }

        return returnArray;
    }

    public static String printArray(int[] array) {

        String[] arrString = new String[]{"year", "day", "hour", "minute", "second"};
        StringBuilder builder = new StringBuilder("");

        for (int i = 0 ; i < array.length ; i++) {

            if (array[i] == 1) builder.append(String.format("%d %s", array[i], arrString[i]));
            else if (array[i] > 1) builder.append(String.format("%d %ss", array[i], arrString[i]));

            int next = haveNext(array, i+1);

            if (array[i] > 0 && next == 1) builder.append(" and ");
            else if (array[i] > 0 && next > 1) builder.append(", ");

        }

        return builder.toString();
    }

    public static int haveNext(int[] arr, int indexToStart) {
        int x = 0;

        for (int i = indexToStart ; i < arr.length ; i++) {
            if (arr[i] > 0) x++;
        }

        return x;
    }

}
