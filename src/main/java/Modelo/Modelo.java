
package Modelo;

import Controlador.Objetos.domain.Alumno;
import Controlador.Objetos.domain.Asignatura;
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
    
}
