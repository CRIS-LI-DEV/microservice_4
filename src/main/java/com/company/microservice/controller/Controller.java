package com.company.microservice.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;


@RestController
public class Controller {

private Map<String, Animal> datosAnimales = new HashMap<>();
    
    @GetMapping("/")
    public ResponseEntity<String> get() {
        return ResponseEntity.ok("Hello from Railway + Spring!");
    }

    @GetMapping("/hola")
    public ResponseEntity<String> getHola() {
        return ResponseEntity.ok("hola");
    }


       private void initDatosAnimales() {
        // Aquí asignas los datos generados a los objetos de la clase Animal y los almacenas en datosAnimales
        // Suponiendo que tienes los datos en un HashMap llamado datos_animales
        Random random = new Random();
        for (Map.Entry<String, Map<String, Object>> entry : datos_animales.entrySet()) {
            String nombre = entry.getKey();
            Map<String, Object> atributos = entry.getValue();
            Animal animal = new Animal();
            animal.setNombre(nombre);
            animal.setHabitat((String) atributos.get("habitat"));
            animal.setDieta((String) atributos.get("dieta"));
            animal.setLongevidad((int) atributos.get("longevidad"));
            animal.setPromedioVida((int) atributos.get("promedio_vida"));
            animal.setEstado((String) atributos.get("estado"));
            datosAnimales.put(nombre, animal);
        }
    }

     @GetMapping("/animales")
    public Map<String, Animal> obtenerAnimales() {
        return datosAnimales;
    }
}
