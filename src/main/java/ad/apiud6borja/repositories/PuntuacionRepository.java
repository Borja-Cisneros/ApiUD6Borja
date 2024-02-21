package ad.apiud6borja.repositories;

import ad.apiud6borja.models.Juego;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PuntuacionRepository extends JpaRepository<Juego,Long> {
}
