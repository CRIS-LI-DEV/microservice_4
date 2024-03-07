import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.ResponseEntity;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Animal {
    private String nombre;
    private String habitat;
    private String dieta;
    private int longevidad;
    private int promedioVida;
    private String estado;

    // Constructor
    public Animal(String nombre, String habitat, String dieta, int longevidad, int promedioVida, String estado) {
        this.nombre = nombre;
        this.habitat = habitat;
        this.dieta = dieta;
        this.longevidad = longevidad;
        this.promedioVida = promedioVida;
        this.estado = estado;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public String getDieta() {
        return dieta;
    }

    public void setDieta(String dieta) {
        this.dieta = dieta;
    }

    public int getLongevidad() {
        return longevidad;
    }

    public void setLongevidad(int longevidad) {
        this.longevidad = longevidad;
    }

    public int getPromedioVida() {
        return promedioVida;
    }

    public void setPromedioVida(int promedioVida) {
        this.promedioVida = promedioVida;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}

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
