package Class7;

import java.util.Scanner;

public class HW4 {
    public static void main(String[] args) {
        double purchaseAmount;
        double cashTendered;
        double change = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("What would you like to buy? ");
        String item = scanner.nextLine();
        System.out.print("Enter the purchase amount: ");
        purchaseAmount =scanner.nextDouble();


        System.out.print("Enter the amount of cash tendered: ");
        cashTendered = scanner.nextDouble();

        change = cashTendered - purchaseAmount;


        while(change < 0){

            System.out.println("Enter new amount of cash tendered: ");
            cashTendered =scanner.nextDouble();
            change = cashTendered - purchaseAmount;
        }

        float totalChange = (float)change;





        System.out.printf("Total Change %2f\n", (float)totalChange);

    }
}
