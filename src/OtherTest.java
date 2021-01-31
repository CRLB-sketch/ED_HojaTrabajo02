import junit.framework.TestCase;

public class OtherTest extends TestCase{

    private Calculator<Integer> calc;

    public OtherTest(){
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
