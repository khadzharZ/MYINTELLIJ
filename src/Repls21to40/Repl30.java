package Repls21to40;

import java.util.Scanner;

public class Repl30 {
    public static void main(String[] args) {
        Scanner month = new Scanner(System.in);
        System.out.println("Please enter month number");
        int monthNumber = month.nextInt();
        String out;
        if (monthNumber == 1) {
            out = "January";
        } else if (monthNumber == 2) {
            out = "February";
        } else if (monthNumber == 3) {
            out = "March";
        } else if (monthNumber == 4) {
            out = "April";
        } else if (monthNumber == 5) {
            out = "May";
        } else if (monthNumber == 6) {
            out = "June";
        } else if (monthNumber == 7) {
            out = "July";
        } else if (monthNumber == 8) {
            out = "August";
        } else if (monthNumber == 9) {
            out = "September";
        } else if (monthNumber == 10) {
            out = "October";
        } else if (monthNumber == 11) {
            out = "November";
        } else if (monthNumber == 12) {
            out = "December";
        } else {
            out = "Invalid";
        }

        System.out.println(out);
    }
}
