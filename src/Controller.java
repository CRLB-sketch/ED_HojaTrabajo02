package src;

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

public class Controller {
    
    // --> Atributos
    private Calculator<Character> calc;
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

    public void makeOperation(String operation){

        // Hacer los procesos para obtener la respuesta
        int final_answer = 0;        
        
        for (int i = 0; i < operation.length(); i++) {            
            char the_char = operation.charAt(i);
            String the_string = String.valueOf(the_char);                
            
            if(!calc.isOperator(the_char)){ // Si es numero
                if(the_string.equals(" ")){                    
                }
                else{
                    calc.addOther(the_string);
                }
            }
            else{ // Si es operador                       
                final_answer = calc.makeOperation(the_char);                
            }
        }
        
        // Mostrar los resultados finales y se tomará la desicion si continuar o no
        String desition = view.result(operation, final_answer);
        
        // Preguntar si desea continuar o no
        if(desition.equals("n") || desition.equals("N")){
            out = true;
            view.farewell();
        }

        // return final_answer;
    }
    
}
