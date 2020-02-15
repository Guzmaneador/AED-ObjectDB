
package Modelo;

import Controlador.Objetos.domain.Alumno;
import Controlador.Objetos.domain.Asignatura;
import Controlador.Objetos.domain.Profesor;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author munchi
 */
public interface Modelo {
    public void insertarObjetos();
    
    public List<Alumno> obtenerAlumnos();

    public List<Asignatura> obtenerAsignaturas();

    public void updateAlumno(Alumno alumno);

    public void createAlumno(Alumno alumno);

    public List<Asignatura> asignaturasProfesor(String dni);

    public List<Alumno> cursoAsignatura(int i);

    public List<Alumno> mostrarAlumnosDeAsignatura(String siglas);

    public List<Profesor> getProfesores();

    public List<Alumno> alumnosProfesor(String dni);
    
}
