package Repls121to130;

public class Repl124 {
    /*
    Declare static variable in class level as below and assign its value:
    String ss="Welcome To Syntax Technologies"
    Access variable in the main method and print it using three ways you learned so far
    Hint:
    first way: By calling directly
    Second way: By using the className
    Third way: By creating the object of the class
    Expected Output:
    Welcome To Syntax Technologies
    Welcome To Syntax Technologies
    Welcome To Syntax Technologies
     */
        static String ss = "Welcome To Syntax Technologies";
        public static void main(String[] args) {
            // first way
            System.out.println(ss);
            // second way
            System.out.println(Repl124.ss);
            // third way
            Repl124 m = new Repl124();
            System.out.println(m.ss);
        }
    }
