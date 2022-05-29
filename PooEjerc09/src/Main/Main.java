
package Main;

import Servicios.Servis;
import entidades.Matematica;


import java.util.Scanner;

public class Main {
Scanner leer = new Scanner(System.in).useDelimiter("\n");
 
 
   public static void main(String[] args) {
  
    Matematica Nums = new Matematica();
    
    Nums.setNum1(Math.random()*100+1);
    System.out.println("Num 1: "+Math.round(Nums.getNum1()));
    Nums.setNum2(Math.random()*100+1);
    System.out.println("Num 2: "+Nums.getNum2());
    System.out.println("");
           
    Servis Mayor = new Servis();       
    Mayor.devolverMayor(Nums);
    
    Servis Poten = new Servis();    
    Poten.calcularPotencia(Nums);
    
    Servis Raiz = new Servis();
       
    System.out.println("La raiz cuadrada del valor absoluto es: "+Math.round(Raiz.calculaRaiz(Nums)));
    
}
}


