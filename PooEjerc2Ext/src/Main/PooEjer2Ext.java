
package Main;


import Servicios.Servis;
import entidades.Puntos;
import java.util.Scanner;


public class PooEjer2Ext {

   
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
      Servis Resul = new Servis();
      Puntos Point = new Puntos(); 
      Resul.crearpuntos(Point);
      
      System.out.println(String.format("El resultado es: %.3f", Resul.calcular(Point)));
      
      
      
    }
    
    
    
    
    
    
    
}
