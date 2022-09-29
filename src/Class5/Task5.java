package Class5;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Please enter your birth month");
        String month=scanner.nextLine();
        if(month.equals("march") || month.equals("April")|| month.equals("May")) {
            System.out.println("Spring");
        }
        else if (month.equals("June") || month.equals("July") || month.equals("Avgust")){
            System.out.println("Summer");

        }
        else if (month.equals("September") || month.equals("October")|| month.equals("November")) {
            System.out.println("Autumn");
        }
        else if (month.equals("Desember") || month.equals("January") || month.equals("February")){
            System.out.println("Winter");
        }
        else
        {
            System.out.println("Invalid");

        }
    }
}
