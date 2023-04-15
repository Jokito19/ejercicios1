/*
 Realizar un programa que pida dos números enteros positivos por teclado y muestre
por pantalla el siguiente menú:El usuario deberá elegir una opción y el programa deberá
mostrar el resultado por pantalla y luego volver al menú. El programa deberá ejecutarse 
hasta que se elija la opción 5. Tener en cuenta que, si el usuario selecciona la opción 5,
en vez de salir del programa directamente, se debe mostrar el 
siguiente mensaje de confirmación: 
¿Está seguro que desea salir del programa (S/N)?
Si el usuario selecciona el carácter ‘S’ se sale del programa, 
caso contrario se vuelve a mostrar el menú.
 */
package ejercicio6;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese dos numeros");
        double num1 = leer.nextInt();
        double num2 = leer.nextInt();
        
        System.out.println("MENU");
        System.out.println("1.Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");   
        System.out.println("5.Salir");
        System.out.println("ELija una opcion");
               
        int numero = leer.nextInt();
        
        
        
        while (true);{
         
        System.out.println("MENU");
        System.out.println("1.Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");   
        System.out.println("5.Salir");
        System.out.println("ELija una opcion");
               
        int numero = leer.nextInt();
      
        
        switch (numero) {
            case 1:
                System.out.println("La suma de: "+num1+" mas" +num2 +" = " +(num1+num2));
                break;
            case 2:
                System.out.println("La resta de: "+num1+" menos" +num2 +" = " +(num1-num2));
                break;
            case 3:
                System.out.println("La multiplicacion de: " + num1 + " por " + num2 + " = " +(num1*num2));
                break;
            case 4:
                System.out.println("La division de: " + num1 + " por " + num2 + " = " +(num1/num2));
                break;
            case 5:
                System.out.println("Esta seguro que quiere salir del sistema? S/N");
                
                break;
            default:
                System.out.println("El numero ingresado no está todavia en nuestro programa");
        }
          
    }

}

