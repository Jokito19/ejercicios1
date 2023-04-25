/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuadrado.pkg2;

/**
 *
 * @author Usuario
 */
public class Cuadrado2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a = 4;
        int b = 4;
        
        for (int i = 0; i < a; i++) {
            System.out.println("");
            for (int j = 0; j < b; j++) {
                if ((i==0 || i == a-1) || (i>0 && j ==0) || (i>0 && j== b-1)  )  {
                    System.out.print("*");
                }else System.out.print(" ");
                
                
            }
            
        }
        
        System.out.println("");
        System.out.println("");
        
        
        
    }
    
}
