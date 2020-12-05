package exercises.SevenKyu.OfficeOuted;

import java.util.Arrays;

public class OfficeOutedKata {

    public static void main(String[] args) {

        Person[] meet = new Person[]{
                new Person("tim", 0),
                new Person("jim", 2),
                new Person("randy", 0),
                new Person("sandy", 7),
                new Person("andy", 0),
                new Person("katie", 5),
                new Person("laura", 1),
                new Person("saajid", 2),
                new Person("alex", 3),
                new Person("john", 2),
                new Person("mr", 0)

        };

        System.out.println(outed(meet, "katie"));

    }


    public static String outed(Person[] meet, String boss) {

        double i = 0;

        for (Person person : meet) {
            i += person.happiness;
            if (person.name.equals(boss)) i += person.happiness;
        }

  //      if (i == 55 && meet.length == 11) return "Get Out Now!";



        return  (i/meet.length) <= 5 ? "Get Out Now!" : "Nice Work Champ!";

    }

    public static class Person {

        final String name;    // team memnber's name
        final int happiness;  // happiness rating out of 10

        public Person(String name, int happiness) {
            this.name = name;
            this.happiness = happiness;
        }
    }

}
