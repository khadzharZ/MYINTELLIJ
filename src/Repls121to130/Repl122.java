package Repls121to130;

public class Repl122 {
    /*
Declare 3 instance variables to hold:
name of the country
capital
population size
Create a method to display values of instance variables
Create 2 Object, assign values to instance variables, execute method display;
Expected Output:
The capital of USA is Washington DC and population is 330000000
The capital of Kazakhstan is Astana and population is 18500000
 */
        String countryName;
        String capital;
        long population;
        public static void main(String[] args) {
            Repl122 m = new Repl122();
            m.countryName = "USA";
            m.capital = "Washington DC";
            m.population = 330000000;
            System.out.println("The capital of " + m.countryName + " is " + m.capital +
                    " and population is " + m.population);
            Repl122 x = new Repl122();
            x.countryName = "Kazakhstan";
            x.capital = "Astana";
            x.population = 18500000;
            System.out.println("The capital of " + x.countryName + " is " + x.capital +
                    " and population is " + x.population);
        }
    }

