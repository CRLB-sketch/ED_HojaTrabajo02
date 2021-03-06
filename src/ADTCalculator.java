/**
 * <h1> Hoja de Trabajo 02 </h1>
 * <h2> ADTCalculator / ADTCalculadora (Clase tipo "Modulo") </h2>
 * 
 * ADT Calculadora Postfix
 * 
 * Esta clase será la ADT Calculadora, con esta se realizarán las correspondientes
 * operaciones.
 * 
 * <p> Algoritmos Estructuras de datos - Universidad del Valle de Guatemala </p>
 * 
 * Creado por:
 * @author Cristian Fernando Laynez Bachez
 * @version 1.0
 * @since 2021-Enero-30
 **/    

public class ADTCalculator implements Icalculadora {
    
    /////////////////////////////////////////////////
	// --> Atributos	
    private StackArrayList<String> numbers;

    /////////////////////////////////////////////////
    // --> Constructor
    public ADTCalculator(){
        numbers = new StackArrayList<String>();
    }

    /////////////////////////////////////////////////
    // --> Métodos
    
    /** 
	 * Este método hará push a este ArrayList.
	 * 
	 * @param num	Representará el dato que se ingresará.
	 */
    public void pushNum(String num){
        numbers.push(num);        
    }

    /**
     * Para limpiar los numeros.
     */
    public void clean(){
        numbers.clean();
    }
    
    /** 
     * En este método podremos hacer todas las operaciones
     * que necesitemos.
     * 
     * @param op    Representará la operación que se
     *              llevará a cabo.
     * @return int  Retornará el resultado.
     */
    public double resolver(String op){
        int result = 0; 
        
        for (int i = 0; i < numbers.size(); i++) {
            String the_String = numbers.obtain(i);
            int number = Integer.parseInt(the_String);
            
            if(op.equals("+"))
                result = sum(result, number);
            if(op.equals("-"))
                result = substract(result, number);
            if(op.equals("*"))
                result = multiply(result, number, i);
            if(op.equals("/"))
                result = divition(result, number, i);                

            // Para arreglar el numero de la resta jsjs
            if(numbers.obtain(numbers.size()-1) == the_String && op.equals("-")){
                result = -1 * result;
            }
        }

        // Para remover todos los numeros del ArrayList
        for (int i = 0; i < numbers.size()+1; i++) {
            numbers.pop();
        }
        
        // Para agregar el nuevo valor
        String newValue = Integer.toString(result);    
        numbers.push(newValue);
        
        return result;
    }
   
    /** 
     * Para hacer una suma.
     * 
     * @param result    El numero que se lleva en la cola.
     * @param number    El numero que se solicito.
     * @return int      El resultado de la suma.
     */
    private int sum(int result, int number){    
        return result + number;
    }
        
    /** 
     * Para hacer una resta.
     * 
     * @param result    El numero que se lleva en la cola.
     * @param number    El numero que se solicito.
     * @return int      El resultado de la resta.
     */
    private int substract(int result, int number){            
        return number - result;
    }
    
    /** 
     * Para hacer una multiplicación
     * 
     * @param result    El numero que se lleva en la cola.
     * @param number    El numero que se solicito
     * @param controll  Para saber en que estado del ciclo estamos
     * @return int      El resultado de la multiplicación
     */
    private int multiply(int result, int number, int controll){
        if(controll == 0)
            return number * 1;        
        else
            return result * number;        
    }
   
    /** 
     * Para hacer una división
     * 
     * @param result    El numero que se lleva en la cola.
     * @param number    El numero que se solicito
     * @param controll  Para saber en que estado del ciclo estamos
     * @return int      El resultado de la división
     */
    private int divition(int result, int number, int controll){
        if(controll == 0)
            return number / 1;        
        else
            return result / number;        
    }
   
    /** 
     * Este método determinará si estamos ante un
     * numero o en una operación.
     * 
     * @param c         Representará el caracter introducido.
     * @return boolean  Retornará is es operador o no.
     */
    public boolean isOperator(String c){
        switch (c) {
            case "+":
                return true;
            case "-":
                return true;
            case "*":
                return true;
            case "/":
                return true;                
            default:
                return false;                
        }
    }
}
