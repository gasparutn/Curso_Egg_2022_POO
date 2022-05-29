
package Servicios;

import entidades.Puntos;
import java.util.Scanner;


public class Servis {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    public void crearpuntos(Puntos p){
        
        
        System.out.println("ingrese un numero");
        p.setX1(leer.nextDouble());
        p.setY1(leer.nextDouble());
        System.out.println("ingrese otro numero");
        p.setX2(leer.nextDouble());
        p.setY2(leer.nextDouble());
    }
    
    public double calcular(Puntos P){
        
        return Math.sqrt(Math.pow(P.getX2()- P.getX1(),2) + Math.pow(P.getY2()- P.getY1(),2));
    }
}
