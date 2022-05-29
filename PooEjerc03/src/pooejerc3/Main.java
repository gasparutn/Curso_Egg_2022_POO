
package pooejerc3;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        Operacion Op = new Operacion();

        Op.crearOperacion();
       
        System.out.println("La suma es: "+Op.sumar());
        System.out.println("La resta es: "+Op.restar());
        System.out.println("La multip es: "+Op.multip());
        System.out.println("La div es: "+Op.div());
    }           
        
       
        
             
        
        
        
 }
    
