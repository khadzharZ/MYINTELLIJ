package Class7;

import java.util.Scanner;

public class HW1 {
    public static void main(String[] args) {
        //Prompt the user to ask the name 3 times and print "Good afternoon +name...


        Scanner input=new Scanner(System.in);

        for (int b=1; b<=3; b++) {
            System.out.println("What is your name?");
            String name=input.nextLine();
            System.out.println("Good afretnoon!  "+name);
        }
    }
}
