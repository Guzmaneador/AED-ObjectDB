package Controlador;

import Controlador.Objetos.domain.Alumno;
import Controlador.Objetos.domain.Asignatura;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author munchi
 */
public interface Controlador {

    public  List<Alumno> getAlumnosCon();

    public void iniciar();

    public void insertarObjetosCon();

    public List<Asignatura> getAsignaturas();

    public void updateAlumnoCon(Alumno recogerDatosFormulario);

    
}
