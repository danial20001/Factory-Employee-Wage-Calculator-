package Test;// QualityControllerTest.java

import Main.QualityController;
import Main.Employee;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class QualityControllerTest {

    @Test
    void testQualityControllerWage() {
        // Test wage calculation for a QualityController employee
        // Verify if the 12% raise is correctly applied to the base wage
        QualityController qc = new QualityController("Rabia", 150, 0, 0);
        double expectedWage = (50 * 0.10 + (150 - 50) * 0.15) * 1.12;
        assertEquals(expectedWage, qc.calculateWage(), 0.01, "QualityController wage calculation is incorrect.");
    }
}
