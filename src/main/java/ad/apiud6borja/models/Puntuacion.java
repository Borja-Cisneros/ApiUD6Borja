package ad.apiud6borja.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Puntuacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_puntuacion;
    private Long puntuacion;
    private String jugador;

    private Long id_juego;

    public void setId_puntuacion(Long idPuntuacion) {
        this.id_puntuacion = idPuntuacion;
    }

    public Long getId_puntuacion() {
        return id_puntuacion;
    }
}
