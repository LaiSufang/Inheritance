import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WorkerTest {
    Worker worker;

    @BeforeEach
    void setUp() {
        worker = new Worker("0000099", "Lisa", "Lee", "Miss", 1999, 20);
    }

    @Test
    void calculateWeeklyPay() {
        assertEquals(800, worker.calculateWeeklyPay(40));
    }

    @Test
    void calculateWeeklyPay2() {
        assertEquals(800 + 20 * 1.5 * 10, worker.calculateWeeklyPay(50));
    }

    @Test
    void testToString() {
        assertEquals("Worker{hourlyPayRate=20.0}", worker.toString());
    }

    @Test
    void toMXL() {
        assertEquals("<Person></Person><hourlyPayRate>20.0</hourlyPayRate>", worker.toMXL());
    }

    @Test
    void toJSON() {
        assertEquals("{, \"hourlyPayRate\":20.0}", worker.toJSON());
    }
}