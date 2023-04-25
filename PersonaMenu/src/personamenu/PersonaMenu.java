/*



 */
package personamenu;

import Entidades.Persona;
import Servicio.PersonaServicio;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class PersonaMenu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        PersonaServicio s1 = new PersonaServicio();
        Persona p1 = new Persona();
        Persona p2 = new Persona();
        Persona p3 = new Persona();
        Persona p4 = new Persona();
        int bajopeso = 0;
        int pesobien = 0;
        int sobrepeso = 0;
        //----------------------------------------Menu de Personas ---------------------
        //Persona 1

        System.out.println("Ingrese persona 1");
        s1.crearPersona(p1);

        s1.calcularIMC(p1);

        s1.esMayorDeEdad(p1);

        System.out.println("Ingrese persona 2");
        s1.crearPersona(p2);
        s1.calcularIMC(p2);
        s1.esMayorDeEdad(p2);

        System.out.println("Ingrese persona 3");
        s1.crearPersona(p3);
        s1.calcularIMC(p3);
        s1.esMayorDeEdad(p3);

        System.out.println("Ingrese persona 4");
        s1.crearPersona(p4);
        s1.calcularIMC(p4);
        s1.esMayorDeEdad(p4);

        //porcentaje de Pesos
        s1.gentegor();

        System.out.println("");

        //porcentaje de mayor menor
        s1.porgente();

        System.out.println("");

        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());

        System.out.println("");

    }

}
