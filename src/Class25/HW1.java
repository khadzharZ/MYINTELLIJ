package Class25;

import java.util.ArrayList;

public class HW1 {
    //Create an arrayList of words. Remove every word that ends with “e”.
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        words.add("Furniture");
        words.add("Baseball");
        words.add("Cancel");
        words.add("Multiply");
        words.add("Playground");

        words.removeIf( wor -> wor.endsWith("e"));
        System.out.println(words);
    }}
