/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CIrculoa;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Circul {
    Scanner leer = new Scanner(System.in);
    
    private double radio;
    private double area;
    private double perimetro;

    public Circul(double radio) {
        this.radio = radio;
    }
    double cir1;
    double c1;
    
   
    public void crearCircunferencia () {
        System.out.println("Ingrese el radio del circulo");
        radio = leer.nextDouble();
       
   }
    
    
    
    
    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }
    public double area() {
       this.area =  3.1416 * Math.pow(radio, 2);
        return area;
    }
    public double perimetro (){
        this.perimetro = 2*Math.PI*radio;
        return perimetro;
        
    }
    
    
}
