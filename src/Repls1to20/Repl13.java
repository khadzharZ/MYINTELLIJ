package Repls1to20;

public class Repl13 {
    public static void main(String[] args) {
        int myNumber = 7;
        int stepOne = myNumber * myNumber;
        int stepTwo = stepOne + myNumber;
        int stepThree = stepTwo / myNumber;
        int stepFour = stepThree + 17;
        int stepFive = stepFour - myNumber;
        int stepSix = stepFive / 6;
        System.out.println("The magic number is " + stepSix + "!");
    }
}
