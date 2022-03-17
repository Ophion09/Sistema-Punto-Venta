
package entidades;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 *
 * @author lv1013
 */
@Entity
public class Videojuego implements Serializable {

    /**
     * Atributos--------------------------------------------------------------------
     */
    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "id_videojuego")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "nombre", nullable = false, length = 100)
    private String nombre;

    @Column(name = "desarrolladora", nullable = false, length = 200)
    private String desarrolladora;

    @ManyToOne(cascade = CascadeType.ALL)
    //Videojuego no existe sin jugador "false"
    @JoinColumn(name = "id_jugador", nullable = false)
    private Jugador jugador;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "videojuego")
    private List<Logro>logros;
    
    

    /**
     * Constructores----------------------------------------------------------------
     */
    public Videojuego() {
    }

    public Videojuego(String nombre, String desarrolladora) {
        this.nombre = nombre;
        this.desarrolladora = desarrolladora;
    }

    public Videojuego(String nombre, String desarrolladora, Jugador jugador) {
        this.nombre = nombre;
        this.desarrolladora = desarrolladora;
        this.jugador = jugador;
    }

    public Videojuego(Long id, String nombre, String desarrolladora, Jugador jugador) {
        this.id = id;
        this.nombre = nombre;
        this.desarrolladora = desarrolladora;
        this.jugador = jugador;
    }

//Getters And Setters------------------------------------------------------
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDesarrolladora() {
        return desarrolladora;
    }

    public void setDesarrolladora(String desarrolladora) {
        this.desarrolladora = desarrolladora;
    }

    public Jugador getJugador() {
        return jugador;
    }

    public void setJugador(Jugador jugador) {
        this.jugador = jugador;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Logro> getLogros() {
        return logros;
    }

    public void setLogros(List<Logro> logros) {
        this.logros = logros;
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
        if (!(object instanceof Videojuego)) {
            return false;
        }
        Videojuego other = (Videojuego) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Videojuego{" + "id=" + id + ", nombre=" + nombre + ", desarrolladora=" + desarrolladora + ", jugador=" + jugador + '}';
    }

}
