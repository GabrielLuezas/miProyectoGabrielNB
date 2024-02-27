package pruebasCesar;

import java.util.NoSuchElementException;
import org.junit.After;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TablaEnterosTest {
    
    public TablaEnterosTest() {
    }
    private TablaEnteros tabla;
    private TablaEnteros tablaNulos;
    private int n,numeroNoIncluido;
    
    
    @Before
    public void SetUp(){
        Integer[] datos = {1, 2, 3, 4, 5};
        tabla = new TablaEnteros(datos);
        n=2;
        numeroNoIncluido=6;
    }
    
    @Test
    public void testSumaTabla() {
        System.out.println("sumaTablaC6");
        int expResult = 15;
        assertEquals(expResult, tabla.sumaTabla());
    }
    @Test
    public void testMayorTabla() {
        System.out.println("mayorTablaC7");
        int expResult = 5;
        assertEquals(expResult, tabla.mayorTabla());
    }
    @Test
    public void testPosicionTabla() {
        System.out.println("posicionTablaC8");
        int expResult = 1;
        assertEquals(expResult, tabla.posicionTabla(n));
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testSumaTablaVacia() {
        System.out.println("sumaTablaC9");
        Integer[] datosVacios = {};
        tablaNulos = new TablaEnteros(datosVacios);
        System.out.println("sumaTablaVacia");
        tablaNulos.sumaTabla();
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testMayorTablaVacia() {
        System.out.println("mayorTablaC10");
        Integer[] datosVacios = {};
        tablaNulos = new TablaEnteros(datosVacios);
        System.out.println("mayorTablaVacia");
        tablaNulos.mayorTabla();
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testPosicionTablaVacia() {
        System.out.println("posicionTablaC11");
        Integer[] datosVacios = {};
        tablaNulos = new TablaEnteros(datosVacios);
        System.out.println("PosicionTablaVacia");
        tablaNulos.posicionTabla(n);
    }
    
    @Test(expected = NoSuchElementException.class)
    public void testPosicionTablaNumeroNoEncontrado() {
        System.out.println("posicionTablaC13");
        tabla.posicionTabla(numeroNoIncluido);
    }
    
    @After
    public void tearDown() {
        tabla=null;
        tablaNulos=null;
    }
}
