import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class SalaryWorkerTest
{
    Person p1, p2;
    Worker pw1, pw2;

    SalaryWorker psw1, psw2;
    @BeforeEach
    void setup()
    {
        p1 = new Person("000abc","Bob","Smith","Mr.",1950);
        p2 = new Person("000123","Jane","Smith","Mrs.",1952);
        pw1 = new Worker(p1, 20.00);
        pw2 = new Worker(p2, 10.00);
        psw1 = new SalaryWorker(p1, 40000);
        psw2 = new SalaryWorker(p2, 80000);
    }

    @Test
    void calculateWeeklyPay1()
    {
        assertEquals(769.2307692307693,psw1.calculateWeeklyPay(0.0));
    }

    @Test
    void calculateWeeklyPay2()
    {
        assertEquals(1538.4615384615386,psw2.calculateWeeklyPay(0.0));
    }

}
