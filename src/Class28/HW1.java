package Class28;

import java.util.LinkedHashMap;

public class HW1 {
    /*Create a map of a building. Store floor number and it is associated company name. (Example: 1= Google, 2=Syntax etc..).
    Insert 7 entries with duplicate keys and values.
Check how many entries you have?
Update company on a 4th floor
Remove company on the 7th floor
Print your map*/
    public static void main(String[] args) {

        LinkedHashMap<Integer,String> MaP=new LinkedHashMap<>();
        MaP.put(1,"Google");
        MaP.put(2,"Syntax");
        MaP.put(3,"Instagram");
        MaP.put(4,"Ebay");
        MaP.put(5,"Youtube");
        MaP.put(6,"Canvas");
        MaP.put(7,"hotmail");
        System.out.println(MaP.size());
        System.out.println(MaP);
        MaP.replace(4,"powerpoint");
        System.out.println(MaP);
        MaP.remove(7);
        System.out.println(MaP);



    }
}

