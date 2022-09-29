package Class6;

import java.util.Scanner;

public class HWSwitch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two numbers of our choice?");
        int num1=input.nextInt();
        int num2=input.nextInt();
        System.out.println("What kind of operation you wanna do with these 2 numbers?");
        char opr=input.next().charAt(0);
        double result=0;

        switch(opr)
        {
            case '+':
                result=num1+num2;
                break;
            case '-':
                result=num1-num2;
                break;
            case '*':
                result=num1*num2;
                break;
            case '/':
                result=num1/num2;
                break;
            default:
                System.out.println("Invalid entry.Try again");
                break;
        }
        if(opr=='+' || opr=='-' ||  opr=='*'|| opr=='/')
        {
            System.out.println("!!!!!!!!!!!!!!!!OUTPUT!!!!!!!!!!!!!!!!!!!!");
            System.out.println("Your calculator is ready");
            System.out.println("The given numbers are :=" +num1 +"," +num2 +" and the given operator is :="+ "(" +opr +")");
            System.out.println("Here comes the result");
            System.out.println( "The result is :=" +result);
        }
    }
}
