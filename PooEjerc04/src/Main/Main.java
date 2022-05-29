package Main;

import entidades.Rectangulo;
import servicios.serviciosR;

public class Main {

    public static void main(String[] args) {

        serviciosR Ser1 = new serviciosR();

        Rectangulo Rec = Ser1.crearRect();

        System.out.println("La superficie es: " + Ser1.calsuperf(Rec.getBase(), Rec.getAltura()));
        System.out.println("La Peirmetro es: " + Ser1.calperim(Rec.getBase(), Rec.getAltura()));
        
        System.out.println("El rectangulo es: ");
        Ser1.dibujarrect(Rec.getBase(), Rec.getAltura());
    }

}
