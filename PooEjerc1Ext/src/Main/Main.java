
package Main;

import entidades.Cancion;
import java.util.Scanner;

public class Main {
/*
Desarrollar una clase Cancion con los siguientes atributos: titulo y autor. Se deberá́
definir además dos constructores: uno vacío que inicializa el titulo y el autor a cadenas
vacías y otro que reciba como parámetros el titulo y el autor de la canción. Se deberán
además definir los métodos getters y setters correspondientes.
 */
     
    
   
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
     Cancion Datos = new Cancion();
     
        System.out.println("Ingrese el titulo del libro: "); 
        
        Datos.setAutor(leer.nextLine());
        System.out.println("ingrese el nombre del autor del libro: ");
        
        Datos.setTitulo(leer.nextLine());
       System.out.println(" El fucking titulo del libro es>>>> "+Datos.getTitulo()+" y el tojonudo que lo escribio se llama>>> "+Datos.getAutor());      
    }
    
}
