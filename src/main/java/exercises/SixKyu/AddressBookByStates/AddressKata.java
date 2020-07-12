package exercises.SixKyu.AddressBookByStates;

import java.util.List;
import java.util.stream.Collectors;

public class AddressKata {
    public static void main(String[] args) {

        String s = "John Daggett, 341 King Road, Plymouth MA\n" +
                "Alice Ford, 22 East Broadway, Richmond VA\n" +
                "Orville Thomas, 11345 Oak Bridge Road, Tulsa OK\n" +
                "Terry Kalkas, 402 Lans Road, Beaver Falls PA\n" +
                "Eric Adams, 20 Post Road, Sudbury MA\n" +
                "Hubert Sims, 328A Brook Road, Roanoke VA\n" +
                "Amy Wilde, 334 Bayshore Pkwy, Mountain View CA\n" +
                "Sal Carpenter, 73 6th Street, Boston MA";

        byState(s);

    }

    public static String byState(String str) {

        List<String> stringList = str.lines().collect(Collectors.toList());

        System.out.println(stringList.get(1));

        return null;
    }
}
