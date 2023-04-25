/*

A continuación, en la clase main hacer lo siguiente:
Crear 4 objetos de tipo Persona con distintos valores, a continuación, llamaremos 
todos los métodos para cada objeto, deberá comprobar si la persona está en su peso
ideal, tiene sobrepeso o está por debajo de su peso ideal e indicar para cada objeto si la persona es mayor de edad.
Por último, guardaremos los resultados de los métodos calcularIMC y
esMayorDeEdad en distintas variables(arrays), para después calcular un
porcentaje de esas 4 personas cuantas están por debajo de su peso, 
cuantas en su peso ideal y cuantos, por encima, y también calcularemos un porcentaje
de cuantos son mayores de edad y cuantos menores. Para esto, podemos crear unos métodos adicionales.



 */
package Servicio;

import Entidades.Persona;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class PersonaServicio {

    int mayorEdad = 0;
    int menoredad = 0;
    int bajoPeso = 0;
    int normalPeso = 0;
    int sobrePeso = 0;

    Scanner read = new Scanner(System.in);
    Persona p1 = new Persona();

    public Persona crearPersona(Persona p1) {
        System.out.println("Ingrese su nombre:");
        p1.setNombre(read.next());
        System.out.println("Ingrese su edad:");
        p1.setEdad(read.nextInt());
        System.out.println("Ingrese su sexo: (M).masculinoo - (F).femenino - (O).otro: ");
        p1.setSexo(read.next().charAt(0));
       

        do {
            if (p1.getSexo() != 'M' && p1.getSexo() != 'm' && p1.getSexo() != 'F' && p1.getSexo() != 'f' && p1.getSexo() != 'o' && p1.getSexo() != 'O') {
                System.out.println("Error en ingresar el sexor: (M).masculino - (F).femenino - (O).otro:");
                p1.setSexo(read.next().charAt(0));
            }
        } while (p1.getSexo() != 'M' && p1.getSexo() != 'm' && p1.getSexo() != 'F' && p1.getSexo() != 'f' && p1.getSexo() != 'o' && p1.getSexo() != 'O');

        System.out.println("Ingrese su peso");
        p1.setPeso(read.nextDouble());
        System.out.println("Ingrese su altura");
        p1.setAltura(read.nextDouble());
        return p1;

    }

    boolean mayor = false;

    public void esMayorDeEdad(Persona p1) {
        if (p1.getEdad() > 18) {
            System.out.println("");
            System.out.println("La Persona es mayor de edad");
            System.out.println("");
            mayor = true;
            mayorEdad = 1 + mayorEdad;
        } else if (p1.getEdad() < 18) {
            System.out.println("");
            System.out.println("La persona es menor de edad");
            menoredad = 1 + menoredad;
            System.out.println("");
        }

    }

    public void porgente() {
        System.out.println(" Hay " + mayorEdad + " persona/s MAYORES a 18 años y representa el " + ((mayorEdad * 100) / 4));
        System.out.println(" Hay " + menoredad + " persona/s MENORES a 18 años y representa el " + ((menoredad * 100) / 4));

    }

    public void calcularIMC(Persona p1) {
        double imc;
        int resul;
        imc = p1.getPeso() / (p1.getAltura() * p1.getAltura());
        if (imc < 20) {
            resul = -1;
            System.out.println("");
            System.out.println("Esta por debajo del peso Ideal");
            System.out.println("");
            p1.setResulPeso(resul);
            p1.setBajopeso(1);
            bajoPeso = 1 + bajoPeso;
           
        } else if (imc >= 20 && imc <= 25) {
            resul = 0;
            System.out.println("");
            System.out.println("Esta en su peso ideal");
            System.out.println("");
            p1.setResulPeso(resul);
            p1.setPesobien(1);
            normalPeso = 1 + normalPeso;
           
        } else if (imc > 25) {
            resul = 1;
            System.out.println("");
            System.out.println("Esta con sobrepeso");
            System.out.println("");
            p1.setResulPeso(resul);
            p1.setSobrepeso(1);
            sobrePeso = 1 + sobrePeso;
            
        }

    }

    public void gentegor() {
        System.out.println("hay " + normalPeso + " persona/s con NORMALPESO y representa/n un " + ((normalPeso * 100) / 4) + "% de las 4 personas cargadas");
        System.out.println("hay " + bajoPeso + " persona/s con BAJOPESO y representa/n un " + ((bajoPeso * 100) / 4) + "% de las 4 personas cargadas");
        System.out.println("hay " + sobrePeso + " persona/s con SOBREPESO y representa/n un " + ((sobrePeso * 100) / 4) + "% de las 4 personas cargadas");
        System.out.println("");
    }

    public void porcentajePeso() {
        System.out.println(p1.getBajopeso());
        System.out.println(p1.getPesobien());
        System.out.println(p1.sobrepeso);
    }

}
