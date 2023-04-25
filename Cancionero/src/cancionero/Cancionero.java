/*
 Desarrollar una clase Cancion con los siguientes atributos: título y autor.
Se deberá definir además dos constructores: uno vacío que inicializa el título 
y el autor a cadenas vacías y otro que reciba como parámetros el título y 
el autor de la canción. Se deberán además definir los métodos getters y
setters correspondientes.
 */
package cancionero;

import Cancion.Cancion;

/**
 *
 * @author Usuario
 */
public class Cancionero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Cancion s1 = new Cancion ("La Paloma", "Luis Borges" );
        System.out.println("El titulo de la cancion es: "+ s1.getTitulo() );
        System.out.println("El autor de la cancion es: "+ s1.getAutor());
        
    }
    
}
