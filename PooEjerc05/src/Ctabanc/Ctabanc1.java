
package Ctabanc;


public class Ctabanc1 {
    
//ATRIBUTOS
    int nroCta;
    long dniCliente;
    double salActu;
//CONSTRUCTO

    public Ctabanc1() {
    }

    public Ctabanc1(int nroCta, long dniCliente, double salActu) {
        this.nroCta = nroCta;
        this.dniCliente = dniCliente;
        this.salActu = salActu;
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

      
}
