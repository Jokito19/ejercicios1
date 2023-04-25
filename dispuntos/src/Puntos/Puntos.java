/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Puntos;

import static java.lang.Math.sqrt;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Puntos {
    //p1
    private double x1;
    private double y1;
    //p2
    private double x2;
    private double y2;

    public Puntos() {
    }

    public Puntos(double x1, double y1, double x2, double y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public double getX1() {
        return x1;
    }

    public void setX1(double x1) {
        this.x1 = x1;
    }

    public double getY1() {
        return y1;
    }

    public void setY1(double y1) {
        this.y1 = y1;
    }

    public double getX2() {
        return x2;
    }

    public void setX2(double x2) {
        this.x2 = x2;
    }

    public double getY2() {
        return y2;
    }

    public void setY2(double y2) {
        this.y2 = y2;
    }

    public Scanner getLeer() {
        return leer;
    }

    public void setLeer(Scanner leer) {
        this.leer = leer;
    }

    
    
    Scanner leer = new Scanner(System.in);
    
    public void crearPuntos (){
        System.out.println(" Ingrese las coordenadas del Primer Punto");
        System.out.println("Ingre x1");
        x1 = leer.nextInt();
        System.out.println(" Ingrese y1");
        y1 = leer.nextInt();
         System.out.println(" Ingrese las coordenadas del Segundo Punto");
        System.out.println("Ingrese x2");
        x2 = leer.nextInt();
        System.out.println("Ingrese y2");
        y2 = leer.nextInt();
        
        double punto;
        
        punto = sqrt(Math.pow((x2-x1),2)+ Math.pow((y2-y1), 2));
        
        System.out.println("La distancia entre el Primer punto: "+ x1+","+y1 + " y el segundo punto " + x2 +","+ y2 + "es: "+ punto);
        
    }
    
    
}
