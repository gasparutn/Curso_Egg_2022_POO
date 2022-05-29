package servicios;

import java.util.Scanner;
import entidades.Rectangulo;

public class serviciosR {

    private final Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Rectangulo crearRect() {
        Rectangulo Rec = new Rectangulo();

        System.out.println("ingrese la altura: ");
        Rec.setAltura((int) leer.nextDouble());

        System.out.println("ingrese la base: ");
        Rec.setBase((int) leer.nextDouble());

        return Rec;
    }

    public double calsuperf(double base, double altura) {

        return base * altura;

    }

    public double calperim(double base, double altura) {

        return (base + altura) * 2;
    }

    public void dibujarrect(double base, double altura) {
        for (int i = 1; i <= altura; i++) {
            for (int j = 1; j <= base; j++) {

                if ((i > 1 && i < altura) && (j > 1 && j < base)) {
                    System.out.print("*");
                }
                    System.out.print(" ");
                
            }
            System.out.println("");
        }
    }

    }