package exercises.SevenKyu.Greetings;

public class GreetingsKata {

    public static String greet(String name) {
        String firstPart = name.substring(0,1).toUpperCase();
        String lastPart = name.substring(1).toLowerCase();

        return String.format("Hello %s!", firstPart.concat(lastPart));
    }
}
