
package Ctabanc;


public class Ctabanc {
    
//ATRIBUTOS
    int nroCta;
    long dniCliente;
    double salActu;
    double opcion;
//CONSTRUCTO

    public Ctabanc() {
    }

    public Ctabanc(int nroCta, long dniCliente, double salActu, double opcion) {
        this.nroCta = nroCta;
        this.dniCliente = dniCliente;
        this.salActu = salActu;
        this.opcion = opcion; 
    }

    public int getNroCta() {
        return nroCta;
    }

    public void setNroCta(int nroCta) {
        this.nroCta = nroCta;
    }

    public long getDniCliente() {
        return dniCliente;
    }

    public void setDniCliente(long dniCliente) {
        this.dniCliente = dniCliente;
    }

    public double getSalActu() {
        return salActu;
    }

    public void setSalActu(double salActu) {
        this.salActu = salActu;
    }

    public double getOpcion() {
        return opcion;
    }

    public void setOpcion(double opcion) {
        this.opcion = opcion;
    }
   
      
}
