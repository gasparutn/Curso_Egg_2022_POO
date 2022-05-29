package Main;

import entidades.Cadena;
import java.util.Scanner;

import servicios.Servi;

public class Main {
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        Cadena frase = new Cadena();
        
        System.out.println("ingrese un frase por favor: ");
        frase.setFrase(leer.nextLine());
        System.out.println("La frase es: " + frase.getFrase() + " y su longitud es de: " + frase.getLongitud());
        
        Servi voc = new Servi();        
        voc.mostrarvoc(frase);
        
        Servi INV = new Servi();
        INV.inverFrase(frase);
        
        Servi compar = new Servi();
        compar.comparaLongitud(frase);
        
        Servi veces = new Servi();
        
        veces.vecesRepetido(frase);
        
        Servi unir = new Servi();
        unir.metodoUnirFrase(frase);
        
        Servi reemplazar = new Servi();
        reemplazar.metedoReemplazar(frase);
        
        Servi contiene = new Servi();
        contiene.metodoContiene(frase);
    }    
    
    
}
