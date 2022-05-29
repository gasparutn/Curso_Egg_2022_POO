
package Main;

import Servicios.Servis;
import entidades.Raices;
import java.util.Scanner;


public class Main {

   
    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Raices clase = new Raices();
    
    Servis Resul = new Servis();
    
    Resul.ingresavalor(clase);
    boolean re1=Resul.tieneRaices(clase);
    System.out.println(re1);
    
   System.out.println("Tiene una unica raiz: "+Resul.tieneRaiz(clase));
   
   Resul.calcular(clase);
  
   
    
    
    }  
}
