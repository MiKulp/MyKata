package exercises.FourKyu.HumanReadableFormat;

public class HumanDataFormatKata {
    public static void main(String[] args) {

        System.out.println(formatDuration(3662));
    }

    public static String formatDuration(int seconds) {

        if (seconds == 0) return "now";

        int auxInt = 0;
        StringBuilder returnString = new StringBuilder("");

        if (seconds >= 31536000) {
            auxInt = seconds / 31536000;
            if (auxInt == 1) returnString.append("1 year");
            else returnString.append(String.format("%d years", auxInt));
            seconds -= auxInt * 31536000;

            if (seconds > 0 && seconds % 86400 == 0) {
                returnString.append(" and ");
            } else if (seconds > 0) {
                returnString.append(", ");
            }

        }

        if (seconds < 31536000 && seconds >= 86400) {
            auxInt = seconds / 86400;

            if (auxInt == 1) returnString.append("1 day");
            else returnString.append(String.format("%d days", auxInt));
            seconds -= auxInt * 86400;

            if (seconds > 0 && seconds % 3600 == 0) {
                returnString.append(" and ");
            } else if (seconds > 0) {
                returnString.append(", ");
            }

        }

        if (seconds < 86400 && seconds >= 3600) {
            auxInt = seconds / 3600;

            if (auxInt == 1) returnString.append("1 hour");
            else returnString.append(String.format("%d hours", auxInt));
            seconds -= auxInt * 3600;

            if (seconds > 0 && seconds % 60 == 0) {
                returnString.append(" and ");
            } else if (seconds > 0 ) {
                returnString.append(", ");
            }
        }

        if (seconds < 3600 && seconds >= 60) {
            auxInt = seconds / 60;

            if (auxInt == 1) returnString.append("1 minute");
            else returnString.append(String.format("%d minutes", auxInt));
            seconds -= auxInt * 60;

            if (seconds > 0 ) {
                returnString.append(" and ");
            }
        }

        if (seconds < 60 && seconds >= 1) {
            auxInt = seconds / 1;

            if (auxInt == 1) returnString.append("1 second");
            else returnString.append(String.format("%d seconds", auxInt));
            seconds -= auxInt * 1;
        }

        return returnString.toString();
    }

}
