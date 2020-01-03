import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SumTest {

    Sum s = new Sum();

    @Test
    public void Test1() {
        assertEquals(-1, s.GetSum(0, -1));
        assertEquals(1, s.GetSum(0, 1));
        assertEquals(0, s.GetSum(-10, 10));
        assertEquals(  15, s.GetSum(0,5));
        assertEquals(-5, s.GetSum(-2,-3));

    }

}
