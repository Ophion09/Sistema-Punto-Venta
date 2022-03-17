package implementaciones;

import interfaces.IConexionBD;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * 
 * @author J.Fernando <josefer.hernandez@hotmail.com>
 */
public class ConexionBD implements IConexionBD{

    public EntityManager crearConexion() throws IllegalStateException {
    EntityManagerFactory emFactory = Persistence.createEntityManagerFactory("Videojuegos_228841PU");
        // EM = BD PERO EN JAVA
        EntityManager em = emFactory.createEntityManager();
        return em; 
    }

}
