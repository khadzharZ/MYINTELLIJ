package Class7;

import java.util.Scanner;

public class HW3 {
    public static void main(String[] args) {
        // Declare a variable to store a price for a coffee. ask the use to pay for the coffee.
        // keep asking to pay for the coffee until the user enters the exact amount.
        // if the user gives more than a coffee price
        //ask them to give less if the user gives less money then ask to give more
        // once the exact amoutn print Please enjoy your coffee

        Scanner scanner=new Scanner(System.in);
        double priceCoffee=6;
        double pay;
        System.out.println("Please pay for your cofee");
        do {
            pay=scanner.nextDouble();
            if(pay<priceCoffee) {
                System.out.println("Please pay more");
            }
            else if(pay>priceCoffee) {
                System.out.println("Please pay less ");
            }
        }while (pay!=priceCoffee);

        System.out.println("Please Enjoy Your Coffee");
    }
}
