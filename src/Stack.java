/**
 * <h1> Hoja de Trabajo 02 </h1>
 * <h2> Stack (Clase tipo "Interface") </h2>
 * <h3> Extraído de: Ejemplos de Canvas de A&ED </h3>
 * 
 * ADT Calculadora Postfix
 * 
 * Esta clase tendrá proporcionará los métodos importantes para esta misma
 * 
 * <p> Algoritmos Estructuras de datos - Universidad del Valle de Guatemala </p>
 * 
 * Creado por:
 * @author Cristian Fernando Laynez Bachez
 * @version 1.0
 * @since 2021-Enero-30
 **/    

public interface Stack<E> 
{

   public void push(E item); // Agregar
   
   public E pop(); // Quitar y lo regresa
      
   public E peek(); // Regresa el ultimo valor ingresado y el que será eliminado
      
   public boolean empty(); // Esta vacio
   
   public int size(); // Numero de elementos del stack

   public E obtain(int pos); // Para obtener un elemento en específico

}