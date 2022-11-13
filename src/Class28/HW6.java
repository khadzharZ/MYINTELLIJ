package Class28;

import java.util.LinkedHashSet;

public class HW6 {
    /*Create the collection that will store single uniques Objects of a String type in which order is preserved.
Write a logic to concatenate all string from the collection.*/
    public static void main(String[] args) {
        LinkedHashSet<String> collec= new LinkedHashSet<>();
        collec.add("Read");
        collec.add("Write");
        collec.add("Sleep");
        collec.add("Study");
        collec.add("Relax");

        StringBuilder Val= new StringBuilder();
        for (String val1:collec
        ) {
            Val.append(val1);
        }
        System.out.println(Val);
    }

}
