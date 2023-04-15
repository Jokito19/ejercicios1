/*


Las secuencias leídas que respeten el formato se consideran correctas, la secuencia
especial “&&&&&” marca el final de los envíos (llamémosla FDE), y toda 
secuencia distinta de FDE, que no respete el formato se considera incorrecta.
Al finalizar el proceso, se imprime un informe indicando la cantidad de
lecturas correctas e incorrectas recibidas. Para resolver el ejercicio 
deberá investigar cómo se utilizan las siguientes funciones de Java Substring(), Length(), equals().

 */
package secuencialectura;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class SEcuenciaLectura {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
       String palabras;
       int num1 = 0;
       int num2 = 0;
        
        do {
            System.out.println("Ingrese una cadena de 5 digitos, primer digito es una X - ultimo una O: Ejem: XSPLO"
            + "\nPara terminar la secuencia use: &&&&&"); 
                palabras = leer.nextLine();
                System.out.println(palabras.substring(0,1));
            if (palabras.length() == 5 || (palabras.substring(0,1) == "X" )|| (palabras.substring(4,5) == "O")) {
                num1 = num1 + 1;
            }else System.out.println("La Palabra no pertenece a la secunecia especial del codigo: FDE ");
                 num2 = num2 + 0;
            
            
            
        }while (!"&&&&&".equalsIgnoreCase(palabras));
                  
        System.out.println("Los ingresos correctos en secuencia FDE son = " + num1);
        System.out.println("Los ingresos incorrectos fuera de la secuencia FDE son = " + num2);
                          
         
    }
    
}
