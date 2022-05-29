package Servicios;

import entidades.Matematica;
import java.util.Scanner;


public class Servis {

    private final Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public void devolverMayor(Matematica Nums) {
        
        if (Nums.getNum1() >= Nums.getNum2()) {
            System.out.println("-El numero 1 es el mayor-");

        } else if (Nums.getNum1() <= Nums.getNum2()) {
            System.out.println("-El numero 2 es el mayor-");
        }
        if (Nums.getNum1() == Nums.getNum2()) {
            System.out.println("-ambos numeros son iguales-");
        }
    }

    public void calcularPotencia(Matematica Nums) {
        
        System.out.println(""); 
        System.out.println("Se calcula la potencia del mayor elevado al menor");
        if (Nums.getNum1() > Nums.getNum2()) {
           float base = Math.round(Nums.getNum1());
            float expo = Math.round(Nums.getNum2());
            double resul=Math.pow(base,expo);
            System.out.println("("+base+" ^ "+expo+") es igual: "+resul);
          
        }else if (Nums.getNum2() > Nums.getNum1()){
            double base = Math.round(Nums.getNum1());
            double expo = Math.round(Nums.getNum2());
            double resul=Math.ceil(Math.pow(base,expo));
            System.out.println("("+expo+" ^ "+base+") es igual: "+Math.round(resul));
        }
                    
    }  
        
    public double calculaRaiz(Matematica Nums){
                     
        System.out.println("");
        double n1 = Math.abs(Nums.getNum1());
        System.out.println("valor: "+Math.round(n1));
        double n2 = Math.abs(Nums.getNum2());
        System.out.println("valor: "+Math.round(n2));
        if (n1 < n2) {

            return Math.sqrt(n1);

        } else {

            return Math.sqrt(n2);
        }

    }
        
}
     
   

