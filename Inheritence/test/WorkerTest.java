import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class WorkerTest {
    Person p1, p2;
    Worker pw1, pw2;
    @BeforeEach
    void setup()
    {
        p1 = new Person("000abc","Bob","Smith","Mr.",1950);
        p2 = new Person("000123","Jane","Smith","Mrs.",1952);
        pw1 = new Worker(p1, 20.00);
        pw2 = new Worker(p2, 10.00);
    }


    @Test
    void calculateWeeklyPay()
    {
        assertEquals(400,pw1.calculateWeeklyPay(20));
    }

    @Test
    void calculateWeeklyOvertime()
    {
        assertEquals(950,pw1.calculateWeeklyPay(45));
    }

}
