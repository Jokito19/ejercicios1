/*
Realizar una clase llamada CuentaBancaria en el paquete Entidades con los
siguientes atributos: numeroCuenta(entero), dniCliente(entero largo), 
saldoActual. Agregar constructor vacío, con parámetros, getters y setters.
 */
package ENTIDADES;

/**
 *
 * @author Usuario
 */
public class CuentaBancaria {
    private int numeroCuena;
    private long dniCliente;
    private double saldoActual;

    public CuentaBancaria() {
    }

    public CuentaBancaria(int numeroCuena, long dniCliente, double saldoActual) {
        this.numeroCuena = numeroCuena;
        this.dniCliente = dniCliente;
        this.saldoActual = saldoActual;
    }

    public int getNumeroCuena() {
        return numeroCuena;
    }

    public void setNumeroCuena(int numeroCuena) {
        this.numeroCuena = numeroCuena;
    }

    public long getDniCliente() {
        return dniCliente;
    }

    public void setDniCliente(long dniCliente) {
        this.dniCliente = dniCliente;
    }

    public double getSaldoActual() {
        return saldoActual;
    }

    public void setSaldoActual(double saldoActual) {
        this.saldoActual = saldoActual;
    }

    @Override
    public String toString() {
        return "CuentaBancaria{" + "numeroCuena=" + numeroCuena + ", dniCliente=" + dniCliente + ", saldoActual=" + saldoActual + '}';
    }
    
    
    
    
    
    
    
    
    
    
    
}
