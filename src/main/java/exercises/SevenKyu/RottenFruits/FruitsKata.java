package exercises.SevenKyu.RottenFruits;

import java.util.Arrays;

public class FruitsKata {

    public static String[] removeRotten(String[] fruitBasket) {

      if (fruitBasket == null) return new String[] {};

      return Arrays.stream(fruitBasket)
              .map(s -> s.replace("rotten", "")
                        .toLowerCase())
                        .toArray(String[]::new);

    }
}
