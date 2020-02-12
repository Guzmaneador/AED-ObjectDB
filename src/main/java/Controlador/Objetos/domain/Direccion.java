package Controlador.Objetos.domain;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Embeddable;

/**
 * @author munchi
 */
@Embeddable
public class Direccion implements Serializable {

    @Basic
    private String ciudad;

    @Basic
    private String calle;

    @Basic
    private int numero;

    public Direccion() {
    }

    public Direccion(String ciudad, String calle, int numero) {
        this.ciudad = ciudad;
        this.calle = calle;
        this.numero = numero;
    }
    
    

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

}