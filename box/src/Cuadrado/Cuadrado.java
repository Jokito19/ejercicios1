/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cuadrado;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Cuadrado {
    private int base;
    private int altura;

    public Cuadrado() {
    }

    
    
    
    
    public Cuadrado(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }
    Scanner leer = new Scanner (System.in);
    
    public void medidas (){
        System.out.println("Ingresa la base del Rectnagulo: ");
        base = leer.nextInt();
        System.out.println(" Ingree la altura del Rectangulo");
        altura = leer.nextInt();
        
    }
       public void perimetro (){
           System.out.println(" El perimetro es: " + ((base + altura) * 2));
       }
       public void superficie (){
           System.out.println(" La superficie es: "+ (base*altura));
       }
    
    public void dibujo(){
        for (int i = 0; i < altura; i++) {
            System.out.println("");
            
            for (int j = 0; j < base; j++) {
                 if  ((i==0 || i == altura-1) || (i>0 && j ==0) || (i>0 && j== base-1)) {
                    System.out.print("*");
                    
                }else  System.out.print(" ");
               
            }
            
        }
        System.out.println("");
        System.out.println("");
    }
       
 
       
       
}
