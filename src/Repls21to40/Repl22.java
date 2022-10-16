package Repls21to40;

import java.util.Scanner;

public class Repl22 {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        System.out.println("Enter your name");
        System.out.println("Enter your mobile number");
        System.out.println("Enter your age");
        String name = user.nextLine();
        String number = user.nextLine();
        int age = user.nextInt();
        System.out.println("Your name is " + name + ", your age is " + age + " and your mobile number is " + number);
    }
}
