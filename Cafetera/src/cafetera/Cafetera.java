/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cafetera;

import Cafe.Cafe;
import CafeteraServicio.CafeteraServicio;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Cafetera {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner read = new Scanner(System.in);
         CafeteraServicio s1 = new CafeteraServicio();
         Cafe c1 = new Cafe();
         int men;
         
         
         do {System.out.println("Bienvenidos a Mundo Cafe"
                 + "\n1.Llenar Cafetera"
                 + "\n2.Servir taza "
                 + "\n3.Agregar cafe"
                 + "\n4.Vaciar cafetera "
                 + "\n5.SAlir");
         men = read.nextInt();
             switch (men) {
                 case 1:
                     s1.llenarCafetera(c1);
                     System.out.println("Cafetera llena " + c1.getCantidadActual() + "ml de CAFE");
                     System.out.println("");
                     break;
                 case 2:
                     s1.servirTaza(c1);
                     System.out.println("");
                     break;
                 case 3:
                     s1.agregarCafe(c1);
                     System.out.println("La cafetera tiene: " + c1.getCantidadActual()+"ml de cafe");
                     break;
                 case 4:
                     s1.vaciarCafetera(c1);
                     System.out.println("La cafetera esta vacia");
                     break;
                 case 5:
                     System.out.println("¡Gracias por tomar CAFE!");
                     break;
                 default:
                     System.out.println("Ingreso un numero invalido vuelva a intentarlo");;
             }
        } while (men != 5);
        
         
         
         
         
         
    }
    
}
