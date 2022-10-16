package Repls21to40;

import java.util.Scanner;

public class Repl27 {
    public static void main(String[] args) {
        Scanner age = new Scanner(System.in);
        System.out.println("Please enter your age");
        int numberOfAge = age.nextInt();
        if (numberOfAge >= 18) {
            System.out.println("You are eligible to vote");
        } else {
            System.out.println("You are not eligible to vote");
        }

    }
}
