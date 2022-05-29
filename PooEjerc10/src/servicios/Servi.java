/*
Realizar un programa en Java donde se creen dos arreglos: el primero será un arreglo
A de 50 números reales, y el segundo B, un arreglo de 20 números, también reales. El
programa deberá inicializar el arreglo A con números aleatorios y mostrarlo por
pantalla. Luego, el arreglo A se debe ordenar de menor a mayor y copiar los primeros
10 números ordenados al arreglo B de 20 elementos, y rellenar los 10 últimos
elementos con el valor 0.5. Mostrar los dos arreglos resultantes: el ordenado de 50
elementos y el combinado de 20.
 */
package servicios;

import entidades.arrays.arreglos;
import java.util.Arrays;

public class Servi {

    public void MostrarArrays() {
        arreglos Arrays1 = new arreglos();
        double A1[] = new double[50];

        for (int i = 0; i < A1.length; i++) {
            A1[i] = Math.random() * 50;
            Arrays1.setA(A1);

            System.out.println("arreglo A es: " + Math.round(A1[i]));

            System.out.println("");  
            
        }
       Arrays.sort(Arrays1.getA());
       for (int i = 0; i < A1.length; i++) {
        
       System.out.println("arreglo A ordenado es: "+Math.round(A1[i]));
      
               
           }
       double A2[] = new double[20];
       
       for(int i=0 ; i<20 ; i++){
           if(i<10){
            A2[i]= A1[i];
            
       }else{
               A2[i]=0.5;
           }
          System.out.println("arreglo B ordenado es: "+(A2[i]));
    }
        
    } 
       
        
}     
 
