package Class9;

public class HW4 {
    public static void main(String[] args) {
        // From an array of integer elements find the largest number.

        int[] number= {78,35,26,11,10  ,9};
        int largest= number[0];
        for(int n:number) {
            if(n>largest) {
                largest=n;

            }System.out.println("Largest number is : "+largest);
        }
    }
}
