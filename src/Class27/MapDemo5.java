package Class27;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

public class MapDemo5 {
    public static void main(String[] args) {
        HashMap<String, Double> fruit = new HashMap<>();
        fruit.put("Apple", 1.99);
        fruit.put("Mango", 1.99);
        fruit.put("Orange", 4.99);
        fruit.put("Banana", 10.1);
        Collection<Double> values = fruit.values();
        Iterator<Double> iterator = values.iterator();
        while (iterator.hasNext()) {
            double value = iterator.next();
            if (value > 2) {
                iterator.remove();
            }
        }
        System.out.println(fruit);
       // fruit.values().removeIf(x->x>2); //lambda method
       // System.out.println(fruit);
    }}

