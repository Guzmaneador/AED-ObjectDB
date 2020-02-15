package Controlador;

import Controlador.Objetos.domain.Alumno;
import Controlador.Objetos.domain.Asignatura;
import Controlador.Objetos.domain.Profesor;
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

    public void createAlumnoCon(Alumno alumno);
    
    public List <Asignatura> AsignaturasProfesorCon(String dni);

    public List<Alumno> cursoAsignaturaCon(int i);

    public List<Alumno> mostrarAlumnosDeAsignatura(String siglas);

    public List<Profesor> getProfesores();

    public List<Alumno> AlumnosProfesorCon(String dni);

    
}
