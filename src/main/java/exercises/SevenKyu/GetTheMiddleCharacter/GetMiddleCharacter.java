package exercises.SevenKyu.GetTheMiddleCharacter;

public class GetMiddleCharacter {
    public static void main(String[] args) {

        System.out.println(getMiddle("test"));
    }

    public static String getMiddle(String word) {
        //Code goes here!

        if (word.length() <= 2) {
            return word;
        }
        else {
            return getMiddle(word.substring(1, word.length()-1));
        }

    }
}
