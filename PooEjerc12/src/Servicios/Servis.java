package Servicios;

import entidades.Persona;
import java.util.Date;
import java.util.Scanner;

public class Servis {

    Persona P1 = new Persona();
Scanner leer = new Scanner(System.in).useDelimiter("\n");
    public void crearPersona(Persona P1) {

        
         
        System.out.println("ingrese el nombre de la persona: ");
        P1.setNombre(leer.next());
        System.out.println("Ingrese el día de nacimiento");
        int dia = leer.nextInt();
        System.out.println("Ingrese el mes de nacimiento");
        int mes = leer.nextInt();
        System.out.println("Ingrese el año de nacimiento");
        int anio = leer.nextInt();
        Date Fechas = new Date(anio - 1900, mes - 1, dia);
        P1.setfNac(Fechas);
        System.out.println("La fecha de nacimiento es: " + P1.getfNac());

    }

    public int calcularEdad(Persona P1) {
        Date fechaActual = new Date();
        int edad = fechaActual.getYear() - P1.getfNac().getYear();
        System.out.println(edad);
         return edad; 
    }

    /*
    Agregar a la clase el método menorQue(int edad) que recibe como 
    parámetro otra edad y retorna true en caso de que el receptor tenga
    menor edad que la persona que se recibe como parámetro, o false en 
    caso contrario.
     */
    public void menorQue(Persona P1, int edad) {
        System.out.println("ingrese nueva edad: ");
     int edad2= leer.nextInt();
     boolean mayor;
     if(edad<edad2) {
         mayor=true;
     }else {
         mayor = false;
     }
        System.out.println(mayor);
      
        
  }
    public void mostrarPersona(Persona P1, int edad){
        
        System.out.println("El nombre es: "+P1.getNombre());    
        System.out.println("El nacimiento es: "+P1.getfNac());
        System.out.println("La edad es: "+edad);
    }

} 