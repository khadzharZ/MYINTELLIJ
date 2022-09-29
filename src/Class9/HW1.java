package Class9;

public class HW1 {
    public static void main(String[] args) {
        /*  Create an array of cars and store 6 elements into it. Using 2 different loops
         * print all values from the array.
         */

        String[] cars = new String[6];
        cars[0] = "Mitsubishi";
        cars[1] = "Bentley";
        cars[2] = "Honda";
        cars[3] = "Chrysler";
        cars[4] = "Mazda";
        cars[5] = "Jaguar";

        for(int b=0;b<cars.length;b++) {
            System.out.println(cars[b]);
        }

        System.out.println("=================================");


        String []car= { "Mitsubishi","Bentley","Honda","Chrysler","Mazda","Jaguar"};
        for(String cars1:car) {
            System.out.println(cars1);
        }

    }
}
