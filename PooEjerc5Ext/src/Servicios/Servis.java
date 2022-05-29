
package Servicios;

import entidades.Ano;
import java.util.Scanner;


public class Servis {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Ano Cal = new Ano();
    int cont=0;
    public void meSecreto(){
    String[] meses = new String[12];
    meses[0]="enero"; 
    meses[1]="febrero"; 
    meses[2]="marzo"; 
    meses[3]="abril"; 
    meses[4]="mayo"; 
    meses[5]="junio"; 
    meses[6]="julio"; 
    meses[7]="agosto"; 
    meses[8]="septiembre"; 
    meses[9]="octubre"; 
    meses[10]="noviembre"; 
    meses[11]="diciembre"; 
    
    Cal.setMeses(meses);
    String mesSecreto;
    mesSecreto=meses[9];
    String adivine; 
       do { 
        System.out.println("adivine cual es el mes secreto: ");
        adivine= leer.next();
        if(!adivine.equals(mesSecreto)){
            
            System.out.println("OSO!!!, vuelva a intentar");
            cont++;
        }   
        if(cont==3){
        System.out.println("Lo ha intentado 3 veces. Vayase a dormir");
        break;
        }
        
      } while (!adivine.equals(mesSecreto));
        if(adivine.equals(mesSecreto)){
        System.out.println("Felicitaciones!! tiene un tuje enorme!, lo intentó " + cont + " veces");
        }
    
        
    }
 
    
}
