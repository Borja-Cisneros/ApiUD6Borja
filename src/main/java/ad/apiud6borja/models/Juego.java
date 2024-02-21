package ad.apiud6borja.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Juego {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_juego;
    String nombre;

    public Juego(String nombre) {
        this.nombre = nombre;
    }

    public Juego() {

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setId_juego(Long idJuego) {
        this.id_juego = idJuego;
    }

    public Long getId_juego() {
        return id_juego;
    }
}
