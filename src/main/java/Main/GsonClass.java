package Main;

import Controlador.Objetos.domain.Alumno;
import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author munchi
 */
public class GsonClass{
    JsonReader JR;

    public GsonClass() {
        
    }
    
    public void leerJson(){
        
        try {
            this.JR = new JsonReader(new FileReader("json/alumnos.json"));
            Gson g= new Gson();
            Alumno[] alumnos = g.fromJson(JR,Alumno.class);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(GsonClass.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
