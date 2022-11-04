package Repls41to50;

import java.util.Scanner;

public class Repl43 {
    /*Write a program to input number "Input a number between 1-12" and when you input a number it should display the month using Scanner and Switch statement.
case: 1 will display January
case: 12 will display December
Anything outside of 12 will display "Invalid"
**Example Output:**
Input a number between 1-12
Invalid
**Example Output:**
Input a number between 1-12
January*/
    public static void main(String[] args){
        Scanner scanner =new Scanner(System.in);
        System.out.println("Input a number between 1-12");
        String month=scanner.nextLine();
        String print=null;
        switch(month){

            case "1":
                print= "January";
                break;
            case "2":
                print= "February";
                break;
            case "3":
                print= "March";
                break;
            case "4":
                print= "April";
                break;
            case "5":
                print= "May";
                break;
            case "6":
                print= "June";
                break;
            case "7":
                print= "July";
                break;
            case "8":
                print= "August";
                break;
            case "9":
                print= "September";
                break;
            case "10":
                print= "October";
                break;
            case "11":
                print= "November";
                break;
            case "12":
                print= "December";
                break;
            default:
                print="Invalid";
        }
        System.out.println(print);
    }}

