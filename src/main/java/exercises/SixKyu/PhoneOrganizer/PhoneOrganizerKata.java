package exercises.SixKyu.PhoneOrganizer;

import java.util.*;

public class PhoneOrganizerKata {


    public static Object[] moveOver(Object[] a) {

        for (int i = 0 ; i < a.length ; i++) {
            System.out.println(a[i]);
        }

        if (a.length == 1 && a[0] == null) return new Object[0];

        if (a.length == 1) return a;

        Object[] arrayAuxilliary = a;
        Object[] arrayToReturn = a;


        for (int i = 0 ; i < arrayToReturn.length ; i++) {

            if (arrayToReturn[i] == null) {

                for (int j = arrayAuxilliary.length - 1 ; j >= 0 ; j--) {

                    if (arrayAuxilliary[j] != null) {

                        arrayToReturn[i] = arrayAuxilliary[j];
                        arrayAuxilliary[j] = null;
                        break;
                    }
                }

            }
        }


        return Arrays.stream(arrayToReturn).filter(Objects::nonNull).toArray();
    }


}
