/*
 Escribir un programa que procese una secuencia de caracteres ingresada por
teclado y terminada en punto, y luego codifique la palabra o frase ingresada 
de la siguiente manera: cada vocal se reemplaza por el carácter que se indica 
en la tabla y el resto de los caracteres (incluyendo a las vocales acentuadas) 
se mantienen sin cambios
Realice un subprograma que reciba una secuencia de caracteres y retorne la
codificación correspondiente. Utilice la estructura “según” para la transformación. 
Por ejemplo, si el usuario ingresa:     Ayer, lunes, salimos a las once y 10.
La salida del programa debería ser:  @y#r, l*n#s, s@l$m%s @ l@s %nc# y 10.

 */
package ejer18.guia.pkg4;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejer18Guia4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner leer = new Scanner(System.in).useDelimiter("\n");
        String palabra;
        do {
            System.out.println("Ingrese una palabra o frase que termine con un punto:");
            palabra = leer.nextLine();
        } while (!palabra.endsWith("."));
        cambiarLetras(palabra);
    }

    public static void cambiarLetras(String palabra) {
        //a = @ - e = # - i = $ - o = % - u = *
        String palabraAuxiliar = "";
        for (int i = 0; i < palabra.length(); i++) {
            switch (palabra.substring(i, i + 1)) {
                case "a":
                case "A":
                    palabraAuxiliar = palabraAuxiliar.concat("@");
                    break;
                case "e":
                case "E":
                    palabraAuxiliar = palabraAuxiliar.concat("#");
                    break;
                case "i":
                case "I":
                    palabraAuxiliar = palabraAuxiliar.concat("$");
                    break;
                case "o":
                case "O":
                    palabraAuxiliar = palabraAuxiliar.concat("%");
                    break;
                case "u":
                case "U":
                    palabraAuxiliar = palabraAuxiliar.concat("*");
                    break;
                default:
                    palabraAuxiliar = palabraAuxiliar.concat(palabra.substring(i, i + 1));
            }
        }
        System.out.println("La palabra cambiada es: " + palabraAuxiliar);
    }
}