package Repls71to80;

public class Repl73 {
    /*
Write a program that creates an array of strings with the following values{"This",
"is", "array", "of", "strings"} and prints all values in one line.
**Output:**
This is array of strings
 */

        public static void main(String[] args) {
            String[] array = {
                    "This", "is", "array", "of", "strings"
            };
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i] + " ");
            }

    }
}
