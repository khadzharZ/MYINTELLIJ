package Class11;

public class Person {
    String name;
    int age;
    double weight;
    boolean isFunny;
    boolean losingHairs;

    void study() {

        if (name.equals("Anna")) {
            System.out.println("I study hart");

        } else if (name.equals("Roman")) {
            System.out.println("I will keep on deleting the messages and will not let any one study");

        } else {
            System.out.println("I try to study but things don't make much sense");
        }
    }

    public static void main(String[] args) {

        Person person1 = new Person();
        person1.name = "Anna";

        person1.study(); // I study hart

        System.out.println("**");
        Person person2 = new Person();
        person2.name = "Roman";

        person2.study(); // I will keep on deleting the messages and will not let any one study

        System.out.println("**");
        Person person3 = new Person();
        person3.name = "Yusuf";

        person3.study(); // I try to study but things don't male much sense

    }
}