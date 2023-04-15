/*
 * CUadro magico
 */
package cuadrado.magico;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class CuadradoMagico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        boolean anti = true;
        int[][] matriz1 = new int[3][3];

        Random rand = new Random();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Ingrese la posicion" + i + ", " + j);
                matriz1[i][j] = leer.nextInt();
            }

        }
        for (int i = 0; i < 3; i++) {

            System.out.println("");
            System.out.print("[" + matriz1[i][0] + "] ");
            System.out.print("[" + matriz1[i][1] + "] ");
            System.out.print("[" + matriz1[i][2] + "] ");
        }
        System.out.println(""
                + "\n  ");

        //suma columnas
        int result1 = 0;
        int result2 = 0;
        int result3 = 0;
        int result4 = 0;
        int result5 = 0;
        int result6 = 0;
        int result7 = 0;
        int result8 = 0;
        
        for (int i = 0; i < 3; i++) {

           
            result1 = matriz1[0][i] + result1;
            result2 = matriz1[1][i] + result2;
            result3 = matriz1[2][i] + result3;
            result4 = matriz1[i][0] + result4;
            result5 = matriz1[i][1] + result5;
            result6 = matriz1[i][2] + result6;
            result7 = matriz1[i][i] + result7;
            result8 = matriz1[2 - i][i] + result8;
        }

      

        if ((result1 == result2) && (result2 == result3) && (result3 == result4) && (result4 == result5) && (result5 == result6) && (result6 == result7) && (result7 == result8)) {
            System.out.println("El cuadro es MAGICO");
        } else {
            System.out.println("EL cuadro NO es magico");
        }
    }
        
        
        
        
    }
    

