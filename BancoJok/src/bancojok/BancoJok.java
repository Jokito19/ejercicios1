/*

Agregar la clase CuentaBancariaServicio en el paquete Servicios que contenga:
Método para crear cuenta pidiéndole los datos al usuario.
Método ingresar(double): recibe una cantidad de dinero a ingresar y se le sumará 
  al saldo actual.
Método retirar(double): recibe una cantidad de dinero a retirar y se le restara
  al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar se retirará el máximo posible hasta dejar la cuenta en 0.
Método extraccionRapida: le permitirá sacar solo un 20% de su saldo. Validar 
  que el usuario no saque más del 20%.
Método consultarSaldo: permitirá consultar el saldo disponible en la cuenta.
Método consultarDatos: permitirá mostrar todos los datos de la cuenta.

 */
package bancojok;

import ENTIDADES.CuentaBancaria;
import SERVICE.CuentaBancariaServicio;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class BancoJok {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        CuentaBancariaServicio s1 = new CuentaBancariaServicio();
        CuentaBancaria c1 = new CuentaBancaria();
        
        int resp = 0;
        do {
            System.out.println("Bienvenidos a Banco Jok"
                    + "\n1.Crear nuevo usuario"
                    + "\n2. Ingreso de dinero"
                    + "\n3. Retiro dinero"
                    + "\n4. Retiro express"
                    + "\n5. Saldo actual"
                    + "\n6. Consulta datos"
                    + "\n7. Salir");
            resp = read.nextInt();

            switch (resp) {
                case 1:
                    s1.crearCuenta();
                    break;
                    
                    
                    
                case 2:
                    s1.ingresar(c1);
                    System.out.println("");
                    break;
                    
                case 3:
                    s1.retirar(c1);
                    System.out.println("");
                    break;
                case 4:
                    s1.extraccionRapid(c1);
                    System.out.println("");
                    break;
                case 5:
                    s1.consultarSaldo(c1);
                    System.out.println("");
                    break;
                case 6: 
                    s1.consultarDatos(c1);
                    System.out.println("");
                    break;
                case 7:
                    System.out.println("Gracias por su visita");
                    System.out.println("");
                    break;
                    
                default:
                    System.out.println("Numero Incorrecto. Intente nuevamente");
            }System.out.println("");
        } while (resp != 7);


        
        
      
        
        
        
        
        
    }
    
}
