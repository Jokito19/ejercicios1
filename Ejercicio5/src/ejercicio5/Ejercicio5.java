/*
 Escriba un programa en el cual se ingrese un valor límite positivo, y a
continuación solicite números al usuario hasta que la suma de los números
introducidos supere el límite inicial.
 */
package ejercicio5;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num2 = 0;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero limite");
        int num3 = leer.nextInt();
        do {
            System.out.println("Ingrese numeros para realizar una sumatoria que"
                    + " supere el valor limite");
            int num1 = leer.nextInt();
             num2 = num1 + num2;
            
          } while (num3>=num2);  
        System.out.println("La suma de los numeros es: "+num2+"y supero al numero limite: "+num3);
                    
                  
            
        
        
    }
    
}
