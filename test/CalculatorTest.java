/**
 * <h1> Hoja de Trabajo 02 </h1>
 * <h2> CalculatorTest (Clase para pruebas JUnit) </h2>
 * 
 * ADT Calculadora Postfix
 * 
 * En esta clase se realizarán pruebas Unitarias específicamente para
 * la calculadora que se llevará a cabo
 * 
 * <p> Algoritmos Estructuras de datos - Universidad del Valle de Guatemala </p>
 * 
 * Creado por:
 * @author Cristian Fernando Laynez Bachez
 * @version 1.0
 * @since 2021-Enero-30
 **/    

package test;

import junit.framework.TestCase;
import src.Calculator;

public class CalculatorTest extends TestCase {
    
    private Calculator<Integer> calc;

    public CalculatorTest(){
        calc = new Calculator<>();
    }    

    public void testPush(){
        int resultado = calc.push(0);
        int valorEsperado = 0;

        // Solo quería ver si esta clase funcionaba 
        // bien en general jsjs
        assertEquals(valorEsperado, resultado);
    }
}
