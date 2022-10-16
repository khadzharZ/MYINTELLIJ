package Repls1to20;

import java.util.Scanner;

public class Repl20 {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        System.out.println("Please Enter First Name");
        String firstName = user.nextLine();
        System.out.println("Please Enter Last Name");
        String lastName = user.nextLine();
        System.out.println(firstName + " " + lastName);
    }
}
