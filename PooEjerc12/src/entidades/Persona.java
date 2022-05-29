
package entidades;

import java.util.Date;


public class Persona {
    
   private String nombre;
   private Date fNac; 

    public Persona() {
    }

    public Persona(String nombre, Date fNac) {
        this.nombre = nombre;
        this.fNac = fNac;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getfNac() {
        return fNac;
    }

    public void setfNac(Date fNac) {
        this.fNac = fNac;
    }
    
    
    
}
