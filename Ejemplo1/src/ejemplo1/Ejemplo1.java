/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo1;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejemplo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          // se crea una variable de Tipo Scaner que se utiliza para ller datos del usuario
        Scanner leer = new Scanner(System.in);
        // se crea una varible tipo cadena String que se utiliza para ller datos del usuario
        String nombre;
        //para mostrar por pantalla
        System.out.println("Ingresa tu nombre");
        //leemso el nombre de la persona en al varible nombre
        nombre = leer.next();
        //mostramos por consola un saludo personalizado
        System.out.println("HOla mundo soy " + nombre + " estoy programando en JAVA" );
    }
    
}
