/*
 




 */
package SERVICE;

import ENTIDADES.CuentaBancaria;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class CuentaBancariaServicio {
    Scanner read = new Scanner (System.in);
    public CuentaBancaria crearCuenta (){
        //Instancia un objeto de tipo cuenta
       CuentaBancaria c1 = new CuentaBancaria();
       //una vez instanciado (c1) llenamos los atributos
        //necesitamos el scanner
        System.out.println("Ingrese el numero de cuenta");
        c1.setNumeroCuena(read.nextInt());
        System.out.println("Ingrese el numero de DNI");
        c1.setDniCliente(read.nextLong());
        c1.setSaldoActual(0);
        return c1;
        
        
        
    }
    public void ingresar (CuentaBancaria c1) {
        System.out.println("Ingrese cuanto dinero deposita: ");
        double ingreso = read.nextDouble();
        c1.setSaldoActual(c1.getSaldoActual() + ingreso);
        System.out.println("su saldo actual es: $" + c1.getSaldoActual());
        
        
    }
 
    
    public void retirar (CuentaBancaria c1) {
        System.out.println("Cuanto dinero desea retirar");
        double retira = read.nextDouble();
        if (retira>c1.getSaldoActual()) {
            System.out.println("Fondos insuficientes se retirara el maximo disponible: $ " + c1.getSaldoActual());
            c1.setSaldoActual(0);
            
        }else  c1.setSaldoActual(c1.getSaldoActual() - retira);
               System.out.println("su saldo es : $" + c1.getSaldoActual());
                
       
        
    }
    
    
    //Método extraccionRapida: le permitirá sacar solo un 20% de su saldo. Validar 
     //que el usuario no saque más del 20%.
    public void extraccionRapid (CuentaBancaria c1) {
        System.out.println("Cunto dinero desea retirar");
         double retiraE = read.nextDouble();
        if (retiraE > c1.getSaldoActual()*0.2) {
            System.out.println("Saldo para retirar maximo es: $ " + c1.getSaldoActual()*0.2);
            c1.setSaldoActual((c1.getSaldoActual()) - (c1.getSaldoActual()*0.2));
            
        }else if (retiraE < c1.getSaldoActual()*0.2) {
            System.out.println("se retiran: $"+retiraE);
          c1.setSaldoActual(c1.getSaldoActual() - retiraE);
        }
 
    }
    
    public void consultarSaldo (CuentaBancaria c1) {
        System.out.println("Su saldo es de : $" + c1.getSaldoActual());
    }
    
    public void consultarDatos (CuentaBancaria c1) {
        System.out.println(" Usuaario: " + c1.getDniCliente() );
        System.out.println(" Cuenta:  " + c1.getNumeroCuena());
        System.out.println(" Su saldo es: $ " + c1.getSaldoActual());
    }
  //  Método consultarSaldo: permitirá consultar el saldo disponible en la cuenta.
//   Método consultarDatos: permitirá mostrar todos los datos de la cuenta.
    
    
}
