/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio11.pkg18.bis;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejercicio1118Bis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una frase por favor");
        System.out.println(reemplazarVocales(leer.nextLine()));
    }

    public static String reemplazarVocales(String frase) {
        String nuevaFrase = "";
        for (int i = 0; i < frase.length(); i++) {
            char letra = frase.charAt(i);
            switch (Character.toLowerCase(letra)) {
                case 'a':
                    nuevaFrase = nuevaFrase.concat("@");
                    break;
                case 'e':
                    nuevaFrase = nuevaFrase.concat("#");
                    break;
                case 'i':
                    nuevaFrase = nuevaFrase.concat("$");
                    break;
                case 'o':
                    nuevaFrase = nuevaFrase.concat("%");
                    break;
                case 'u':
                    nuevaFrase = nuevaFrase.concat("*");
                    break;
                default:
                    nuevaFrase = nuevaFrase.concat(String.valueOf(letra));
                    break;
            }
        }
        return nuevaFrase;
    }
}