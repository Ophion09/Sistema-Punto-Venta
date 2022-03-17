package interfaces;

import entidades.Jugador;
import java.util.List;
/**
 *
 * @author J.Fernando <josefer.hernandez@hotmail.com>
 */
public interface IJugadoresDAO {
    public boolean agregar(Jugador jugador);
    public Jugador consultar(Long idJugador);
    public List<Jugador> consultarTodos();
}
