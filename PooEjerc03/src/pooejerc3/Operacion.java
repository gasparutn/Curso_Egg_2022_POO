

package pooejerc3;

import com.sun.org.apache.bcel.internal.generic.BREAKPOINT;
import java.util.Scanner;

public class Operacion {

    //ATRIBUTOS
    private int num1;
    private int num2;

    //CONSTRUCTOR
    public Operacion() {
    
    }
    public Operacion(int num1, int num2) {

        this.num1 = num1;
        this.num2 = num2;
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return  num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    
    public void crearOperacion() {

        System.out.println("ingrese un numero: ");
        num1 = leer.nextInt();
        System.out.println("ingrese otro numero: ");
        num2 = leer.nextInt();
    }
     //METODOS
    public int sumar() {
        int suma = num1 + num2;
        return suma;
    }

    public int restar() {
        int restar = num1 + num2;
        return restar;
    }
    public int multip() {
        if(num2==0){
        System.out.println("error en la multiplicacion");
        
        }else {
         int multip = num1 * num2;
          return multip;
        }      
        return 0;
    }
        
        
    public int div() {
        if(num2==0){
        System.out.println("error en la division");
        
        }else {
          int div = num1 / num2;
          return div; 
        }
        return 0;
       
    }   

   
}
        
        
    
      
    
    


