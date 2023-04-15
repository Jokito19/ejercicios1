/*
 Crea un procedimiento EsMultiplo que reciba los dos números pasados por el
usuario, validando que el primer número múltiplo del segundo e imprima si el
primer número es múltiplo del segundo, sino informe que no lo son.
 */
package multiplo;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Multiplo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        boolean anti = true;
        int[][] matriz1 = new int[3][3];
        int[][] matriz2 = new int[3][3];
        Random rand = new Random();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Ingrese la posicion" + i + ", " + j);
                matriz1[i][j] = leer.nextInt();
            }

        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz2[i][j] = matriz1[j][i];

            }

        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (((matriz1[i][j] >= 0) && (matriz2[i][j] <= 0)) || ((matriz1[i][j] <= 0) && (matriz2[i][j] >= 0))) {

                } else {
                    anti = false;
                }
            }

        }

        if (anti == true) {
            System.out.println("La matriz es antisimetrica: ");
        } else {
            System.out.println(" La matriz NO es ANTI-SImetrica");
        }

    }

}
