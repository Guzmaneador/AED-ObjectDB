package Controlador.Objetos.domain;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;

/**
 * @author munchi
 */
@Entity
public class Alumno extends Persona {

    public Alumno() {
    }

    public Alumno(List<Integer> telefonos, Direccion direccion, List<Asignatura> asignaturas, String dni, String nombre, String apellido, Date fecha_nacimiento) {
        super(dni, nombre, apellido, fecha_nacimiento);
        this.telefonos = telefonos;
        this.direccion = direccion;
        this.asignaturas = asignaturas;
    }
    

    @ElementCollection
    private List<Integer> telefonos;

    @Embedded
    private Direccion direccion;

    @ManyToMany
    private List<Asignatura> asignaturas;

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

    public List<Asignatura> getAsignaturas() {
        if (asignaturas == null) {
            asignaturas = new ArrayList<>();
        }
        return asignaturas;
    }

    public void setAsignaturas(List<Asignatura> asignaturas) {
        this.asignaturas = asignaturas;
    }

    public void addAsignatura(Asignatura asignatura) {
        getAsignaturas().add(asignatura);
        asignatura.getAlumnoes().add(this);
    }

    public void removeAsignatura(Asignatura asignatura) {
        getAsignaturas().remove(asignatura);
        asignatura.getAlumnoes().remove(this);
    }

}