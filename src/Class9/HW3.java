package Class9;

public class HW3 {
    public static void main(String[] args) {
        // Create an array on integers and calculate the sum of all elements in an array
        int adding=0;
        int number[]= {10,19,22,45,57,62,38};
        for(int h=0; h<number.length; h++) {
            adding+=number[h];

        }
        System.out.println("Sum of number isequal to "+adding);
    }
}
