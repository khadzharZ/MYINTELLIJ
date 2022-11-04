package Repls111to120;

public class Repl113 {
    /*
Step1: Create a method that will accept with 2 parameters of integer type
Step2: Write the logic in that method in println statement to print hours and
minutes
Step3: Call the method
Expected Output:
11:30
 */

        public static void main(String[] args) {
            Repl113 time = new Repl113();
            time.numbers(11, 30);
        }
        void numbers(int hours, int minutes) {
            System.out.println(hours + ":" + minutes);
        }
    }

