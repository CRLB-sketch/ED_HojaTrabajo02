package src;

/**
 * <h1> Hoja de Trabajo 02 </h1>
 * <h2> View (Clase tipo "Vista") </h2>
 * 
 * ADT Calculadora Postfix
 * 
 * Esta clase será la vista del programa. En esta tendremos los mensajes del programa
 * y podrá recibir los inputs de los usuarios.
 * 
 * <p> Algoritmos Estructuras de datos - Universidad del Valle de Guatemala </p>
 * 
 * Creado por:
 * @author Cristian Fernando Laynez Bachez
 * @version 1.0
 * @since 2021-Enero-30
 **/    

import java.util.Scanner;

public class View {

    // --> Atributos
    private Scanner scan;

    // --> Contructor
    public View(){
        scan = new Scanner(System.in);
    }

    // --> Metodos
    public String menu(){
        System.out.println("*** ADT Calculadora ***");
        System.out.println("Menu: ");
        System.out.println("1. Leer archivo predeterminado");
        System.out.println("2. Leer otro archivo");
        System.out.println("3. Salir");
        
        String option = scan.nextLine();
        return option;
    }

    public void invalid(){
        System.out.println("-> Opción Invalida");
    }

    public String askFile(){
        System.out.println("Ingrese el nombre del archivo que desee leer");
        System.out.println("--------------------------------------------");
        System.out.println("Ejemplos");
        System.out.println("[E0] -> nombrearchivo.txt");
        System.out.println("[E1] -> src\\nombrearchivo.txt");
        System.out.println("[E2] -> D:\\Funalito\\Archivos\\nombrearchivo.txt");
        System.out.println("Nota: Este ultimo puede variar depende de tu directorio");
        System.out.println("--------------------------------------------");
        
        String file = scan.nextLine();
        return file;
    }

    public void dialogueText(String information){
        System.out.println(information);
    }

    public String result(String operation, int final_number){
        System.out.println(operation);
        System.out.println("Resultado: " + final_number);

        System.out.println("\n¿Desea hacer otra operación? (s/n)");
        
        String desition = scan.nextLine();
        return desition;
    }

    public void farewell(){
        System.out.println("Saliendo...");
    }

}
