package exercises.SevenKyu.DrivingLicence;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Locale;
import java.util.stream.Collectors;

public class DrivingLicenceKata {

    public static void main(String[] args) {

        String[] arr = new String[]{"Andrew",  "Robert", "Lee",   "02-September-1981", "M"};
        String result = "LEE99809021AR9AA";
        String str = driver(arr);
        System.out.println(result.equals(str));
    }

    public static String driver(final String[] data) {

        String[] arr = new String[10];

        arr[6] = "9";

        String surname = data[2];
        if (surname.length() < 5) {
            for (int i = 0 ; i <= (5 - surname.length()) ; i++) {
                surname = surname + "9";
            }
        } else if (surname.length() > 5) {
            surname = surname.substring(0, 5);
        }
        arr[0] = surname.toUpperCase();

        for (int i = 8 ; i < 10 ; i++) {
            arr[i] = "A";
        }

        String dateOfBirth = data[3];
        LocalDate date = null;
        DateTimeFormatter formatterShort = DateTimeFormatter.ofPattern("dd-MMM-yyyy", Locale.ENGLISH);
        DateTimeFormatter formatterLong = DateTimeFormatter.ofPattern("d-MMMM-yyyy", Locale.ENGLISH);

        if (dateOfBirth.length() == 11) {
            date = LocalDate.parse(dateOfBirth, formatterShort);
        } else  {
            date = LocalDate.parse(dateOfBirth, formatterLong);
        }

        arr[1] = String.valueOf(date.getYear() / 10 % 10);

        if (data[4].equals("F")) {

         arr [2] = String.format("%02d", (date.getMonth().getValue() + 50));

        } else {
            arr[2] = String.format("%02d", date.getMonth().getValue());
        }

        arr[3] = String.format("%02d", date.getDayOfMonth());
        arr[4] = String.valueOf(date.getYear() % 10);

        String fName = data[0];
        if (fName.length() < 1) {
            fName = "9";
        } else {
            fName = fName.substring(0, 1);
        }
        arr[5] = fName;


        String mName = data[1];
        if (mName.length() < 1) {
            mName = "9";
        } else {
            mName = mName.substring(0, 1);
        }
        arr[6] = mName;
        arr[7] = "9";

        return Arrays.stream(arr).collect(Collectors.joining());
    }


}
