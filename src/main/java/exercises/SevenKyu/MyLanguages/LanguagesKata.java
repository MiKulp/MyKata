package exercises.SevenKyu.MyLanguages;

import java.util.*;
import java.util.stream.Collectors;

public class LanguagesKata {
    public static void main(String[] args) {
        final Map<String, Integer> map2 = new HashMap<>();
        map2.put("Hindi", 60);
        map2.put("Dutch", 93);
        map2.put("Greek", 71);

        List<String> lista = myLanguages(map2);

        for (String s : lista) {
            System.out.println(s);
        }
    }

    public static List<String> myLanguages( final Map<String, Integer> results) {

        Map<String, Integer> mapa = results.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .filter(m -> m.getValue().intValue() >= 60)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (oldValue, newValue) -> oldValue, LinkedHashMap::new));



        return new LinkedList<>(mapa.keySet());
    }
}
