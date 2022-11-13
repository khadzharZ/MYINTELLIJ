package Class28;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo5 {
    public static void main(String[] args) {
        HashMap<String,Double> items=new HashMap<>();
        items.put("Iphone 14",1000.0);
        items.put("Eggs",2.40);
        items.put("Apples",5.0);
        items.put("Keyboard",100.0);
        items.put("Flower",1.0);
        //Set<Map.Entry<String,Double >> entrySet=items.entrySet();
        var entrySet=items.entrySet();
        System.out.println(entrySet);
        for(var item : entrySet){
            System.out.println(item.getKey()+" " + item.getValue());
        }


    }
}
