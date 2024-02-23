package ad.apiud6borja.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;

@Entity(name = "juegos")
public class Juego {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank(message = "Hay que ponerle un nombre digo yo, magí")
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

    public void setId(Long idJuego) {
        this.id = idJuego;
    }

    public Long getId() {
        return id;
    }
}
