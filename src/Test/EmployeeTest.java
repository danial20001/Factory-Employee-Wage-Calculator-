package Test;

import Main.Employee;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {
    private Employee employee;

    @BeforeEach
    void setUp() {
        // Initialize employee to null before each test
        employee = null;
    }

    @Test
    void testWageCalculationLessThan50Cakes() {
        // Test wage calculation for an employee with less than 50 cakes covered
        employee = new Employee("Bob", 49, 0, 0);
        assertEquals(4.90, employee.calculateWage(), "Wage calculation for cakes covered less than 50 is incorrect.");
    }

    @Test
    void testNegativeAddedCakesException() {
        // Test if an exception is thrown when a negative value is passed for addedCakes
        assertThrows(IllegalArgumentException.class, () -> {
            employee = new Employee("Danial", 109, -10, 0);
        }, "Exception not thrown when negative number is added for addedCakes.");
    }

    @Test
    void testCorrectCalculation() {
        // Test wage calculation with a valid input
        employee = new Employee("Bob", 198, 56, 20);
        assertEquals(29.6, employee.calculateWage(),0.01, "Wage calculation for the given input is incorrect.");
    }
}
