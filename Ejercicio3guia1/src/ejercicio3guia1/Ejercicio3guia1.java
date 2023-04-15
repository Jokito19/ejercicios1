/*
Realizar un programa que solo permita introducir solo frases o palabras de 8 
de largo. Si el usuario ingresa una frase o palabra de 8 de largo se deberá 
de imprimir un mensaje por pantalla que diga “CORRECTO”, en caso contrario, 
se deberá imprimir “INCORRECTO”. Nota: investigar la función Lenght() en Java.
 */
package ejercicio3guia1;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejercicio3guia1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        String frase;
        System.out.println("Ingresa una frase");
        frase = leer.nextLine();
        int frasen = frase.length();
        if (frasen == 8) {
            System.out.println("CORRECTO");
        }else 
            System.out.println("INCORRECTO");
            
        }
      
            
        }
    
    

