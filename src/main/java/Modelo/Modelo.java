
package Modelo;

import Controlador.Objetos.domain.Alumno;
import java.util.List;

/**
 *
 * @author munchi
 */
public interface Modelo {
    public void insertarObjetos();
    
    public List<Alumno> obtenerAlumnos();
    
}
