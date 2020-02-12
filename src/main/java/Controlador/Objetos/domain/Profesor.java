package Controlador.Objetos.domain;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;

/**
 * @author munchi
 */
@Entity
public class Profesor extends Persona {

    public Profesor() {
    }

    public Profesor(String rol, List<Integer> telefonos, Direccion direccion, String dni, String nombre, String apellido, Date fecha_nacimiento) {
        super(dni, nombre, apellido, fecha_nacimiento);
        this.rol = rol;
        this.telefonos = telefonos;
        this.direccion = direccion;
    }
    

    @Basic
    private String rol;

    @ElementCollection
    private List<Integer> telefonos;

    @Embedded
    private Direccion direccion;

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public List<Integer> getTelefonos() {
        if (telefonos == null) {
            telefonos = new ArrayList<>();
        }
        return telefonos;
    }

    public void setTelefonos(List<Integer> telefonos) {
        this.telefonos = telefonos;
    }

    public void addTelefono(Integer telefono) {
        getTelefonos().add(telefono);
    }

    public void removeTelefono(Integer telefono) {
        getTelefonos().remove(telefono);
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

}