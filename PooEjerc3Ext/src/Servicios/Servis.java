package Servicios;

import entidades.Raices;
import java.util.Scanner;

public class Servis {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public void ingresavalor(Raices RaSer) {

        System.out.println("ingrese valor a, b, c : ");
        RaSer.setA(leer.nextDouble());
        RaSer.setB(leer.nextDouble());
        RaSer.setC(leer.nextDouble());

    }

    public double getDiscrimante(Raices RaSer) {
       
        double d;
        d = Math.pow(RaSer.getB(), 2) - 4 * RaSer.getA() * RaSer.getC();
        
        return d;

    }

    public boolean tieneRaices(Raices RaSer) {

        if (getDiscrimante(RaSer) >= 0) {
            
            return true;
        } else {
            
            return false;
        }
    }

    public boolean tieneRaiz(Raices RaSer) {

        if (getDiscrimante(RaSer) == 0) {
            
            return true;

        } else {
            return false;
        }
    }

    public void obtenerRaices(Raices RaSer) {
        double ra1;
        double ra2;
        if (tieneRaices(RaSer)) {
            ra1 = (-RaSer.getB()) + Math.sqrt((Math.pow(RaSer.getB(), 2)) - (4 * RaSer.getA() * RaSer.getC()) / (2 * RaSer.getA()));
            ra2 = (-RaSer.getB()) - Math.sqrt((Math.pow(RaSer.getB(), 2)) - (4 * RaSer.getA() * RaSer.getC()) / (2 * RaSer.getA()));
            System.out.println(" Primera solucion: " +ra1+" Segunda solucion: "+ra2);
        } else {
            System.out.println("no tiene dos raices");
        }
    }

    public void obtenerRaiz(Raices RaSer) {

        double ra1;
       
        if (tieneRaiz(RaSer)) {

            ra1 = (-RaSer.getB()) - Math.sqrt((Math.pow(RaSer.getB(), 2)) - (4 * RaSer.getA() * RaSer.getC()) / (2 * RaSer.getA()));

            System.out.println(ra1);
        } else {
            System.out.println("No tiene unica raiz");
        }

    }

    public void calcular(Raices RaSer) {
         if (tieneRaices(RaSer)) {
            obtenerRaices(RaSer);
        } else if (tieneRaiz(RaSer)) {
            obtenerRaiz(RaSer);
            
        } else {
            System.out.println("No tiene ninguna raiz");
        }
        }

    }


