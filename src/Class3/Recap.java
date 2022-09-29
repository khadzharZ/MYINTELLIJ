package Class3;

public class Recap {
    public static void main(String[] args) {
        //String concatenation helps us combine two Strings with any primitive data type together

        String firstName="Mina";
        String lastName="Helen";
        String fullName=firstName+ " "+lastName;
        System.out.println(fullName);

        int houseNo=15;
        int apartmentNo=5;
        String streetName="That street";
        String city="New York";
        String country="USA";
        String fullAddress=houseNo+" "+apartmentNo+" "+streetName+" "+city+" "+country;
        System.out.println(fullAddress);

        String incompleteAddress=houseNo+city;

        String step1="if we subtract 10 from 5 we get=" +10; //results in a String
        System.out.println(step1);
        // its is not defined java does not understand what to do when we ask her to subtract
        //a String from sa number it  complains
        //String step2=step1-5;

        System.out.println("if we subtract 10 from 5 we get = " +(10-5));
    }
}
