package Repls21to40;

import java.util.Scanner;

public class Repl21 {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        System.out.println("Enter your age ");
        int age = user.nextInt();
        System.out.println("Your age after 10 years is " + (age + 10));
    }
}