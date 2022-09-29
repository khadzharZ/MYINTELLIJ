package Class8;

public class Task3 {
    public static void main(String[] args) {
        // print numbers from 1 to 50 except those that are divisible by 3

        for (int k=1; k<=50; k++) {
            if (k%3==0) {
                continue;

            }
            System.out.print(k+"  ");
        }
    }
}
