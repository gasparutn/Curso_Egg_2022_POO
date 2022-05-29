/*
Declarar una clase llamada Circunferencia que tenga como atributo privado el radio
de tipo real. A continuación, se deben crear los siguientes métodos:
a) Método constructor que inicialice el radio pasado como parámetro.
b) Métodos get y set para el atributo radio de la clase Circunferencia.
c) Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo
del objeto.
d) Método area(): para calcular el área de la circunferencia (Area = π ∗ radio!).
e) Método perimetro(): para calcular el perímetro (Perimetro = 2 ∗ π ∗ radio).
 */
package Ejerc2Circunf;

import java.util.Scanner;

/**
 *
 * @author gaspa
 */
// CLASE 
public class Circunferencia {

    // ATRIBUTOS
    private double Radio;
    

    // CONSTRUCTOR 
    public Circunferencia() {
    }
    
    public Circunferencia(double Radio, double Perimetro, double Area) {
        this.Radio = Radio;
        
    }
    
    public double getRadio() {
        return Radio;
    }

    public void setRadio(double Radio) {
        this.Radio = Radio;
    }
         

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public void crearCircunferencia() {
        System.out.println("ingrese el radio: ");
        Radio= leer.nextInt();
    }

    public double Area() {
         double Area = Math.PI * Radio ;
       return Area;
    }
    
    public double Perimetro() {
       double Perimetro = Radio * 2 * Math.PI;
     return Perimetro; 
    }
   
}
