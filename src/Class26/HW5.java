package Class26;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class HW5 {
    /*Create a Set of cities in which you want to make sure that insertion order is maintained.
     Then remove any city that starts with “A”;
     */
    public static void main(String[] args) {
        Set<String> cities= new LinkedHashSet<>();
        cities.add("Charlotte");
        cities.add("Durham");
        cities.add("Tucson");
        cities.add("Dayton");
        cities.add("Columbus");
        cities.add("Arlington");
        cities.add("Raleigh");
        System.out.println("All listed Cities: " + cities);
        Iterator<String> iterator = cities.iterator();
        while (iterator.hasNext()){
            if(iterator.next().startsWith("A")){
                iterator.remove();
            }
        }
        System.out.println("Cities that Start with a are removed: " +cities);
    }
}

