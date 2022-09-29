package ReviewClass5;

import java.lang.reflect.Array;

public class Practice {
    public static void main(String[] args) {
        double a[] = { 1.0, 2.0, 3.0 };

        // Traversing the array
        for (int i = 0; i < 3; i++) {

            // Array.getDouble() method

            double x = Array.getDouble(a, i);
            // Printing the values
            System.out.print(x + " ");
        }
    }
}
