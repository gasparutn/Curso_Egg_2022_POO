
package entidades;


public class Ahorcado {
    
   private String[] busque;
   private int contEncon;
   private int contMax;

    public Ahorcado() {
    }

    public Ahorcado(int contEncon, int contMax) {
        this.contEncon = contEncon;
        this.contMax = contMax;
    }

    public int getContEncon() {
        return contEncon;
    }

    public void setContEncon(int contEncon) {
        this.contEncon = contEncon;
    }

    public int getContMax() {
        return contMax;
    }

    public void setContMax(int contMax) {
        this.contMax = contMax;
    }

    public String[] getBusque() {
        return busque;
    }

    public void setBusque(String[] busque) {
        this.busque = busque;
    }
     
    
}
