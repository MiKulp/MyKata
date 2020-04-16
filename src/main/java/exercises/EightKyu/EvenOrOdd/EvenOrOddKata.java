package exercises.EightKyu.EvenOrOdd;

public class EvenOrOddKata {

    public static void main(String[] args) {

    }

    public static String even_or_odd(int number) {
        return (number & 1) == 0 ? "Even" : "Odd";
    }
}
