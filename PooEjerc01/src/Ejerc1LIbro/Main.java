
package Ejerc1LIbro;

import java.util.Scanner;


/**
 *  Hola 
 * @author Gasparin Laborde
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Libro L1 = new Libro();
  
      L1.mostrarlibro();
        System.out.println("");
       L1.toString(); 
        System.out.println(L1);
    }
    
}
