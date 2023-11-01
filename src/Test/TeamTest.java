package Test;

import Main.Employee;
import Main.Team;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TeamTest {
    private Team team;

    @BeforeEach
    void setUp() {
        // Initialize a Team object with some employees for testing
        team = new Team();

        team.addEmployee(new Employee("Bob", 198, 56, 20));
        team.addEmployee(new Employee("Danial", 109, 10, 0));
        team.addEmployee(new Employee("Alice", 198, 56, 20));
    }

    @Test
    void testAddEmployee() {
        // Test if an employee is added to the team correctly
        Employee employee = new Employee("Bob", 49, 0, 0);
        team.addEmployee(employee);
        assertTrue(team.calculateTotalCakes() == 49, "Adding an employee to the team failed.");
    }

    @Test
    void testCalculateTotalWagesAndCakes() {
        // Test if the total wages and total cakes calculations are correct
        double expectedTotalWages = 29.60 + 15.35 + 29.60;
        assertEquals(expectedTotalWages, team.calculateTotalWages(), 0.01, "Total wages calculation is incorrect.");
        assertEquals(547, team.calculateTotalCakes(), "Total cakes calculation is incorrect.");
    }

    @Test
    void testSortEmployees() {
        // Test if employees are sorted correctly by cakes covered (descending) and name (alphabetical)
        Employee employee1 = new Employee("Bob", 198, 56, 20);
        Employee employee2 = new Employee("Danial", 109, 10, 0);
        Employee employee3 = new Employee("Alice", 198, 56, 20);

        team.addEmployee(employee1);
        team.addEmployee(employee2);
        team.addEmployee(employee3);

        team.sortEmployees();

        assertEquals(employee1, team.employees.get(0), "Sorting employees by cakes covered is incorrect.");
        assertEquals(employee3, team.employees.get(1), "Sorting employees by name when cakes covered is the same is incorrect.");
        assertEquals(employee2, team.employees.get(2), "Sorting employees by name when cakes covered is the same is incorrect.");
    }
}
