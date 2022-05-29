package Main;

import Ctabanc.Ctabanc1;
import entidades.servicios1;
import java.util.Scanner;



public class Main {
    private final Scanner leer = new Scanner(System.in).useDelimiter("\n");
    public static void main(String[] args) {

        servicios1 Ban = new servicios1();

        Ctabanc1 Cta1 = Ban.crearCuenta();
        
        servicios1 InG = new servicios1();
        
        System.out.println(InG.ingreso(Cta1));
        
        
        servicios1 egrE = new servicios1();
        
        System.out.println(egrE.retirar(Cta1));
       
        servicios1 extr = new servicios1();
        System.out.println(extr.extrarapid(Cta1));
        
        servicios1 consulsal = new servicios1();
        consulsal.consulSal(Cta1);
        System.out.println("");
              
        servicios1 consuldat = new servicios1();
        consuldat.consuldat(Cta1);
        System.out.println("");
              
        
        
       

        
        
                    
    
                      
    }

    
    }
