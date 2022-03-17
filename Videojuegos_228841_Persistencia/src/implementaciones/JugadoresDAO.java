package implementaciones;

import entidades.Jugador;
import interfaces.IConexionBD;
import interfaces.IJugadoresDAO;
import java.util.List;

/**
 * 
 * @author J.Fernando <josefer.hernandez@hotmail.com>
 */
public class JugadoresDAO implements IJugadoresDAO {

    private final IConexionBD conexion;
    
    public JugadoresDAO(IConexionBD conexion) {
        this.conexion = conexion;
    }

    
    @Override
    public boolean agregar(Jugador jugador) {
        
    }

    @Override
    public Jugador consultar(Long idJugador) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Jugador> consultarTodos() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
