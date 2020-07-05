package exercises.SevenKyu.OfficeII;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class OfficeIIKata {


    public static String boredom(Person[] staff) {

        Map<String, Integer> workMap = new HashMap<>();
        workMap.put("accounts", 1);
        workMap.put("finance", 2);
        workMap.put("canteen", 10);
        workMap.put("regulation", 3);
        workMap.put("trading", 6);
        workMap.put("change", 6);
        workMap.put("IS", 8);
        workMap.put("retail", 5);
        workMap.put("cleaning", 4);
        workMap.put("pissing about", 25);

        int returnInt = Arrays
                .stream(staff)
                .mapToInt(value -> workMap.get(value.department))
                .sum();

        if (returnInt <= 80) return "kill me now";
        else if (returnInt < 100) return "i can handle this";
        else return "party time!!";

    }


}
