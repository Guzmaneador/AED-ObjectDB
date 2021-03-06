
package Controlador;

import Controlador.Objetos.domain.Alumno;
import Controlador.Objetos.domain.Asignatura;
import Controlador.Objetos.domain.Profesor;
import Modelo.Modelo;
import Vista.Vista;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author munchi
 */
public class ControladorImpl implements Controlador{
    Modelo modelo;
    Vista vista;
    
    public ControladorImpl(Modelo modelo, Vista vista) {
    this.modelo = modelo;
    this.vista = vista;
    }

    @Override
    public void iniciar() {
       vista.mostrar();
    }

    @Override
    public void insertarObjetosCon() {
        modelo.insertarObjetos();
    }

    @Override
    public List<Alumno> getAlumnosCon() {
        return modelo.obtenerAlumnos();
    }

    @Override
    public List<Asignatura> getAsignaturas() {
         return modelo.obtenerAsignaturas();
    }

    @Override
    public void updateAlumnoCon(Alumno alumno) {
        modelo.updateAlumno(alumno);
    }

    @Override
    public void createAlumnoCon(Alumno alumno) {
        modelo.createAlumno(alumno);
    }

    @Override
    public List<Asignatura> AsignaturasProfesorCon(String dni) { 
        return modelo.asignaturasProfesor(dni);
    }

    @Override
    public List<Alumno> cursoAsignaturaCon(int i) {
         return modelo.cursoAsignatura(i);

        
    }

    @Override
    public List<Alumno> mostrarAlumnosDeAsignatura(String siglas) {
       return modelo. mostrarAlumnosDeAsignatura(siglas);
    }

    @Override
    public List<Profesor> getProfesores() {
       return modelo.getProfesores();
    }

    @Override
    public List<Alumno> AlumnosProfesorCon(String dni) {
        return modelo.alumnosProfesor(dni);
    }
    
    
}
