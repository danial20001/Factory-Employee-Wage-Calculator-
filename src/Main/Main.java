package Main;

// Main.java
public class Main {
    public static void main(String[] args) {
        Team team = new Team();

        try {
            // Add all employees
            team.addEmployee(new Employee("Andrew", 163, 32, 16));
            team.addEmployee(new Employee("Hafsa", 34, 44, 21));
            team.addEmployee(new Employee("Ayub", 193, 102, 12));
            team.addEmployee(new Employee("Amaan", 309, 56, 1));
            team.addEmployee(new Employee("Gary", 49, 62, 11));
            team.addEmployee(new Employee("Diane", 217, 10, 2));
            team.addEmployee(new QualityController("Rabia", 385, 0, 0));

            // Display employees by the required order
            team.sortAndDisplayEmployees();

        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}