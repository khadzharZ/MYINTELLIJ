package Repls21to40;

import java.util.Scanner;

public class Repl26 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("In:");
        String name = inp.nextLine();
        if (name.equals("Chen")) {
            System.out.println("teacher");
        } else {
            System.out.println("student");
        }

    }
}
