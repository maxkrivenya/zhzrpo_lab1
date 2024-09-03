package demo.test;
import demo.parallel.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ComplexTests {
    private final Complex c2_3 = new Complex(2, 3);
    private final Complex c1_2 = new Complex(1, 2);
    private final Complex c2_3times10 = new Complex(20, 30);
    private final Complex c2_3divc1_2 = new Complex(1.6, -0.2);

    @Test
    void testTimesReal(){
        Complex result = c2_3.timesReal(10);
        assertEquals(result.getRe(), c2_3times10.getRe());
        assertEquals(result.getIm(), c2_3times10.getIm());
    }

    @Test
    void testDivideBy(){
        Complex result = c2_3.divideBy(c1_2);
        assertEquals(result.getRe(), c2_3divc1_2.getRe());
        assertEquals(result.getIm(), c2_3divc1_2.getIm());
    }
}
