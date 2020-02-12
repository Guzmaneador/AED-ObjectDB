package Controlador;

import Controlador.Objetos.domain.Alumno;
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

    
}
