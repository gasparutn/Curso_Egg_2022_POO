
package Servicios;

import entidades.NIF;
import java.util.Scanner;


public class Servis {
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    NIF Data = new NIF();
    
    public void crearNif(){
        
        System.out.println("ingrese el dni: ");
        Data.setDNI(leer.nextInt());
        String[]vecLetras=new String[23];
        vecLetras[0]="T";
        vecLetras[1]="R";
        vecLetras[2]="W";
        vecLetras[3]="A";
        vecLetras[4]="G";
        vecLetras[5]="M";
        vecLetras[6]="Y";
        vecLetras[7]="F";
        vecLetras[8]="P";
        vecLetras[9]="D";
        vecLetras[10]="X";
        vecLetras[11]="B";
        vecLetras[12]="N";
        vecLetras[13]="J";
        vecLetras[14]="Z";
        vecLetras[15]="S";
        vecLetras[16]="Q";
        vecLetras[17]="V";
        vecLetras[18]="H";
        vecLetras[19]="L";
        vecLetras[20]="C";
        vecLetras[21]="K";
        vecLetras[22]="E";
        int resul=Data.getDNI()%23;
        System.out.println("Resultado es: "+resul);
        Data.setLetra(vecLetras[resul]);
         
      }  
        
        public void mostrar(){
        
            System.out.println(Data.getDNI()+"-"+Data.getLetra());
            
            
            
            
       } 
        
               
    }
           


