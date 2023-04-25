/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package date;


import atributodate.Perro;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Date {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 //        Llenar el atributo Date con set
//        Scanner scan = new Scanner(System.in);
//        
//        Perro p1 = new Perro(); // Creamos el objeto
//        
//        System.out.println("Ingrese el dia");
//        int dia = scan.nextInt();
//        
//        System.out.println("Ingrese el mes");
//        int mes = scan.nextInt();
//        
//        System.out.println("Ingrese el año");
//        int anio = scan.nextInt();
//        
//        Date fechaNacimiento = new Date(anio, mes, dia); // Creamos el objeto tipo Date
//        
//        p1.setFechaDeNacimiento(fechaNacimiento); // Guardamos la fecha con el set
//        
//        p1.getFechaDeNacimiento(); // Mostramos la fecha con el get 
        //2 Llenar el atributo Date con metodos 
        Scanner scan = new Scanner(System.in);
        
        
        
        Perro p1 = new Perro();

        System.out.println("Ingrese el dia");
        int dia = scan.nextInt();

        System.out.println("Ingrese el mes");
        int mes = scan.nextInt();

        System.out.println("Ingrese el año");
        int anio = scan.nextInt();
        
        
        
        Date fechaNacimiento = new Date();

        fechaNacimiento.setDate(1); // Seteamos el dia
        fechaNacimiento.setMonth(mes); // Seteamos el mes
        fechaNacimiento.setYear(anio); // Seteamos el anio

        p1.llenarFecha(fechaNacimiento);

        //  p1.mostrarFecha();
        System.out.println(p1);

    }

    private void setDate(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void setDate(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}

