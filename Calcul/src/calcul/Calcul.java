/*





Método multiplicar(): primero valida que no se haga una multiplicación 
por cero, si fuera a multiplicar por cero, el método devuelve 0 y
se le informa al usuario el error. Si no, se hace la multiplicación 
y se devuelve el resultado al main

Método dividir(): primero valida que no se haga una división por cero, 
si fuera a pasar una división por cero, el método devuelve 0 y 
se le informa al usuario el error se le informa al usuario. 
Si no, se hace la división y se devuelve el resultado al main.

 */
package calcul;

import Operacion.Operacion;

/**
 *
 * @author Usuario
 */
public class Calcul {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
        Operacion op1 = new Operacion();
        op1.crearOperacion();
        op1.sumar();
        op1.restar();
        op1.multiplicar();
        op1.dividir();
        
        System.out.println("Segundo digito");
        Operacion op2 = new Operacion ();
        op2.crearOperacion();
        op2.restar();
        
        
        
        
    }
    
}
