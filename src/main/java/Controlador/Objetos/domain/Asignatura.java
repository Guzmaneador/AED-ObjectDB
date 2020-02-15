package Controlador.Objetos.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

/**
 * @author munchi
 */
@Entity
public class Asignatura implements Serializable {


    
    @Id
    private String alias;

    @Basic
    private String nombre;

    @Basic
    private int curso;

    @ManyToOne
    private Profesor profesor;
    

    @ManyToMany(mappedBy = "asignaturas")
    private List<Alumno> alumnoes;

    
    
    public Asignatura() {
    }

    
    public Asignatura(String alias, String nombre, int curso, Profesor profesor, List<Alumno> alumnoes) {
        this.alias = alias;
        this.nombre = nombre;
        this.curso = curso;
        this.profesor = profesor;
        this.alumnoes = alumnoes;
    }
    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCurso() {
        return curso;
    }

    public void setCurso(int curso) {
        this.curso = curso;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    public List<Alumno> getAlumnoes() {
        if (alumnoes == null) {
            alumnoes = new ArrayList<>();
        }
        return alumnoes;
    }

    public void setAlumnoes(List<Alumno> alumnoes) {
        this.alumnoes = alumnoes;
    }

    public void addAlumno(Alumno alumno) {
        getAlumnoes().add(alumno);
    }

    public void removeAlumno(Alumno alumno) {
        getAlumnoes().remove(alumno);
    }

    @Override
    public String toString() {
        return "Asignatura{" + "alias=" + alias + ", nombre=" + nombre + ", curso=" + curso + "}";
    }
    
    
}