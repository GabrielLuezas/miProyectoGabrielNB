
package pruebasCesar;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author Vespertino
 */
public class FechaTest {
    
    public FechaTest() {
    }

    /**
     * Test of devuelveFecha method, of class Fecha.
     */
    
    @Test
    public void testDevuelveFechaC1() {
        System.out.println("devuelveFechaC1");
        int tipo = 3;
        Fecha instance = new Fecha();
        String expResult = "01/24";
        System.out.println(expResult);
        String result = instance.devuelveFecha(tipo);
        assertEquals(expResult, result);
    }
    @Test
    public void testDevuelveFechaC2() {
        System.out.println("devuelveFechaC2");
        int tipo = 0;
        Fecha instance = new Fecha();
        String expResult = "ERROR";
        System.out.println(expResult);
        String result = instance.devuelveFecha(tipo);
        assertEquals(expResult, result);
    }
    @Test
    public void testDevuelveFechaC3() {
        System.out.println("devuelveFechaC3");
        int tipo = 4;
        Fecha instance = new Fecha();
        String expResult = "ERROR";
        System.out.println(expResult);
        String result = instance.devuelveFecha(tipo);
        assertEquals(expResult, result);
    }
}
