/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercico6partea;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejercico6partea {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese dos numeros");
        double num1 = leer.nextInt();
        double num2 = leer.nextInt();
        int num3;
        String resp = "";
        do {
             System.out.println("MENU");
             System.out.println("0. Reingresar numeros");
             System.out.println("1. Sumar");
             System.out.println("2. Restar");
             System.out.println("3. Multiplicar");
             System.out.println("4. Dividir");   
             System.out.println("5. Salir");
             System.out.println("ELija una opcion:");
             num3 = leer.nextInt();
            
            switch (num3) {
                 case 0:
                 System.out.println("Ingrese dos numeros");
                  num1 = leer.nextInt();
                  num2 = leer.nextInt();
                  break;
                
                
                
                case 1:
                System.out.println("La suma de: "+num1+" +  " +num2 +"  = " +(num1+num2));
                       System.out.println("");
                       
                        
                
                break;
            case 2:
                System.out.println("La resta de: "+num1+" menos" +num2 +" = " +(num1-num2));
                System.out.println("");
               
                break;
            case 3:
                System.out.println("La multiplicacion de: " + num1 + " por " + num2 + " = " +(num1*num2));
                 System.out.println("");
                

                break;
            case 4:
                System.out.println("La division de: " + num1 + " por " + num2 + " = " +(num1/num2));
                 System.out.println("");
                

                break;
            case 5:
                do {
                    
                    System.out.println("Esta seguro que quiere salir del sistema? S/N");
                     resp = leer.next();
                    
                } while (("a".equalsIgnoreCase(resp)));
                
                
                 System.out.println("");
                
            
            
            
                
                break;
            default:
                System.out.println("El numero ingresado no está todavia en nuestro programa, vuelva a intntarlo");
                System.out.println("");
                
         
             
              } while (("N".equalsIgnoreCase(resp))|| num3 == 1 || num3 == 2 || num3 == 3 || num3 == 4 || num3==0);
          
        
        
            }
        }

