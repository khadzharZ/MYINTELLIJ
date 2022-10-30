package Class25;

import java.util.ArrayList;

public class HW {
    public static void main(String[] args) {


    /*Create an ArrayList that will store 5 names into it.
    Find out whether the given ArrayList is empty or not?
    Check whether the specific name is present in an ArrayList or not?
    Find the size of your arrayList and print all values from that*/
    ArrayList<String> names=new ArrayList<>(5);
        names.add("Hajar");
        names.add("Janel");
        names.add("Puskar");
        names.add("Ban");
        names.add("Serhii");
        System.out.println(names.isEmpty());
        System.out.println(names.contains("Serhii"));
        System.out.println(names.size());
        System.out.println(names);
}}
