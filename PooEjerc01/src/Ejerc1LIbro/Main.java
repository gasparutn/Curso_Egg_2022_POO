/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejerc1LIbro;

import java.util.Scanner;


/**
 *
 * @author gaspa
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Libro L1 = new Libro();
  
      L1.mostrarlibro();
   
       L1.toString(); 
        System.out.println(L1);
      
    }
    
}
