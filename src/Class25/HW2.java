package Class25;

import java.util.ArrayList;

public class HW2 {
    //Create an arrayList of drinks. If any drink has letter “a” or “e” replace it with water.
    public static void main(String[] args) {

        ArrayList<String> drinks=new ArrayList<>();
        drinks.add("Liquor");
        drinks.add("Pepsi");
        drinks.add("Punch");
        drinks.add("Hot Chocolate");
        drinks.add("Pepsi");
        drinks.add("Milk");
        drinks.add("Apple Juice");

        for (int i = 0; i < drinks.size(); i++) {
            if(drinks.get(i).contains("a")||drinks.get(i).contains("e")){
                drinks.set(i,"Water");
            }
        }

        System.out.println(drinks);

    }
}
