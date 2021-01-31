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

package src;

import java.util.LinkedList;
 
public class Calculator <T> implements IPila {
    
    // --> Atributos
    private LinkedList<T> numeros;

    // --> Contructor
    public Calculator(){
        numeros = new LinkedList<T>();
    }

    // --> Métodos        
    @Override
    public int push(int result){
        return 0;
    }

    @Override
    public int pop(){
        return 0;
    }

    @Override
    public void add(){

    }

    @Override
    public void clean(){

    }

    public int sum(){
        return 0;
    }
    
    public int substract(){
        return 0;
    }

    public int multiply(){
        return 0;
    }

    public int divition(){
        return 0;
    }

    @Override
    public String toString(){
        return "ADT Calculator ;)";
    }
}
