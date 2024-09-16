import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SalaryWorkerTest {
    SalaryWorker salaryWorker;

    @BeforeEach
    void setUp() {
        salaryWorker = new SalaryWorker("0000099", "Lisa", "Lee", "Miss", 1999, 20, 100000);
    }

    @Test
    void calculateWeeklyPay() {
        assertEquals(1923.08, salaryWorker.calculateWeeklyPay(40));
    }

    @Test
    void displayWeeklyPay() {
        salaryWorker.displayWeeklyPay(40);
    }

    @Test
    void testToString() {
        assertEquals("SalaryWorker{annualSalary=100000.0}", salaryWorker.toString());
    }

    @Test
    void toCSV() {
        assertEquals("<Worker></Worker><annualSalary>100000.0</annualSalary>", salaryWorker.toCSV());
    }

    @Test
    void toJSON() {
        assertEquals("{, \"annualSalary\":100000.0}", salaryWorker.toJSON());
    }
}