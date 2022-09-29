package Class7;

public class HWLoops {
    public static void main(String[] args) {
        //Print the numbers 1 to 100 in 1 line with space
        int numbers=1;
        while(numbers<=100) {
            System.out.print(numbers+"  ");
            numbers++;
        }
        System.out.println("--------------------------");

//print the numbers from 100 to 1
        int number=100;
        while(number>=1) {
            System.out.print(number+" ");
            number--;
        }
    }
}
