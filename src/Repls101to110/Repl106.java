package Repls101to110;

public class Repl106 {
    /*
Instantiate and StringBuffer class
Append Value "Hello" to it
Append value "World" to it.
Print in UPPERCASE.
Expected Output:
HELLO WORLD
 */

        public static void main(String[] args) {
            StringBuffer str = new StringBuffer();
            str.append("Hello");
            str.append(" World");
            String appendWord = str.toString().toUpperCase();
            System.out.println(appendWord);
        }
    }

