package src;

/**
 * <h1> Hoja de Trabajo 02 </h1>
 * <h2> ReaderTxt </h2>
 * 
 * ADT Calculadora Postfix
 * 
 * Esta clase se encargará de leer los archivos txt para obtener su información
 * 
 * <p> Algoritmos Estructuras de datos - Universidad del Valle de Guatemala </p>
 * 
 * Creado por:
 * @author Cristian Fernando Laynez Bachez
 * @version 1.0
 * @since 2021-Enero-30
 **/    

import java.io.BufferedReader;
import java.io.FileReader;

public class ReaderTxt {

    /////////////////////////////////////////////////
    // --> Atributos
    private BufferedReader bf;
    private String text;

    /////////////////////////////////////////////////
    // --> Constructor
    public ReaderTxt(){
        text = "";
    }

    /////////////////////////////////////////////////
    // --> Métodos

    /** 
     * Método para leer el archivo ingresado
     * 
     * @param file      Para solicitar la dirección del archivo.
     * @return String   Para retornar el texto del archivo
     *                  o la información.
     */
    public String readFile(String file){
        try {
            bf = new BufferedReader(new FileReader(file));
            String temp = "";
            String bfRead;

            while((bfRead = bf.readLine()) != null){
                temp = temp + bfRead;
            }

            text = temp;

        } catch (Exception e) {
            text = "-> No se encontro el archivo";
        }

        return text;
    }

}
