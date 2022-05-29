package Main;

import java.util.Date;
import java.util.Scanner;

public class Ejercicio11 {

    public static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Ingrese el día");
        int dia = leer.nextInt();
        System.out.println("Ingrese el mes");
        int mes = leer.nextInt();
        System.out.println("Ingrese el año");
        int year = leer.nextInt();

        Date fechaUsuario = new Date(year-1900, mes-1, dia);
        Date fechaActual = new Date();

        System.out.println(fechaUsuario);
        System.out.println(fechaActual);

        int añosDeDiferencia = fechaActual.getYear() - fechaUsuario.getYear();
        System.out.println("Hay " + añosDeDiferencia + " años de diferencia entre las fechas");
    }
}