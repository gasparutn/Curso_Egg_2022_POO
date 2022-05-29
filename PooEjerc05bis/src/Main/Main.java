package Main;

import Ctabanc.Ctabanc;
import entidades.servicios;
import java.util.Scanner;



public class Main {

    public static void main(String[] args) {

        servicios Ban = new servicios();

        Ctabanc Cta1 = Ban.crearCuenta();

        Scanner leer = new Scanner(System.in);

        System.out.println("ingrese una opcion");
        System.out.println("1)ingreso dinero:");
        System.out.println("2) Retiro de dinero:");
        System.out.println("3) Retiro Extracash rapido");
        System.out.println("4) Retiro hasta el 20%");
        System.out.println("5)Desea consultar saldo");
        System.out.println("6)Desea consultar los Datos");
        int opcion = leer.nextInt();

        switch (opcion) {
            case 1:
                Ban.ingreso(Cta1);
                break;
            case 2:
                Ban.ingreso(Cta1);
                break;
            case 3:
                Ban.ingreso(Cta1);
                break;
            case 4:
                Ban.ingreso(Cta1);
                break;
            case 5:
                Ban.ingreso(Cta1);
                break;
            case 6:
                Ban.ingreso(Cta1);
                break;
            case 7:
                Ban.ingreso(Cta1);
                break;
               
        }

    }
}
