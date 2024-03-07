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



    @GetMapping("/animales")
    public Map<String, Animal> obtenerAnimales() {
        String jsonString = "{\"saludo\": \"Hola, mundo!\"}";
        return jsonString;
    }
}
