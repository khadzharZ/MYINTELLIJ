package Repls21to40;

import java.util.Scanner;

public class Repl32 {
    /*Ask the user to enter his/her gender "Please enter your gender: M or F" and their age "Please enter your age"
You have 2 conditions:
If age is above 25, then check if a user entered F then the output should be "Woman" otherwise it should say "Man"
If age is below 25, then check if a user entered F then the output should be "Girl" otherwise it should say "Boy"
 **Example Output:**
     Please enter your gender: M or F
     Please enter your age
     Man
     **Example Output:**
     Please enter your gender: M or F
     Please enter your age
     Boy
     **Example Output:**
     Please enter your gender: M or F
     Please enter your age
     Woman
     **Example Output:**
     Please enter your gender: M or F
     Please enter your age
     Girl*/
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        char gender;
        int age;
        System.out.println("Please enter your gender: M or F");
        gender=scanner.next().charAt(0);
        System.out.println("Please enter your age");
        age=scanner.nextInt();
        String out;
        if(age>25){
            if(gender=='F'){
                out="Woman";
            }else {
                out="Man";
            }
        }else{
            if(gender=='F'){
                out="Girl";
            }else {
                out="Boy";
            }
        }
        System.out.println(out);
    }
}