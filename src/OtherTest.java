/**
 * <h1> Hoja de Trabajo 02 </h1>
 * <h2> OtherTest (Clase tipo "JUnit") </h2>
 * 
 * ADT Calculadora Postfix
 * 
 * Esta clase se realizarán pruebas unitarias.
 * 
 * <p> Algoritmos Estructuras de datos - Universidad del Valle de Guatemala </p>
 * 
 * Creado por:
 * @author Cristian Fernando Laynez Bachez
 * @version 1.0
 * @since 2021-Enero-30
 **/    

import junit.framework.TestCase;

public class OtherTest extends TestCase{

    // --> Atributos
    private Controller ctrl;
    private ADTCalculator adtCal;

    // --> Constructor
    public OtherTest(){
        ctrl = new Controller();
        adtCal = new ADTCalculator();
    }        

    // --> Métodos
    public void testSuma(){
        adtCal.pushNum("10");
        adtCal.pushNum("2");

        double resultado = adtCal.resolver("+");
        double valorEsperado = 12;

        assertEquals(resultado, valorEsperado);
    }

    public void testResta(){
        adtCal.pushNum("10");
        adtCal.pushNum("2");

        double resultado = adtCal.resolver("-");
        double valorEsperado = 8;

        assertEquals(resultado, valorEsperado);
    }

    public void testMultiplicacion(){
        adtCal.pushNum("10");
        adtCal.pushNum("2");

        double resultado = adtCal.resolver("*");
        double valorEsperado = 20;

        assertEquals(resultado, valorEsperado);
    }

    public void testDivision(){
        adtCal.pushNum("10");
        adtCal.pushNum("2");

        double resultado = adtCal.resolver("/");
        double valorEsperado = 5;

        assertEquals(resultado, valorEsperado);
    }
}
