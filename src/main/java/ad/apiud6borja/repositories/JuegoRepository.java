package ad.apiud6borja.repositories;

import ad.apiud6borja.models.Juego;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface JuegoRepository extends JpaRepository<Juego,Long> {
    @Query("SELECT j, COUNT(p.jugador) AS numJugadores " +
            "FROM juegos j JOIN puntuaciones p ON j.id = p.juego.id " +
            "GROUP BY j.id ORDER BY COUNT(p.id_puntuacion) DESC")
    List<Object[]> findJuegosMasJugados();

}
