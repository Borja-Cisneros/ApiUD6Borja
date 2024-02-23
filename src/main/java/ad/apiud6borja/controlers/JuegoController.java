package ad.apiud6borja.controlers;

import ad.apiud6borja.models.Juego;
import ad.apiud6borja.repositories.JuegoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin
@RestController
@RequestMapping("/api/juego")
public class JuegoController {
    @Autowired
    private JuegoRepository juegoRepository;

    // Todas las juegos
    @GetMapping
    public List<Juego> obtenerJuegos() {
        return juegoRepository.findAll();
    }

    // Obtener una juego por id

    @GetMapping("/{id}")
    public Juego obtenerJuegoID(@PathVariable Long id) {
        return juegoRepository.findById(id).orElseThrow(() -> new RuntimeException("Juego no encontrada"));
    }

    @GetMapping("/masjugados")
    public List<Juego> getJuegosMasJugados() {
        return juegoRepository.findJuegosMasJugados();
    }

    // Alta juego
    @PostMapping
    public Juego crearJuego(@RequestBody Juego juego) {
        return juegoRepository.save(juego);
    }

    // Actualizar juego

    @PutMapping("/{id}")
    public Juego actualizarJuego(@PathVariable Long id, @RequestBody Juego juego) {
        return juegoRepository.findById(id).map(juegoTmp -> {
            juegoTmp.setNombre(juego.getNombre());
            return juegoRepository.save(juegoTmp);
        }).orElseThrow(() -> new RuntimeException("Juego no encontrado al actualizar, mano"));
    }

    // Borar juego
    @DeleteMapping("/{id}")
    public void eliminarJuego(@PathVariable Long id) {
        juegoRepository.deleteById(id);
    }

}
