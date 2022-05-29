
package pooejerc4ext;

import Servicios.Servis;
import java.util.Scanner;

public class Main {

    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
    Servis mostrar = new Servis(); 
    mostrar.crearNif();
     mostrar.mostrar();
        
    }
    
}
