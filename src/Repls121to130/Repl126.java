package Repls121to130;

public class Repl126 {
    /*
Create a variable that will hold the count of all instances of the Main class
Create 3 Object of the class and print value of the count variable;
Expected Output:
3
 */
        static int count;
        public static void main(String[] args) {
            Repl126 m = new Repl126();
            count++;
            Repl126 x = new Repl126();
            count++;
            Repl126 v = new Repl126();
            count++;
            System.out.println(count);
        }
    }

