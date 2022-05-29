package servicios;

import entidades.Cadena;
import java.util.Scanner;

public class Servi {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public void mostrarvoc(Cadena frase) {
        int cont1 = 0;
        frase.setLongitud(frase.getFrase().length());
        String palabra = frase.getFrase();
        String letra;
        for (int i = 0; i < frase.getLongitud(); i++) {
            letra = palabra.toLowerCase().substring(i, (i + 1));

            if (letra.equals("a") || letra.equals("e") || letra.equals("i") || letra.equals("o") || letra.equals("u")) {
                cont1++;
            }
        }

        System.out.println("La cantidad de vocales es: " + cont1);

    }

    public void inverFrase(Cadena frase) {
        System.out.println("Se va mostrar la palabra invertida: ");
        String invert = "";

        for (int i = frase.getLongitud() - 1; i >= 0; i--) {
            invert = invert + frase.getFrase().charAt(i);

        }
        System.out.println(invert);

    }

    public void comparaLongitud(Cadena frase) {
        String frasenew = "";

        System.out.println("ingrese una nueva frase: ");
        frasenew = leer.nextLine();
        int logfrase2 = frasenew.length();
        if (frase.getLongitud() == logfrase2) {
            System.out.println("ambas tienen la misma longitud");

        } else {
            System.out.println("la longitud son distintas");
        }

    }

    public void vecesRepetido(Cadena frase) {

        System.out.println("ingrese la letra que desea buscar: ");
        String letra = leer.next();
        int cont = 0;

        for (int i = 0; i < frase.getLongitud(); i++) {
            if (frase.getFrase().substring(i, i + 1).equals(letra)) {
                cont++;

            }
        }
        System.out.println(" la letra se repite n: " + cont + " veces");

    }

    public void metodoUnirFrase(Cadena frase) {
        String frasenew2 = "";
        System.out.println("ingrese una nueva frase: ");
        frasenew2 = leer.nextLine();
        String concat = frase.getFrase().concat(frasenew2);

        System.out.println("La frase a unir es: " + concat);
    }

    public void metedoReemplazar(Cadena frase) {
        System.out.println("Ingrese el caracter que quiere reemplazar");
        String caracter = leer.next();
        int longitud = caracter.length();
        while (longitud != 1) {
            System.out.println("Usted no ingreso UN(1) solo caracter bestia!! ");
            caracter = leer.next();
            longitud = caracter.length();

        }
        String newfrase = frase.getFrase().replace("a", caracter);
        System.out.println("" + newfrase);
    }

    public void metodoContiene(Cadena frase) {
        boolean si = false;
        System.out.println("Ingrese el caracter a  buscar en la frase");
        String caracter = leer.next();
        int longitud = caracter.length();
        while (longitud != 1) {
            System.out.println("Usted no ingreso un caracter");
            caracter = leer.next();
            longitud = caracter.length();
        }
        for (int i = 0; i < frase.getLongitud(); i++) {
            if (frase.getFrase().substring(i, i + 1).equals(caracter)) {
                si = true;
                break;
            }
        }
        System.out.println(si);

    }

}
