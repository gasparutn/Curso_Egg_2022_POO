package entidades;

import java.util.Scanner;


public class Nespresso {

    int capacidadMax =5000;
    int cantidadAct = 3000;

    public Nespresso() {
    }

    public Nespresso(int capacidadMax, int cantidadAct) {
        this.capacidadMax = capacidadMax;
        this.cantidadAct = cantidadAct;
    }

        
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    public void llenarCafetera() {
      
        System.out.println("Se esta llenando la cafetera");
            cantidadAct = capacidadMax;
       
         
    }
    
    public int servirTaza() {
        int tam = 0;
        System.out.println("ingrese el tamano de la taza en cc: ");
        tam = leer.nextInt();
        if (tam > cantidadAct) {
            System.out.println("no se lleno la taza");
            System.out.println("la taza tiene: " + cantidadAct + " Litros");
            if (tam <= cantidadAct) {
                System.out.println("la taza se lleno");
            }
        }
        cantidadAct = (cantidadAct - tam);
        System.out.println(" La cantidad de cafe que queda es: "+cantidadAct);
        return tam;
    }

    public void vaciarCafe() {
        System.out.println("La cafetera se vacio ");
        cantidadAct = 0;

    }

    public void agregarCafe() {
        int cant2 = 0;
        System.out.println("ingrese la cantidad de cafe que desea agregar a la cafetera: ");
        cant2= leer.nextInt();
        cantidadAct = cantidadAct + cant2;
        System.out.println(" La cantidad de cafe actual es: "+cantidadAct);
    }

}
