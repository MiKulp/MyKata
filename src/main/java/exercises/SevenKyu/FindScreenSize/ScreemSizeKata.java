package exercises.SevenKyu.FindScreenSize;

public class ScreemSizeKata {

    public static void main(String[] args) {

    }

    public static String findScreenHeight(int width, String ratio) {

        String[] arr = ratio.split(":");
        String widthStr = String.valueOf(width);
        String heightStr = String.valueOf((width * Integer.parseInt(arr[1])) / Integer.parseInt(arr[0]));

        return String.format(widthStr+"x"+heightStr);
    }
}
