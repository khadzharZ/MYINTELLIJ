package Class7;

public class EvenAndOdd {
    public static void main(String[] args) {
        // Print off numbers between 20 to 50(2 ways0
        int k=21;
        while(k<=50) {
            System.out.print(k+" ");
            k+=2;
        }
        System.out.println("    ");
        int m=20;
        while(m<=50) {
            if(m%2==1) {
                System.out.print(m+" ");
            }
            m++;
        }
    }
}
