package com.fcfm.backend.Controller;

import com.fcfm.backend.Model.Alumno;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/alumno")
public interface IAlumnoApiController {
    @GetMapping("/")
    ResponseEntity<String> getName();

    @GetMapping("/{nombreAlumno}")
    ResponseEntity<String> getName(@PathVariable String nombreAlumno);

    @PostMapping("/")
    ResponseEntity<Alumno> createAlumno(@RequestBody Alumno alumnoNuevo);
}
