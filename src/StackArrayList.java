/**
 * <h1> Hoja de Trabajo 02 </h1>
 * <h2> StackArrayList (Clase tipo "Generica") </h2>
 * <h3> Extraído de: Ejemplos de Canvas de A&ED </h3>
 * 
 * ADT Calculadora Postfix
 * 
 * Esta clase tendrá será un ArrayList, esta proporcionará las bases necesarias
 * para llevar a cabo esta misma.
 * 
 * <p> Algoritmos Estructuras de datos - Universidad del Valle de Guatemala </p>
 * 
 * Creado por:
 * @author Cristian Fernando Laynez Bachez
 * @version 1.0
 * @since 2021-Enero-30
 **/    

import java.util.ArrayList;

public class StackArrayList<E> implements Stack<E>
{
	/////////////////////////////////////////////////
	// --> Atributos	
	protected ArrayList<E> data;

	/////////////////////////////////////////////////
	// --> Atributos	
	public StackArrayList() {
		data = new ArrayList<E>();
	}

	/////////////////////////////////////////////////
	// --> Métodos	

	/** 
	 * Este método hará push a este ArrayList.
	 * 
	 * @param item	Representará el dato que se ingresará.
	 */
	public void push(E item) {
		data.add(item);
	}
	
	/**
	* Este método removerá el dato de "encima".
	*
	* @return E		El dato eliminado.
	*/
	public E pop() {
		return data.remove(size()-1);
	}
	
	/** 
	 * Este método obtendrá el ultimo dato ingresado.
	 * 
	 * @return E	El ultimo dato del Array.
	 */
	public E peek() {
		return data.get(size() - 1);
	}
		
	/** 
	 * Se regresará el tamaño del Array.
	 * 
	 * @return int	El tamaño del Array.
	 */
	public int size() {
		return data.size();
	}
  	
	/** 
	 * Se verificará si esta vacio o no.
	 * 
	 * @return boolean	Si tiene 0 o no.
	 */
	public boolean empty() {
		return size() == 0;
	}
	
	/**
	* Este método nos servirá para obtener
	* un dato en específico.
	*
	* @param pos  	La posicion del dato.
	* @return E		El dato escogido.        
	*/
	public E obtain(int pos){
		return data.get(pos);
	}

	/**
	 * Para limpiar el ArrayList.
	 */
	public void clean(){
		data.clear();
	}
}