package Class9;

public class HW2 {
    public static void main(String[] args) {
        // Create an array of animals and store 5 elements into it. Using 2 different loops print all elements from the array.
        String animal[]= {"Turtle","Alligator","Anaconda","Antelope","Tiger"};
        for (int b=0; b<animal.length; b++) {
            System.out.println(animal[b]);
        }
        System.out.println("===============");
        for (String animals:animal) {
            System.out.println(animals);
        }
    }
}
