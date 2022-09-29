package Class5;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        // Write a program that will ask user to input inputs the current time (use 24 hour format).
//Based on the given time define:
//	if hour is between 1-11 --> Morning
//if hour between 12-15 --> Afternoon
//	if hour between 16-20 --> Evening
//	if hour between 21-24 --> Night
        Scanner scanner=new Scanner(System.in);
        System.out.println("What time is it now in 24 hour format");
        int time=scanner.nextInt();

        String timeOfTheDay = null;
        if(time>=1 && time<=11) {
            System.out.println("morning");
        }else if (time>=12  && time<=15 ) {
            System.out.println("afternoon");
        }else if (time >=16 && time<=20) {
            System.out.println("evening");
        }else if (time >=21 && time <=24) {
            System.out.println("night");
        }else {
            System.out.println("Wrong number is entered");
            timeOfTheDay="Invalid";
        }
        System.out.println(timeOfTheDay);
    }
}
