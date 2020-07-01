package exercises.SevenKyu.ResponsibleDrinking;

import java.util.Arrays;

public class ResponsibleDrinkingKata {

    public static String hydrate(String drinkString) {

        Integer integer = Arrays.asList(drinkString.split("\\D+"))
                .stream()
                .mapToInt(value -> Integer.valueOf(value))
                .sum();

        return integer > 1 ?String.format("%d glasses of water", integer) :  String.format("%d glass of water", integer);
    }
}
