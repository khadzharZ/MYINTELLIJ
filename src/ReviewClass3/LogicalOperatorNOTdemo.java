package ReviewClass3;

import java.util.Scanner;

public class LogicalOperatorNOTdemo {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter if you are comfortable with"
                + " java logical operators now");
        boolean goodWithOp=scanner.nextBoolean();

        if(!goodWithOp) {
            System.out.println("Do some more resaerch solve some repls and take some rest");
        }
    }
    }

