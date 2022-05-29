package entidades;

import Ctabanc.Ctabanc;
import java.util.Scanner;

public class servicios {

    private final Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Ctabanc crearCuenta() {
        Ctabanc Cta1 = new Ctabanc();
       
        System.out.println("ingrese n de una cuenta: ");
        Cta1.setNroCta(leer.nextInt());

        System.out.println("ingrese n DNI de la cuenta: ");
        Cta1.setDniCliente(leer.nextLong());

        System.out.println("ingrese el saldo actual: ");
        Cta1.setSalActu(leer.nextDouble());

        return Cta1;
    }

    public double ingreso(Ctabanc Cta1) {
        double ingrD = 0;
        System.out.println("ingrese la cantidad de dinero a depositar: ");
        ingrD= leer.nextDouble();
        ingrD = ingrD + Cta1.getSalActu();
        Cta1.setSalActu(ingrD);
        return ingrD;
    }
       
    }
       
    
    
    
    
    
   
        


    
   


                

        
    

    
    
    

    
    
    
