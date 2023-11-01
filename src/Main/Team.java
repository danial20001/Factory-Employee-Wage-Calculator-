package Main;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.text.NumberFormat;
import java.util.Locale;


// Team.java
public class Team {
    public List<Employee> employees;

    // Constructor
    public Team() {
        this.employees = new ArrayList<>();
    }

    // Add an employee to the team
    public void addEmployee(Employee employee) {
        if (employee == null) {
            throw new IllegalArgumentException("Employee cannot be null.");
        }
        employees.add(employee);
    }

    // Calculate the total wages for all employees
    public double calculateTotalWages() {
        return employees.stream().mapToDouble(Employee::calculateWage).sum();
    }

    // Calculate the total number of cakes covered by all employees
    public int calculateTotalCakes() {
        return employees.stream().mapToInt(Employee::getCakesCovered).sum();
    }

    // Sort employees by the required order
    public void sortEmployees() {
        employees.sort(Comparator.comparingInt(Employee::getCakesCovered).reversed()
                .thenComparing(Employee::getName));
    }

    // Display all employees with their respective attributes
    public void displayEmployees() {
        // Create a NumberFormat instance for currency formatting
        NumberFormat currencyFormat = NumberFormat.getCurrencyInstance(Locale.UK);

        System.out.println("-----------------------------------------------------------------------------------------");
        System.out.printf("| %-20s| %-20s| %-20s| %-20s|%n", "Name", "Cakes", "Wages", "Role");
        System.out.println("-----------------------------------------------------------------------------------------");

        employees.forEach(employee -> System.out.println(employee));

        System.out.println("-----------------------------------------------------------------------------------------");
        System.out.printf("Total Wages: %s%n", currencyFormat.format(calculateTotalWages()));
        System.out.printf("Total Cakes: %d%n", calculateTotalCakes());
    }




    //Sort and Display Employees List
    public void sortAndDisplayEmployees() {
        sortEmployees();
        displayEmployees();
    }

}
