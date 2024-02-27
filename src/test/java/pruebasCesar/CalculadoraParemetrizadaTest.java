/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package pruebasCesar;

import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import pruebasCesar2.Calculadora;

/**
 *
 * @author Vespertino
 */
@RunWith(Parameterized.class)
public class CalculadoraParemetrizadaTest {
    
    private int a,b;
    private int resultadoEsperadoSumar;
    private int resultadoEsperadoRestar;
    private int resultadoEsperadoMultiplicar;
    private int resultadoEsperadoDividir;
    private int resultadoEsperadoModulo;
            
    
    public CalculadoraParemetrizadaTest(int a, int b,
        int resultadoEsperadoSumar,
        int resultadoEsperadoRestar,
        int resultadoEsperadoMultiplicar,
        int resultadoEsperadoDividir,
        int resultadoEsperadoModulo) 
    {
        
        this.a = a;
        this.b = b;
        this.resultadoEsperadoSumar = resultadoEsperadoSumar;
        this.resultadoEsperadoRestar = resultadoEsperadoRestar;
        this.resultadoEsperadoMultiplicar = resultadoEsperadoMultiplicar;
        this.resultadoEsperadoDividir = resultadoEsperadoDividir;
        this.resultadoEsperadoModulo = resultadoEsperadoModulo;
        
    }
        
       @Parameterized.Parameters
       public static Collection<Object[]> data(){
        return Arrays.asList(new Object[][]{
            {2,3,5,-1,6,0,2},
            {5,4,9,1,20,1,1},
            {6,3,9,3,18,2,0}
        });
    }
    
       @Test
    public void testSumar() {
        assertEquals(resultadoEsperadoSumar,Calculadora.sumar(a, b));
    }
    
    @Test
    public void testRestar() {
        assertEquals(resultadoEsperadoRestar,Calculadora.restar(a, b));
    }
    @Test
    public void testMultiplicar() {
        assertEquals(resultadoEsperadoMultiplicar,Calculadora.multiplicar(a, b));
    }
    @Test
    public void testDividir() {
        assertEquals(resultadoEsperadoDividir,Calculadora.dividir(a, b));
    }
    @Test
    public void testModulo() {
        assertEquals(resultadoEsperadoModulo,Calculadora.modulo(a, b));
    }
}
