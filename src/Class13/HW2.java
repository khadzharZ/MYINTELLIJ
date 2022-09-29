package Class13;

public class HW2 {
    public static void main(String[] args) {
        //Create a String that should be combination of letters, numbers and special characters.
        // Find out how many Alphanumeric(abd AZ 284) characters are there in the String.
        String str= "I am Turkish born @ Russia & living in USA. I have 4 brothes & sisters. My age is 32 ";
        String str1=str.replaceAll("^a-z","");
        int str1Size=str1.length();
        System.out.println("It has "+str1Size+" lowercase letters");
        String STR1=str.replaceAll("^A-Z","");
        int STR1Size=STR1.length();
        System.out.println("It has "+STR1Size+" uppercase letters" );
        String numbers=str.replaceAll("^0-9","");
        int numberSize=numbers.length();
        System.out.println("It has "+numberSize+" numbers");

    }
}
