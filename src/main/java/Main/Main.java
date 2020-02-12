package Main;

import Controlador.Controlador;
import Controlador.ControladorImpl;
import Modelo.Modelo;
import Modelo.ModeloImpl;
import Vista.GUI;
import Vista.Vista;

/**
 *
 * @author munchi
 */
public class Main {
    public static void main(String[] args) {
        Modelo modelo = new ModeloImpl();
        Vista vista = new GUI();
        Controlador controlador = new ControladorImpl(modelo,vista);
        controlador.iniciar();
    }
    
}
