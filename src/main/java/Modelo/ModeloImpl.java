package Modelo;

import Controlador.Objetos.domain.Alumno;
import Controlador.Objetos.domain.Asignatura;
import Controlador.Objetos.domain.Direccion;
import Controlador.Objetos.domain.Profesor;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author munchi
 */
public class ModeloImpl implements Modelo{
    EntityManager em;
    EntityManagerFactory emf ;

    public ModeloImpl() {
    }
    
    @Override
    public List<Alumno> obtenerAlumnos() {
        emf = Persistence.createEntityManagerFactory("src/db/matricula.odb");
        em = emf.createEntityManager();
        Query consulta = em.createQuery("SELECT a FROM Alumno a",Alumno.class);
        List<Alumno> alumnos= consulta.getResultList();
        em.close();
        emf.close();
        return alumnos;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    @Override
    public void insertarObjetos(){
        
        
        ArrayList <Profesor> listaProfes = new ArrayList<>();
        List<Integer> telefono = new ArrayList<>();
        telefono.add(6598487);
        Profesor profe1=new Profesor("Profesor", telefono, new Direccion("S/C de Tenerife", "La Rosa", 5), "40000000A", "Luis", "Perez Medina", (Date) Date.valueOf("1995-11-05"));
        listaProfes.add(profe1);
        
        telefono.clear();
        telefono.add(7277678);
        telefono.add(6687953);
        Profesor profe2=new Profesor("Profesora", telefono, new Direccion("La Laguna", "Trinidad", 30), "40000001A", "Ana", "Lopez Gonzalez", (Date) Date.valueOf("1990-12-04"));
        listaProfes.add(profe1);
        
        telefono.clear();
        telefono.add(6896574);
        telefono.add(6895478);
        telefono.add(6872365);
        Profesor profe3=new Profesor("Jef. Estudios", telefono, new Direccion("La Laguna", "Menceyes", 10), "40000002A", "Jorge", "Santana Gomez", (Date) Date.valueOf("2000-10-03"));
        listaProfes.add(profe1);
        
        telefono.clear();
        telefono.add(6985479);
        Profesor profe4=new Profesor("Profesora", telefono, new Direccion("Zaragoza", "Fer Catolica", 21), "40000003A", "Gloria", "Perez Casanova", (Date) Date.valueOf("2000-12-02"));
        listaProfes.add(profe1);
        
        telefono.clear();
        telefono.add(9874569);
        Profesor profe5=new Profesor("Jef. Departamento", telefono, new Direccion("Madird", "ACDC", 8), "40000004", "Paco", "Rodriguez Fernandez", (Date) Date.valueOf("1996-12-07"));
        listaProfes.add(profe1);
        
        telefono.clear();
        telefono.add(6986541);
        Profesor profe6=new Profesor("Director", telefono, new Direccion("Logroño", "Supernova", 5), "40000006", "Luisa", "Rodriguez Leon", (Date) Date.valueOf("1993-04-30"));
        listaProfes.add(profe1);
        //Creamos asignaturas
        List<Alumno> alumno = new ArrayList<>();
        ArrayList<Asignatura> listAsignaturas = new ArrayList<>();
        listAsignaturas.add(new Asignatura("BAE","Base de Datos",1,profe1, alumno));
        listAsignaturas.add(new Asignatura("ETS","Entornos de Desarrollo",1,profe3, alumno));
        listAsignaturas.add(new Asignatura("LND","Lenguaje de Marcas",1,profe2, alumno));
        listAsignaturas.add(new Asignatura("PRO","Programacion",1,profe4, alumno));
        listAsignaturas.add(new Asignatura("PGV","Programacion de Servicios y Procesos",2,profe1, alumno));
        listAsignaturas.add(new Asignatura("PGL","Programacion Multimedia y Dispositivos Moviles",2,profe3, alumno));
        listAsignaturas.add(new Asignatura("AED","Aceso a Datos",2,profe1, alumno));
        
        listAsignaturas.clear();
        alumno.add(new Alumno(telefono, new Direccion("La Laguna", "Trinidad", 30),listAsignaturas, "50000011B", "Lua", "Gonzalez Martinez", (Date) Date.valueOf("1990-12-04")));
        alumno.add(new Alumno(telefono, new Direccion("S/C Tenerife", "Supernova", 5),listAsignaturas, "50000022B", "Maria", "Martin Jimenez", (Date) Date.valueOf("1996-07-08")));
        alumno.add(new Alumno(telefono, new Direccion("S/C Tenerife", "Garachico", 68),listAsignaturas, "50000033B", "Antonio", "Rodriguez Perez", (Date) Date.valueOf("1994-12-01")));
        alumno.add(new Alumno(telefono, new Direccion("Malaga", "Avn. Principal", 12),listAsignaturas, "50000044B", "Sonia", "Muñoz Miguez", (Date) Date.valueOf("1999-12-21")));
        alumno.add(new Alumno(telefono, new Direccion("La Laguna", "Guia de Isora", 1),listAsignaturas, "50000055B", "Emir", "Hussein Azar", (Date) Date.valueOf("1990-01-20")));
        alumno.add(new Alumno(telefono, new Direccion("Malaga", "Mendez", 48),listAsignaturas, "50000066B", "Ana", "Martin Gonzalez", (Date) Date.valueOf("1982-11-30")));
        
        emf = Persistence.createEntityManagerFactory("src/db/matricula.odb");
        em = emf.createEntityManager();
        for (Profesor profe : listaProfes) {
            em.getTransaction().begin();
            em.persist(profe);
            em.getTransaction().commit();
        }
        em.close();
        emf.close();
        //---------------------
        emf = Persistence.createEntityManagerFactory("src/db/matricula.odb");
        em = emf.createEntityManager();
        for (Alumno alu : alumno) {
            em.getTransaction().begin();
            em.persist(alu);
            em.getTransaction().commit();
        }
        em.close();
        emf.close();
        //------------------
        emf = Persistence.createEntityManagerFactory("src/db/matricula.odb");
        em = emf.createEntityManager();
        for (Asignatura asig : listAsignaturas) {
            em.getTransaction().begin();
            em.persist(asig);
            em.getTransaction().commit();
        }
        em.close();
        emf.close();
//        emf = Persistence.createEntityManagerFactory("src/db/matricula.odb");
//        em = emf.createEntityManager();
//        List<Alumno> alumno = new ArrayList<>();
//        Asignatura AED = new Asignatura("PGD","Progrmacion Virtual",2,profe1,alumno );
//            em.getTransaction().begin();
//            em.persist(AED);
//            em.getTransaction().commit();
//        em.close();
//        emf.close();
    }


    
    
    
    
    
    
}
