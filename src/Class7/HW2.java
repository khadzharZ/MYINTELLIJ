package Class7;

public class HW2 {
    public static void main(String[] args) {
        // Print even numbers from 20 to 1 (two ways)
        int numbers= 20;
        while(numbers>=1) {
            System.out.print(numbers+"  ");
            numbers-=2;
        }
        System.out.println("      ");

        int number=20;
        while(number>=1) {
            if(number%2==0) {
                System.out.print(number+"  ");
            }
            number--;

        }
    }
}
