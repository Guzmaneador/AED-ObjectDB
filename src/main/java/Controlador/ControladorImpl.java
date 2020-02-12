
package Controlador;

import Controlador.Objetos.domain.Alumno;
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
    
    
}
