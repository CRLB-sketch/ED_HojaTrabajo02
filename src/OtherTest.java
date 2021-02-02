package src;

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

        int resultado = adtCal.makeOperation("+");
        int valorEsperado = 12;

        assertEquals(resultado, valorEsperado);
    }

    public void testResta(){
        adtCal.pushNum("10");
        adtCal.pushNum("2");

        int resultado = adtCal.makeOperation("-");
        int valorEsperado = 8;

        assertEquals(resultado, valorEsperado);
    }

    public void testMultiplicacion(){
        adtCal.pushNum("10");
        adtCal.pushNum("2");

        int resultado = adtCal.makeOperation("*");
        int valorEsperado = 20;

        assertEquals(resultado, valorEsperado);
    }

    public void testDivision(){
        adtCal.pushNum("10");
        adtCal.pushNum("2");

        int resultado = adtCal.makeOperation("/");
        int valorEsperado = 5;

        assertEquals(resultado, valorEsperado);
    }
}
