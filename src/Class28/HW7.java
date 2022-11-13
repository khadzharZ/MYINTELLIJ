package Class28;

import java.util.Arrays;
import java.util.List;

public class HW7 {
    /*Create a collection of integers in which you can keep duplicates.
Write a logic to find sum of all integers*/
    public static void main(String[] args) {

    List<Integer> nums= Arrays.asList(10,10,30,30,60,70,100);
    int sumOfAll=0;
        for (Integer numbs:nums) {
        sumOfAll+=numbs;
    }
        System.out.println(sumOfAll);

}
}
