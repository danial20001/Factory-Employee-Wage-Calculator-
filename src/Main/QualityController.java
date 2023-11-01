package Main;

import java.text.NumberFormat;

public class QualityController extends Employee {
    public QualityController(String name, int cakesCovered, int addedCakes, int wrongCakes) {
        // Call superclass constructor to initialize instance variables
        super(name, cakesCovered, addedCakes, wrongCakes);
        this.wage = calculateWage();
    }

    @Override
    public double calculateWage() {
        // Override calculateWage method to give QualityController employees a 12% raise
        return super.calculateWage() * 1.12;
    }

    @Override
    public String toString() {
        // Create a NumberFormat instance for currency formatting
        NumberFormat currencyFormat = NumberFormat.getCurrencyInstance();

        // Return string representation of the object
        return String.format("| %-20s| %-20d| %-20s| %-20s|", name, cakesCovered, currencyFormat.format(wage), "QC");
    }


}
