package exercises.EightKyu.Welcome;

import java.util.HashMap;
import java.util.Map;

public class WelcomeKata {

    public static String greet(String language){
        Map <String, String> map = new HashMap<>();

        map.put("english", "Welcome");
        map.put("czech", "Vitejte");
        map.put("danish", "Velkomst");
        map.put("dutch", "Welkom");
        map.put("estonian", "Tere tulemast");
        map.put("finnish", "Tervetuloa");
        map.put("flemish", "Welgekomen");
        map.put("french", "Bienvenue");
        map.put("german", "Wilkommen");
        map.put("irish", "Failte");
        map.put("italian", "Benvenuto");
        map.put("latvian", "Gauditis");
        map.put("lithuanian", "Laukiamas");
        map.put("polish", "Witamy");
        map.put("spanish", "Bienvenido");
        map.put("swedish", "Valkommen");
        map.put("welsh", "Croeso");


        return map.getOrDefault(language, "Welcome");
    }

}
