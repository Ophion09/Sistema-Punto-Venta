/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

/**
 *
 * @author lv1013
 */
@Entity
public class Jugador implements Serializable {
/**
 * Atributos---------------------------------------------------------------
 */
    @Id
    @Column(name = "id_jugador")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nombre", nullable = false, length = 100)
    private String nombre;

    @Column(name = "email", nullable = true, length = 200)
    private String email;

    @OneToMany(cascade = CascadeType.ALL,
            mappedBy = "")
    private List<Videojuego> videojuegos;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "jugador")
    private List<RelacionJugadorLogro>logros;
    
    
/**
 * Constructores-----------------------------------------------------------
 */    
    public Jugador() {
    }

    public Jugador(String nombre, String email) {
        this.nombre = nombre;
        this.email = email;
    }

    public Jugador(String nombre, String email, List<Videojuego> videojuegos) {
        this.nombre = nombre;
        this.email = email;
        this.videojuegos = videojuegos;
    }

    public Jugador(Long id, String nombre, String email, List<Videojuego> videojuegos) {
        this.id = id;
        this.nombre = nombre;
        this.email = email;
        this.videojuegos = videojuegos;
    }

    

//Getters And Setters------------------------------------------------------    
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Videojuego> getVideojuegos() {
        return videojuegos;
    }

    public void setVideojuegos(List<Videojuego> videojuegos) {
        this.videojuegos = videojuegos;
    }
    
    

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Jugador)) {
            return false;
        }
        Jugador other = (Jugador) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "jugador{" + "id=" + id + ", nombre=" + nombre + ", email=" + email + '}';
    }

}
