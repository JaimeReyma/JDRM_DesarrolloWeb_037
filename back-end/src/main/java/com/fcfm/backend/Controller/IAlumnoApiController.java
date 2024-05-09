package com.fcfm.backend.Controller;

import com.fcfm.backend.Model.Alumno;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/alumno")
public interface IAlumnoApiController {

    @PostMapping("/")
    ResponseEntity<Alumno> createAlumno(@RequestBody Alumno alumnoNuevo);

    @GetMapping("/nombre/{nombreAlumno}")
    ResponseEntity<String> getName(@PathVariable String nombreAlumno);

    @GetMapping("/id/{idAlumno}")
    ResponseEntity<Alumno> getAlumnoById(@PathVariable int idAlumno);

    @GetMapping("/")
    ResponseEntity<List<Alumno>> getAlumnoList();

    @PutMapping("/id/{idAlumno}")
    ResponseEntity<Alumno> updateAlumno(@PathVariable int idAlumno, @RequestBody Alumno alumnoActualizado);

    @DeleteMapping("/id/{idAlumno}")
    ResponseEntity<Void> deleteAlumno(@PathVariable int idAlumno);
}



