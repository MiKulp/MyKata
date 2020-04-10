package exercises.FiveKyu.DirectionsReduction;

public class DirectionsKata {
    public static void main(String[] args) {

    }

    public static String[] dirReduc(String[] arr) {

        StringBuilder builder = new StringBuilder();

        for (String s : arr) {
            builder.append(" " + s);
        }

        String string = builder.toString();

        for (int i = 0 ; i <arr.length / 2 ; i++) {

            if (string.contains("NORTH SOUTH")) {
                string = string.replace("NORTH SOUTH", "");
            }
            if (string.contains("SOUTH NORTH")) {
                string = string.replace("SOUTH NORTH", "");
            }
            if (string.contains("WEST EAST")) {
                string = string.replace("WEST EAST", "");
            }
            if (string.contains("EAST WEST")) {
                string = string.replace("EAST WEST", "");
            }
            if (string.contains("  ")) {
                string = string.replace("  ", " ");
            }
        }

        if (string.indexOf(" ") == 0) {
            string = string.replaceFirst(" ", "");
        }

        if (string.length() < 4) {
            return new String[] {};
        }


        return string.split(" ");
    }
}
