/*
Escriba un programa que pida una frase o palabra y valide si la primera letra
de esa frase es una ‘A’. Si la primera letra es una ‘A’, se deberá de imprimir 
un mensaje por pantalla que diga “CORRECTO”, en caso contrario, se deberá
imprimir “INCORRECTO”. Nota: investigar la función Substring y equals() de Java.
 */
package ejercicio4guia2;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejercicio4guia2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
        System.out.println("Introduzca una frase");
        String frase = leer.nextLine();
        String frase2 = frase.substring(0,1);
        if (frase2.equalsIgnoreCase("A")) {
            System.out.println("Correcto");
                  
        }else System.out.println("Incorrecto");
              
        
            
        
        
        
        
        
    }
    
}
