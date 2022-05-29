
package entidades.arrays;


public class arreglos {
    
   private double A[]; 
   private double B[]; 

    public arreglos() {
    A = new double[50];
    B = new double[20];
      }

    public arreglos(double[] A, double[] B) {
        this.A = A;
        this.B = B;
    }

    public double[] getA() {
        return A;
    }

    public void setA(double[] A) {
        this.A = A;
    }

    public double[] getB() {
        return B;
    }

    public void setB(double[] B) {
        this.B = B;
    }
    


}