/*

Método vaciarCafetera(): pone la cantidad de café actual en cero. 

Método agregarCafe(int): se le pide al usuario una cantidad de café, 
el método lo recibe y se añade a la cafetera la cantidad de café indicada.

 */
package CafeteraServicio;

import Cafe.Cafe;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class CafeteraServicio {
    Scanner read = new Scanner (System.in);
    Cafe c1 = new Cafe ();
    int taza;
    int men;
    public void llenarCafetera (Cafe c1) {
        c1.setCapacidadMaxima(2000);
        c1.setCantidadActual(c1.getCapacidadMaxima());
        
       }
    
    public void vaciarCafetera (Cafe c1) {
        c1.setCapacidadMaxima(0);
        c1.setCantidadActual(c1.getCapacidadMaxima());
        
       }
    
    public void agregarCafe (Cafe c1){
        System.out.println("Indique la cantidad de cafe a agregar");
        do {
            System.out.println("3 cantidades posibles"
            +"\n1.Agrega 500ml"
            +"\n2.Agrega 1000ml"
            +"\n3.Agrega 1500ml"
            +"\n4. No agregar");
            men = read.nextInt();
            
            switch (men) {
                case 1:
                    
                    if (c1.getCantidadActual()>1500) {
                        System.out.println("Imposible cargar esta cantidad - sobrepasa el perimitdo - cantidad actual: " + c1.getCantidadActual()+"ml");
                    }else c1.setCantidadActual(c1.getCantidadActual() + 500);
                    
                    break;
                    
                case 2 : 
                    if (c1.getCantidadActual()>1000) {
                        System.out.println("Imposible cargar esta cantidad - sobrepasa el perimitdo - cantidad actual: " + c1.getCantidadActual()+"ml");
                    }else c1.setCantidadActual(c1.getCantidadActual() + 1000);
                    
                case 3 : 
                    if (c1.getCantidadActual()>500) {
                        System.out.println("Imposible cargar esta cantidad - sobrepasa el perimitdo - cantidad actual: " + c1.getCantidadActual()+"ml");
                    }else c1.setCantidadActual(c1.getCantidadActual() + 1500);  
                case 4: 
                    System.out.println("No se agrego cafe");
                    break;
                default:
                    System.out.println("Ingreso mal el numero intente de neuvo");
            }
            
            
            
        } while (men >= 5);
        
        
    }
    
    
    
    public void servirTaza (Cafe c1){
        do {
        System.out.println("Ingrese el tamaño de la taza: "
        + "\n1. Taza pequeña 50ml"
        + "\n2. Taza mediana 150ml"
        + "\n3. Taza grande 250ml");
           men = read.nextInt();
            switch (men) {
            case 1:
                taza = 50;
                if (taza > c1.getCantidadActual()) {
                    System.out.println("La taza se lleno con lo que quedaba, puede retirarla " + c1.getCantidadActual());
                    c1.setCantidadActual(0);
                    System.out.println("Cafetera Vacia - Ingrese 1 para llenarla");
                    System.out.println("");
                    
                }else if (taza < c1.getCantidadActual()) {
                    System.out.println("La taza se lleno completa, puede retirarla");
                    c1.setCantidadActual(c1.getCantidadActual() - taza);
                    System.out.println("Quedan " + c1.getCantidadActual() +"ml de cafe");
                    System.out.println("");
                }
                break;
            case 2:
                taza = 150;
                if (taza > c1.getCantidadActual()) {
                    System.out.println("La taza se lleno con lo que quedaba, puede retirarla " + c1.getCantidadActual());
                    c1.setCantidadActual(0);
                    System.out.println("Cafetera Vacia - Ingrese 1 para llenarla");
                    System.out.println("");
                    
                }else if (taza < c1.getCantidadActual()) {
                    System.out.println("La taza se lleno completa, puede retirarla");
                    c1.setCantidadActual(c1.getCantidadActual() - taza);
                    System.out.println("Quedan " + c1.getCantidadActual() +"ml de cafe");
                    System.out.println("");
                }
                break;
            case 3:
                taza = 250;
                 if (taza > c1.getCantidadActual()) {
                    System.out.println("La taza se lleno con lo que quedaba, puede retirarla " + c1.getCantidadActual());
                    c1.setCantidadActual(0);
                    System.out.println("Cafetera Vacia - Ingrese 1 para llenarla");
                    System.out.println("");
                    
                }else if (taza < c1.getCantidadActual()) {
                    System.out.println("La taza se lleno completa, puede retirarla");
                    c1.setCantidadActual(c1.getCantidadActual() - taza);
                    System.out.println("Quedan " + c1.getCantidadActual() +"ml de cafe");
                     System.out.println("");
                }
                break;
                
                
                
            default:
                System.out.println("Error ingresando el tamaño de la taza - Intente neuvamente");
                System.out.println("");
        }
        } while (men>= 4 );
        
       
        
       
        
    }
        
         //Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe 
         //el tamaño de la taza y simula la acción de servir la taza con la capacidad 
        //indicada. Si la cantidad actual de café “no alcanza” para llenar la taza, se 
        //sirve lo que quede. El método le informará al usuario si se llenó o no la taza,
       //y de no haberse llenado en cuanto quedó la taza.
        
    
    
        
 


}
    

