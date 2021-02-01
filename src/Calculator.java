package src;

/**
 * <h1> Hoja de Trabajo 02 </h1>
 * <h2> Calculator/Calculadora (Clase tipo "Modulo") </h2>
 * 
 * ADT Calculadora Postfix
 * 
 * Esta clase será la calculadora para hacer las operaciones solicitadas.
 * Esta implementará la interface "IPila"
 * 
 * <p> Algoritmos Estructuras de datos - Universidad del Valle de Guatemala </p>
 * 
 * Creado por:
 * @author Cristian Fernando Laynez Bachez
 * @version 1.0
 * @since 2021-Enero-30
 **/    

import java.util.ArrayList;
 
public class Calculator<T> implements IPila<T> {
    
    // --> Atributos    
    private ArrayList<String> numbers;

    // --> Contructor
    public Calculator(){
        numbers = new ArrayList<String>();    
    }

    // --> Métodos        
    @Override
    public void addOther(String o){
        numbers.add(o);
    }
    
    @Override
    public int makeOperation(char c){
        
        int resultado = 0;        
        
        int count = 0;
        for (String character : numbers) {
            int number = Integer.parseInt(character);

            if(c == '+')
                resultado = sum(resultado, number);            
            if(c == '-')
                resultado = substract(resultado, number);                            
            if(c == '*')
                if(count == 0)                
                    resultado = multiply(1, number);
                else
                    resultado = multiply(resultado, number);            
            if(c == '/')
                resultado = divition(resultado, number, count);

            count++; // Para sumar las veces del control

            // Para arreglar el numero de la resta jeje!
            if(numbers.get(numbers.size()-1) == character && c == '-'){
                resultado = -1 * resultado;
            }
        }

        numbers.clear();
        String newValue = Integer.toString(resultado);
        numbers.add(newValue);

        return resultado;
    }
    
    public int sum(int resultado, int number){        
        return resultado + number;
    }
    
    public int substract(int resultado, int number){            
        return number - resultado;
    }

    public int multiply(int resultado, int number){
        return resultado * number;
    }

    public int divition(int resultado, int number, int controll){
        if(controll == 0){
            return number / 1;
        }
        else{
            return resultado / number;
        }
    }

    @Override
    public boolean isOperator(char c){
        switch (c) {
            case '+', '-', '*', '/':
                return true;            
                
            default:
                return false;                
        }
    }

    @Override
    public String toString(){
        return "ADT Calculator ;)";
    }
}
