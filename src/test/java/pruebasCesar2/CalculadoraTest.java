/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package pruebasCesar2;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalculadoraTest {
    
    @Test
    public void testSumar() {
        int a,b;
        int resultadoEsperado=9;
        a=4;
        b=5;
        assertEquals(resultadoEsperado,Calculadora.sumar(a, b));
    }
    
    @Test(expected = ArithmeticException.class)
    public void testDivisionEntreCero(){
        Calculadora.dividir(4, 0);
    }
   
    @Test(expected = ArithmeticException.class)
    public void testModuloEntreCero(){
        Calculadora.modulo(4, 0);
    }
    
    @Test
    public void testModulo() {
        int resultadoEsperado=1;
        assertEquals(resultadoEsperado,Calculadora.modulo(5, 2));
    }
    
    
}
