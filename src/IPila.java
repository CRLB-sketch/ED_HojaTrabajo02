package src;

/**
 * <h1>Hoja de Trabajo 02</h1>
 * <h2>IPila (Interface)</h2>
 * 
 * ADT Calculadora Postfix
 * 
 * Esta interface definirá las bases principales para la calculadora
 * 
 * <p>
 * Algoritmos Estructuras de datos - Universidad del Valle de Guatemala
 * </p>
 * 
 * Creado por:
 * 
 * @author Cristian Fernando Laynez Bachez
 * @version 1.0
 * @since 2021-Enero-30
 **/    

interface IPila<T> {
    public void addOther(String o);
    public int makeOperation(char c);
    public boolean isOperator(char c);
}