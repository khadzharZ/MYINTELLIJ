package Class8;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        /*
 * 2. create a secret number and let user guess the secret number once
user
 * guessed your secret number --> program says you won!
 */
        Scanner input = new Scanner(System.in);
        int secret = 1234;
        int guess;
        do {
            System.out.println("Please guess the secret number: ");
            guess = input.nextInt();

        }while(guess != secret);
        System.out.println("You won!");
    }
}


