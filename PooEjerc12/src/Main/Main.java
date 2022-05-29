
package Main;


import Servicios.Servis;
import entidades.Persona;
import java.util.Scanner;



public class Main {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        Servis MachoBus = new Servis();
        Persona P2 = new Persona();
        MachoBus.crearPersona(P2);
        
        int edad = MachoBus.calcularEdad(P2);
        MachoBus.menorQue(P2, edad);
        MachoBus.mostrarPersona(P2, edad);
        
        
    }
    
    
    
    
    
    
}
