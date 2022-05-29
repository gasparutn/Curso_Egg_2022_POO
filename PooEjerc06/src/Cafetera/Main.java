
package Cafetera;

import entidades.Nespresso;
import java.util.Scanner;


public class Main {
    
public static void main(String[] args) {   
Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
  Nespresso Cafetera = new Nespresso();

  Cafetera.llenarCafetera();
  Cafetera.servirTaza();
  Cafetera.vaciarCafe();
  Cafetera.agregarCafe();
}
}
