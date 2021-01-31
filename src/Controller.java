/**
 * <h1> Hoja de Trabajo 02 </h1>
 * <h2> Controller (Clase tipo "Controlador") </h2>
 * 
 * ADT Calculadora Postfix
 * 
 * Esta clase ejecutará toda la lógica correspondiente del programa.
 * 
 * <p> Algoritmos Estructuras de datos - Universidad del Valle de Guatemala </p>
 * 
 * Creado por:
 * @author Cristian Fernando Laynez Bachez
 * @version 1.0
 * @since 2021-Enero-30
 **/    

package src;

public class Controller {
    
    // --> Atributos
    private Calculator<Integer> calc;
    private ReaderTxt rTxt;
    private View view;
    private boolean out;

    // --> Contructor
    public Controller(){
        calc = new Calculator<>();
        rTxt = new ReaderTxt();
        view = new View();
        out = false;
    }

    // --> Metodos
    public void main_menu(){

        do {
            
            String option = view.menu();

            switch (option) {

                // Leer archivo predeterminado
                case "1":
                    String file1 = rTxt.readFile("src\\defaultTxt.txt");
                    
                    if(file1.equals("-> No se encontro el archivo")){
                        view.dialogueText(file1);
                    }
                    else{ // Por sí se leyo correctamente el archivo
                        makeOperation(file1);
                    }
                
                    break;

                // Leer otro archivo ajeno
                case "2":
                    String file_choiced = view.askFile();
                    String file2 = rTxt.readFile(file_choiced);

                    if(file2.equals("-> No se encontro el archivo")){
                        view.dialogueText(file2);
                    }
                    else{ // Por sí se leyo correctamente el archivo
                        makeOperation(file2);
                    }

                    break;

                // Salir/Terminar el programa
                case "3":
                    out = true;
                    view.farewell();                                        
                    break;
                    
                // Opción inválida
                default:
                    view.invalid();
                    break;
            }

        } while (!out);
    }

    private void makeOperation(String operation){

        // Hacer los procesos para obtener la respuesta


        // Mostrar los resultados finales y 
        // preguntar si desea continuar o no
        String desition = view.result(operation, 0);

        if(desition.equals("n") || desition.equals("N")){
            out = true;
            view.farewell();
        }
    }
    
}
