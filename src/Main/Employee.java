package Main;

import java.text.NumberFormat;
import java.util.Locale;
// Employee.java
public class Employee {
    protected String name;
    protected int cakesCovered;
    protected double wage;

    public Employee(String name, int cakesCovered, int addedCakes, int wrongCakes) {
        validateInput(name, cakesCovered, addedCakes, wrongCakes);

        // Initialize instance variables
        this.name = name;
        this.cakesCovered = cakesCovered + addedCakes - (2 * wrongCakes);
        this.wage = calculateWage();
    }

    private void validateInput(String name, int cakesCovered, int addedCakes, int wrongCakes) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Name cannot be null or empty.");
        }
        if (cakesCovered < 0 || addedCakes < 0 || wrongCakes < 0) {
            throw new IllegalArgumentException("Cakes covered, added cakes, and wrong cakes must be non-negative.");
        }
    }
    public double calculateWage() {
        // Calculate wage based on number of cakes covered
        return (cakesCovered <= 50) ? (cakesCovered * 0.10) : (50 * 0.10 + (cakesCovered - 50) * 0.15);
    }
    //Getters
    public int getCakesCovered() {
        return cakesCovered;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        // Create a NumberFormat instance for currency formatting
        NumberFormat currencyFormat = NumberFormat.getCurrencyInstance();

        // Return string representation of the object
        return String.format("| %-20s| %-20d| %-20s| %-20s|", name, cakesCovered, currencyFormat.format(wage), "Regular");
    }

}
