/*
Realizar una clase llamada Persona en el paquete de entidades que tengan los 
siguientes atributos: nombre, edad, sexo (‘H’ para hombre, ‘M’ para mujer, 
‘O’ para otro), peso y altura. Si desea añadir algún otro atributo, puede hacerlo.
Agregar constructores, getters y setters.
 */
package Entidades;

/**
 *
 * @author Usuario
 */
public class Persona {
    private String nombre;
    private int edad;
    private char sexo;
    private double peso;
    private double altura;
    private int resulPeso;
    public int bajopeso;
    public int pesobien;
    public int sobrepeso;
    
    
    public Persona() {
    }

    public Persona(String nombre, int edad, char sexo, double peso, double altura, int resulPeso, int bajopeso, int pesobien, int sobrepeso) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
        this.resulPeso = resulPeso;
        this.bajopeso = bajopeso;
        this.pesobien = pesobien;
        this.sobrepeso = sobrepeso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public int getResulPeso() {
        return resulPeso;
    }

    public void setResulPeso(int resulPeso) {
        this.resulPeso = resulPeso;
    }

    public int getBajopeso() {
        return bajopeso;
    }

    public void setBajopeso(int bajopeso) {
        this.bajopeso = bajopeso;
    }

    public int getPesobien() {
        return pesobien;
    }

    public void setPesobien(int pesobien) {
        this.pesobien = pesobien;
    }

    public int getSobrepeso() {
        return sobrepeso;
    }

    public void setSobrepeso(int sobrepeso) {
        this.sobrepeso = sobrepeso;
    }

    
    
    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", edad=" + edad + ", sexo=" + sexo + ", peso=" + peso + ", altura=" + altura + '}';
    }
    
    
    
    
    
}
