/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package videojuego;

import entidades.Jugador;
import entidades.Logro;
import entidades.Videojuego;
import java.util.Arrays;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author lv1013
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //Jugador jugador = new Jugador("John Wick", "john.wick@gmail.com");
        //Jugador jugador2 = new Jugador("Don gatp", "don.gato@gmail.com");
        //Jugador jugador3 = new Jugador("Jacinto", "jacinto@gmail.com");
        EntityManagerFactory emFactory = Persistence.createEntityManagerFactory("Videojuegos_228841PU");
        
        EntityManager em = emFactory.createEntityManager();
        
        em.getTransaction().begin();
        
        Jugador jugador = em.find(Jugador.class, 1L);
        Logro logro1 = em.find(Logro.class,1L);
        Logro logro2 = em.find(Logro.class,2L);
        //Relacion
        
        
        //Opción 2
/**        if(videojuego.getLogros() == null || videojuego.getLogros().isEmpty()){
            videojuego.setLogros(Arrays.asList(logro1, logro2));
        }else{//Opción 3 añadir elementos a una lista existentes
            videojuego.getLogros().add(logro1);
            videojuego.getLogros().add(logro2);
        }
        em.persista*/
    }
}
        /**Jugador jugador = em.find(Jugador.class, 5L);
        if (jugador != null) {
            System.out.println("jugador");
            for (Videojuego videojuego: jugador.getVideojuegos()){
            System.out.println(videojuego);
        }
            
        }/*
/**
//        em.persist(jugador2);
//        em.persist(jugador3);
//        Jugador jugador = new Jugador("Mario", "mamario@gmail.com");
//        Videojuego videojuego1 = new Videojuego("Mario Party", "Nintendo", jugador);
//        jugador.setVideojuegos(Arrays.asList(videojuego1));
//        em.persist(jugador);
        em.getTransaction().commit();
    }
    
}*/
