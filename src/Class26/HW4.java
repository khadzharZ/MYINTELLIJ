package Class26;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class HW4 {
    /*Create a Set collection in which you need to add names of the countries.
     In this set we want all objects to be sorted in alphabetical order.
      Using 2 different ways retrieve all elements from set.
     */
    public static void main(String[] args) {
        Set<String> countries=new TreeSet<>();
        countries.add("USA");
        countries.add("Turkey");
        countries.add("Azerbaijan");
        countries.add("France");
        countries.add("Russia");

        for(String c:countries) {
            System.out.println(c);
        }

        Iterator<String> con=countries.iterator();
        while(con.hasNext()) {
            System.out.println(con.next());
        }

    }

}

