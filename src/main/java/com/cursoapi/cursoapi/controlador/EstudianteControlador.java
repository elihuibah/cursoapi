package com.cursoapi.cursoapi.controlador;

import com.cursoapi.cursoapi.model.Estudiante;
import com.cursoapi.cursoapi.servicio.EstudianteServicio;
import org.apache.coyote.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/estudiantes")
public class EstudianteControlador {

    private final EstudianteServicio estudianteServicio;

    public EstudianteControlador(EstudianteServicio estudianteServicio) {
        this.estudianteServicio = estudianteServicio;
    }

    @GetMapping
    public ResponseEntity<List<Estudiante>> getEstudiantes() {
        return new ResponseEntity<>(estudianteServicio.buscarTodos(), HttpStatus.OK); //ResponseEntity es un objeto que representa la respuesta a HTTP
    }

    @PostMapping
    public ResponseEntity<String> postEstudiante(@RequestBody Estudiante estudiante) {
        return new ResponseEntity<>("Hola nuevo estudiante: " + estudiante.getNombre(), HttpStatus.CREATED);
    }

    @DeleteMapping("{matricula}")
    public String deleteEstudiante(@PathVariable String matricula) {
        return "Hola estudiante eliminado";
    }

    @PutMapping("{matricula}")
    public String updateEstudiante(@PathVariable String matricula , @RequestBody Estudiante estudiante) {
        return "Hola estudiante actualizado";
    }


}
