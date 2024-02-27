package pruebasCesar;

import org.junit.After;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
public class FactorialTest {
    
    public FactorialTest() {
    }
    @Test
    public void testCalculoC4() {
        System.out.println("calculoC4");
        int n = 4;
        int expResult = 24;
        int result = Factorial.calculo(n);
        assertEquals(expResult, result);
        System.out.println(result);
        
    }
    @Test(expected = IllegalArgumentException.class)
    public void testCalculoC5() {
        int n=-2;
        System.out.println("calculoC5");
        Factorial.calculo(n);
    }
}
