package entidades;

import java.util.Scanner;

public class Persona {

    private String nombre;
    private int edad;
    private String sexo;
    private int peso;
    private double altura;

    public Persona() {
    }

    public Persona(String nombre, int edad, String sexo, int peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public void crearPersona() {
        System.out.println("Ingrese una persona");
        System.out.println(" ingrese sexo tipo M ; F : O: ");
        sexo = leer.next();
        while (!sexo.equals("M") && !sexo.equals("F") && !sexo.equals("O")) {
            System.out.println(" error, ingrese lo que se le pide Dios mio!!");

            System.out.println(" ingrese sexo tipo M ; F : O: ");
            sexo = leer.next();

        }
        System.out.println(" ingrese nombre: ");
        nombre = leer.next();
        System.out.println(" ingrese edad: ");
        edad = leer.nextInt();
        System.out.println(" ingrese altura: ");
        altura = leer.nextDouble();
        System.out.println("ingrese peso: ");
        peso = leer.nextInt();

    }
    
   public int calcularIMC() {

        double imc;
      
       System.out.println("   Se calcula el IMC de la Persona");
        imc= peso / (altura * altura);
        if (imc < 20){
            System.out.println("  se encuentra por debajo de su peso ideal");
            System.out.println("EL IMC de la Persona es: -1");
            return-1;                  
        }else if (imc >= 20 && imc <= 25){
            System.out.println("  se encuentra en su peso ideal ");
            System.out.println("EL IMC de la Persona es: 0");
            return 0;
        }else
       System.out.println("  se encuentra por arriba de su peso ideal ");
        System.out.println("EL IMC de la Persona es: 1 ");
       return 1; 
       
     }
   
   public boolean esMayorDeEdad(){
     
     if (edad > 18) {

            System.out.println("  Es mayor de edad");

            return true;

        } else {

            System.out.println("Es menor de edad");

            return false;
  }    
   
   
   }
   
  
}

       
  

