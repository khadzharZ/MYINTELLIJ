package Class28;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class HW2 {
    /*Create a map of countries with its capital that will store countries in alphabetical order.
Print all keys and values from a country map using for each loop and iterator.
Print all values from a country map using for each loop and iterator.*/
    public static void main(String[] args) {
        TreeMap<String,String> Map=new TreeMap<>();
        Map.put("USA","Washington");
        Map.put("Brazil","Brasilia");
        Map.put("Azerbaijan","Baku");
        Map.put("Russia","Moscow");
        System.out.println(Map);

        for(Map.Entry<String, String> country : Map.entrySet()){
            System.out.println(country);
            System.out.println(country.getValue());
            System.out.println(country.getKey());
        }

        System.out.println("=====================================");

        Iterator<Map.Entry<String,String>> iterator = Map.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<String, String> i = iterator.next();
            System.out.println(i);
            System.out.println(i.getValue());
            System.out.println(i.getKey());

        }

        System.out.println("============================================");

        for(String value : Map.values()){
            System.out.println(value);
        }

        System.out.println("=========================================");

        Iterator<String> iterator1 = Map.values().iterator();
        while(iterator1.hasNext()){
            System.out.println(iterator1.next());
        }

    }
}