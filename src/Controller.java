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

import java.lang.NumberFormatException;
 
public class Controller {
    
    /////////////////////////////////////////////////
    // --> Atributos
    private ADTCalculator adtCalc;
    private ReaderTxt rTxt;
    private View view;
    private boolean out;

    /////////////////////////////////////////////////
    // --> Contructor
    public Controller(){
        adtCalc = new ADTCalculator();
        rTxt = new ReaderTxt();
        view = new View();
        out = false;
    }

    /////////////////////////////////////////////////
    // --> Metodos

    /**
     * Método para llevar a cabo la lógica del menu principal
     */
    public void main_menu(){

        do {
            
            String option = view.menu();

            switch (option) {

                // Leer archivo predeterminado
                case "1":
                    String file1 = rTxt.readFile("defaultTxt.txt");
                    
                    if(file1.equals("-> No se encontro el archivo")){
                        view.dialogueText(file1);
                    }
                    else{ // Por sí se leyo correctamente el archivo
                        makeOperation2(file1);
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
                        makeOperation2(file2);
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

    
    /** 
     * Este método tendrá toda la logíca para llevar a 
     * cabo la operación.
     * 
     * @param operation La operación del archivo
     */
    private void makeOperation2(String operation){
        
        int final_answer = 0;
        String[] the_operation = operation.split(" ");

        try {
            for(String op: the_operation){
    
                if(!adtCalc.isOperator(op)){ // Si es numero
                    adtCalc.pushNum(op);
                }
                else{ // Si es operador                
                    final_answer = adtCalc.makeOperation(op);
                }
            }
            
            adtCalc.clean(); // Para limpiar los datos 
    
            // Mostrar los resultados finales
            view.result(operation, final_answer);                    
        } 
        catch (NumberFormatException e) {
            view.errorLetter();
        }
        catch(Exception e){
            view.errorUnknow();
        }
    }           
}
