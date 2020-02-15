package Controlador.Objetos.domain;

import java.io.Serializable;
import java.sql.Date;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @author munchi
 */
@Entity
public class Persona implements Serializable {

    public Persona() {
    }

    public Persona(String dni, String nombre, String apellido,Date fecha_nacimiento) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fecha_nacimiento = fecha_nacimiento;
    }
    

    @Id
    private String dni;

    @Basic
    private String nombre;

    @Basic
    private String apellido;

    @Basic
    private Date fecha_nacimiento;

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Date getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(Date fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    @Override
    public String toString() {
        return "dni=" + dni + ", nombre=" + nombre + ", apellido=" + apellido + ", fecha_nacimiento=" + fecha_nacimiento ;
    }
    

}