import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.ResponseEntity;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

@RestController
public class Controller {

    private Map<String, Animal> datosAnimales = new HashMap<>();
    
    // Constructor
    public Controller() {
        initDatosAnimales();
    }

    @GetMapping("/")
    public ResponseEntity<String> get() {
        return ResponseEntity.ok("Hello from Railway + Spring!");
    }

    @GetMapping("/hola")
    public ResponseEntity<String> getHola() {
        return ResponseEntity.ok("hola");
    }

    private void initDatosAnimales() {
        Random random = new Random();
        // Agregando algunos datos de animales de ejemplo
        datosAnimales.put("caballo", new Animal("caballo", "pradera", "herbívoro", random.nextInt(50), random.nextInt(30), "no amenazado"));
        datosAnimales.put("león", new Animal("león", "selva", "carnívoro", random.nextInt(50), random.nextInt(30), "en peligro"));
        // Puedes agregar más animales aquí según tus datos
    }

    @GetMapping("/animales")
    public Map<String, Animal> obtenerAnimales() {
        return datosAnimales;
    }
}
