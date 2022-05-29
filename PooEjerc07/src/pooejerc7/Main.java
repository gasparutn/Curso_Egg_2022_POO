package pooejerc7;

import entidades.Persona;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int contmay = 0, contmen = 0;
        int contPbaj = 0, contPide = 0, contPalt = 0;

        Persona p1 = new Persona();

        p1.crearPersona();

        if (p1.esMayorDeEdad()) {
            contmay++;
        } else {
            contmen++;
        }
        switch (p1.calcularIMC()) {
            case 1:
                contPalt++;
                break;
            case 0:
                contPide++;
                break;
            case -1:
                contPbaj++;
                break;
        }
        
        
        
                
        System.out.println("Esta es la Persona 1");
        Persona p2 = new Persona();
        p2.crearPersona();

        if (p2.esMayorDeEdad()) {
            contmay++;
        } else {
            contmen++;
        }
        switch (p2.calcularIMC()) {
            case 1:
                contPalt++;
                break;
            case 0:
                contPide++;
                break;
            case -1:
                contPbaj++;
                break;
        }
        System.out.println("Esta es la Persona 2");
        Persona p3 = new Persona();
        p3.crearPersona();

        if (p3.esMayorDeEdad()) {
            contmay++;
        } else {
            contmen++;
        }

        switch (p3.calcularIMC()) {
            case 1:
                contPalt++;
                break;
            case 0:
                contPide++;
                break;
            case -1:
                contPbaj++;
                break;
        }
        System.out.println("Esta es la Persona 3");
        Persona p4 = new Persona();
        p4.crearPersona();

        if (p4.esMayorDeEdad()) {
            contmay++;
        } else {
            contmen++;
        }
        switch (p4.calcularIMC()) {
            case 1:
                contPalt++;
                break;
            case 0:
                contPide++;
                break;
            case -1:
                contPbaj++;
                break;
        }
        System.out.println("Esta es la Persona 4");
        System.out.println("El porcentaje de gente de bajo de su peso ideal: " + contPbaj * 100 / 4+"%");
        System.out.println("El porcentaje de gente de su peso ideal es: " + contPide * 100 / 4+"%");
        System.out.println("El porcentaje de gente con sobrepeso es: " + contPalt * 100 / 4+"%");
        System.out.println("El porcentaje de gente mayor de edad es: " + contmay * 100 / 4+"%");
        System.out.println("El porcentaje de gente menor de edad es: " + contmen * 100 / 4+"%");
    }

}
