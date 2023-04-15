/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package probardate;

import java.text.SimpleDateFormat;
import java.util.Date;


        

/**
 *
 * @author Usuario
 */
public class ProbarDATE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Date  fechaActual = new Date ();
              System.out.println(fechaActual);
            
              SimpleDateFormat cfecha = new SimpleDateFormat ("dd/MM/yyyy"); 
              String fechaformateada = cfecha.format(fechaActual);
              System.out.println(fechaformateada);
        }
    }

       
        
        
        
        
   
 
