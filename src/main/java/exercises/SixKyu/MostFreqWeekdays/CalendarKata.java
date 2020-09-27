package exercises.SixKyu.MostFreqWeekdays;

import java.time.LocalDate;

public class CalendarKata {

    public static String[] mostFrequentDays(int year) {


        int secondNumber = LocalDate
                .of(year, 12, 31)
                .getDayOfWeek()
                .getValue();

        String sdDay = LocalDate
                .of(year, 12, 31)
                .getDayOfWeek()
                .toString()
                .charAt(0)
                +
                LocalDate.of(year, 12, 31)
                        .getDayOfWeek()
                        .toString()
                        .toLowerCase()
                        .substring(1);


        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {

            int firstNumber = LocalDate
                    .of(year, 12, 30)
                    .getDayOfWeek()
                    .getValue();

            String ftDay = LocalDate
                    .of(year, 12, 30)
                    .getDayOfWeek()
                    .toString()
                    .charAt(0)
                    +
                    LocalDate.of(year, 12, 30)
                            .getDayOfWeek()
                            .toString()
                            .toLowerCase()
                            .substring(1);

            String[] arr = new String[2];

            if (secondNumber < firstNumber) {
                arr[0] = sdDay;
                arr[1] = ftDay;
                return arr;

            } else {
                arr[0] = ftDay;
                arr[1] = sdDay;
                return arr;
            }

        } else {

            return new String[]{sdDay};
        }

    }
}

