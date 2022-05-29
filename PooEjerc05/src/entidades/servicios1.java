package entidades;

import Ctabanc.Ctabanc1;
import java.util.Scanner;

public class servicios1 {

    private final Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Ctabanc1 crearCuenta() {
        Ctabanc1 Cta1 = new Ctabanc1();

        System.out.println("ingrese n de una cuenta: ");
        Cta1.setNroCta(leer.nextInt());

        System.out.println("ingrese n DNI de la cuenta: ");
        Cta1.setDniCliente(leer.nextLong());

        System.out.println("ingrese el saldo actual: ");
        Cta1.setSalActu(leer.nextDouble());

        return Cta1;
    }

    public double ingreso(Ctabanc1 Cta1) {
        double ingrD = 0;
        System.out.println("ingrese la cantidad de dinero a depositar: ");
        ingrD= leer.nextDouble();
        ingrD = ingrD + Cta1.getSalActu();
        Cta1.setSalActu(ingrD);
        return ingrD;
    }
   
    public double retirar(Ctabanc1 Cta1) {
        double retiD = 0;
              
        do { 
        System.out.println("ingrese la cantidad de dinero a retirar: ");
        retiD = leer.nextDouble();
        if(Cta1.getSalActu()>retiD){
        
        }
        else{
            
            System.out.println("saldo insuficiente");
        }
        } while (Cta1.getSalActu()<retiD);
        retiD =Cta1.getSalActu() - retiD;
        Cta1.setSalActu(retiD);
        return retiD;     
           
    }
    public double extrarapid(Ctabanc1 Cta1){
     double rapid=0;
        do {
        System.out.println("ingrese monto de extracion rapida, solo admite el 20% del saldo:");
        rapid = leer.nextInt();
        
        if((Cta1.getSalActu()*0.20)<rapid){
        System.out.println("el monto excede el 20%");
        }
        
                  
        }while ((Cta1.getSalActu()*0.20)<rapid);   
       
        Cta1.setSalActu(Cta1.getSalActu()-rapid);
        return rapid;
        
    }
   
    public void consulSal(Ctabanc1 Cta1) {
        System.out.println("consultar saldo:"+Cta1.getSalActu()); 
    }
    public void consuldat(Ctabanc1 Cta1) {
   System.out.println("El numero de cuenta es:"+Cta1.getNroCta());
        System.out.println("El dni es: "+Cta1.getDniCliente()); 
    }
}
  

