package Class28;

import java.util.TreeMap;

public class HW4 {
    /*Create a Person class with following private fields: name, lastName, age, salary.
Variables should be initialized through constructor.
Inside the class also create a method to print user details.
In Test Class create a Map that will store key in ascending order.
In that map store personId and a Person Object. Print each object details.*/
    public static void main(String[] args) {
        TreeMap<Integer,Person> personClass =new TreeMap<>();
        personClass.put(1,new Person("Janel","S",35,120000));
        personClass.put(2,new Person("Serhii","Peleshchak",22,165000));
        personClass.put(3,new Person("Ben","H",25,180000));
        personClass.put(4,new Person("Zorah","Y",21,150000));
        for (Person p: personClass.values()) {
            System.out.println(p);
        }}}
class Person{
    private String firstName;
    String lastname;
    int age;
    double salary;

    public Person(String firstName, String lastname, int age, double salary) {
        this.firstName = firstName;
        this.lastname = lastname;
        this.age = age;
        this.salary = salary;
    }
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastname='" + lastname + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}
