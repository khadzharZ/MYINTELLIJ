package Class26;

import com.sun.tools.javac.Main;

import java.util.*;

public class HW3 {
    /*How can you remove all duplicates from ArrayList?

List<String> aList=new ArrayList<>();
aList.add("John");
aList.add("Jane");
aList.add("James");
aList.add("Jasmine");
aList.add("Jane");
aList.add("James");*/
    public static void main(String[] args) {
        ArrayList<String> arraylist = new ArrayList<>();
        arraylist.add("John");
        arraylist.add("Jane");
        arraylist.add("James");
        arraylist.add("Jasmine");
        arraylist.add("Jane");
        arraylist.add("James");
        Set<String> listWithoutDuplicates = new LinkedHashSet<>(arraylist);
        arraylist = new ArrayList<>(listWithoutDuplicates);
        System.out.println(arraylist);

    }}