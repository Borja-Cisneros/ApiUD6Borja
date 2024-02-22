package ad.apiud6borja.repositories;

import ad.apiud6borja.models.Juego;
import ad.apiud6borja.models.Puntuacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PuntuacionRepository extends JpaRepository<Puntuacion,Long> {
}
