package src;

import junit.framework.TestCase;

public class OtherTest extends TestCase{

    private Calculator<Integer> calc;
    private Controller ctrl;

    public OtherTest(){
        calc = new Calculator<>();
        ctrl = new Controller();
    }    

    public void testSuma(){

        calc.addOther("5");
        calc.addOther("4");
        
        int resultado = calc.makeOperation('+');        
        int valorEsperado = 9;
        
        assertEquals(valorEsperado, resultado);
    }

    public void testResta(){

        calc.addOther("5");
        calc.addOther("4");
        
        int resultado = calc.makeOperation('-');        
        int valorEsperado = 1;
        
        assertEquals(valorEsperado, resultado);
    }

    public void testMultiplicacion(){

        calc.addOther("6");
        calc.addOther("5");
        
        int resultado = calc.makeOperation('*');        
        int valorEsperado = 30;
        
        assertEquals(valorEsperado, resultado);
    }

    public void testDivision(){

        calc.addOther("100");
        calc.addOther("10");
        
        int resultado = calc.makeOperation('/');        
        int valorEsperado = 10;
        
        assertEquals(valorEsperado, resultado);
    }

    public void testHacerOperacionDeVerdad(){

        // Esto lo deje comentado ya que para hacer esta prueba
        // necesite cambiar el metodo de void a que retornará un int
        // int resultado = ctrl.makeOperation("1 2 + 4 * 3 +");
        // int valorEsperado = 15;

        // assertEquals(valorEsperado, resultado);
    }
}
