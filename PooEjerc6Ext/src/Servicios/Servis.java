package Servicios;

import entidades.Ahorcado;
import java.util.Scanner;


public class Servis {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Ahorcado Atrib = new Ahorcado();

    public int crearJuego() {

        System.out.println("ingrese la palabra que hay que adivinar");
        String palabra = leer.next();
        int cont = palabra.length();
        String[] busque2 = new String[cont];
        int z = 1;
        int k = 0;
        for (int i = 0; i < cont; i++) {
            busque2[i] = palabra.substring(k, z);
            k++;
            z++;
            System.out.print(busque2[i]);
        }
        for (int i = 0; i < cont; i++) {
            if(busque2[i].equals(" ")){
                cont = cont -1;
            }
        }
        System.out.println("");

        Atrib.setBusque(busque2);
        System.out.println("ingrese cantidad de jugadas maximas");
        Atrib.setContMax(leer.nextInt());
        Atrib.setContEncon(0);

        return cont;
    }

    public void longitud(int longitud) {

        System.out.println("La longitud es: " + longitud);

    }

    public String buscarletra(int longitud) {
        String letra;
        System.out.println("ingrese una letra a buscar");
        letra = leer.next();
        int conte = Atrib.getContEncon();
        for (int i = 0; i < longitud; i++) {
            if (Atrib.getBusque()[i].equals(letra)) {

              conte++;

            }

        }
       
       
        if (conte > 0) {
            System.out.println("La letra se encontro");
            Atrib.setContEncon(conte);
        } else {
            System.out.println("La letra no se encontro");
        }
        return letra;
    }

    public void encontradasLetras(String letra, int longitud) {

        System.out.println("Las letras encontradas son " + Atrib.getContEncon() + " Las letras que restan son " + (longitud - Atrib.getContEncon()));
        int cont = 0;
        for (int i = 0; i < longitud; i++) {
            if (!Atrib.getBusque()[i].equals(letra)) {
                cont = 1;

            }

        }
        int intentos = Atrib.getContMax();

        Atrib.setContMax(intentos - cont);

    }

    public void intentos() {
        System.out.println("Le quedan " + Atrib.getContMax() + " oportunidades");
    }

    public void Juego(){
       int longitud1 = crearJuego();
        do{
            
        longitud(longitud1);
        String letra = buscarletra(longitud1);
        encontradasLetras(letra, longitud1);
        intentos();
        
       }while(Atrib.getContEncon()!= longitud1 && Atrib.getContMax() != 0 );
        if(Atrib.getContEncon() == longitud1){
            System.out.println("Ganaste, que milagro");
        }
        if(Atrib.getContMax() == 0){
            System.out.println("No ganaste, suerte la proxima boludo");
        }
    }
}

/*
Método encontradas(letra): que reciba una letra ingresada por el usuario y muestre
cuantas letras han sido encontradas y cuantas le faltan. Este método además deberá
devolver true si la letra estaba y false si la letra no estaba, ya que, cada vez que se
busque una letra que no esté, se le restará uno a sus oportunidades.

• Método intentos(): para mostrar cuantas oportunidades le queda al jugador.

• Método juego(): el método juego se encargará de llamar todos los métodos
previamente mencionados e informará cuando el usuario descubra toda la palabra o
se quede sin intentos. Este método se llamará en el main.
 */
