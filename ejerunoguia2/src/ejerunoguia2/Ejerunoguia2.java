/*
Implementar un programa que le pida dos números enteros al
usuario y determine si ambos o alguno de ellos es mayor a 25.
 */
package ejerunoguia2;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejerunoguia2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
       int num1;
       int num2;
        System.out.println("Ingrese el primer numero");
        num1 = leer.nextInt();
        System.out.println("Ingrese el segundo numero");
        num2 = leer.nextInt();      
        if (num1 > 25){
            System.out.println("EL numero "+num1+ " es mayor a 25");
        }else{
            System.out.println("el numero "+num1+ " no es mayor a 25");
        } if (num2 > 25){
            System.out.println("EL numero "+num2+ " es mayor a 25");
        }else{
            System.out.println("el numero "+num2+ " no es mayor a 25");
    }
    }
}

