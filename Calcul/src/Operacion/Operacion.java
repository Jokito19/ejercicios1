/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Operacion;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Operacion {
    
    public double num1;
    public double num2;

    public Operacion(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public Operacion() {
    }

    public double getNum1() {
        return num1;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

  
    Scanner leer = new Scanner (System.in);
    
    
    public void  crearOperacion () {
        System.out.println("Ingrese dos numeros");
        System.out.println("Ingrese el numero 1");
        num1 = leer.nextInt();
        System.out.println("Ingrese el numero 2");
        num2 = leer.nextInt();
    }
    
    public void sumar(){
        System.out.println(" La suma es: " + (num1+num2));
    }
    
    public void restar(){
        System.out.println(" La resta es: " + (num1-num2));
    }
    
    public void multiplicar() {
        
        if (num1 == 0 || num2 == 0) {
            System.out.println(" No se realizara multiplicacioens por cero");
        }else System.out.println(" La multiplicacion es " + (num1*num2));
  
        
    }
        public void dividir (){
            if (num2 == 0 || num1==0) {
                System.out.println(" Ni se te ocurra dividir por cero");
            }else System.out.println(" La division es: " + (num1/num2));
            
        
        
    }
    
    
    
    
    
    
            
    
    
}
