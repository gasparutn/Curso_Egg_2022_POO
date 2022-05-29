/*Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título,
Autor, Número de páginas, y un constructor con todos los atributos pasados por
parámetro y un constructor vacío. Crear un método para cargar un libro pidiendo los
datos al usuario y luego informar mediante otro método el número de ISBN, el título,
el autor del libro y el numero de páginas.
 */
package Ejerc1LIbro;

import java.util.Scanner;

/**
 *
 * @author Gaspar Laborde
 */
public class Libro {

    //ATRIBUTOS
    public int ISBN;
    public String Titulo;
    public String Autor;
    public int Numerodepaginas;

    //CONTRUCTOR
    public Libro() {
    }

    public Libro(int ISBN, String Titulo, String Autor, int Numerodepagina) {
        this.ISBN = ISBN;
        this.Titulo = Titulo;
        this.Autor = Autor;
        this.Numerodepaginas = Numerodepagina;
    }

//Mostrar libro mediante un metodo
    public void mostrarlibro() {
              
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("ingrese el ISBN del libro");

        ISBN = leer.nextInt();

        System.out.println("ingrese el Titulo del libro");
        Titulo = leer.next();
       
        System.out.println("ingrese el autor del libro");
         Autor = leer.next();

        System.out.println("ingrese el numero de paginas");
        Numerodepaginas = leer.nextInt();

    }

    public String toString() {
        return (" El libro " +Titulo+ " con numero de ISBN " +ISBN+ " del autor " +Autor+" con "+Numerodepaginas+ " paginas ");
    }
}
          