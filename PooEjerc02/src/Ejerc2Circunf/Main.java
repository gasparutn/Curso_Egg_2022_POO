
package Ejerc2Circunf;

import java.util.Scanner;


public class Main {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public static void main(String[] args) {
     
        Circunferencia Ra = new Circunferencia();
        
        Ra.crearCircunferencia();
        
        Ra.Perimetro();
        System.out.println("El perimetro es: "+Ra.Perimetro());
        Ra.Area();
        System.out.println("El area es: "+Ra.Area());
        

     
     
    }
    
}
