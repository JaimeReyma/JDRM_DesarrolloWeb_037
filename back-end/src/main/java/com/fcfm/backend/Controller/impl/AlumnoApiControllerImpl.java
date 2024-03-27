package com.fcfm.backend.Controller.impl;

import com.fcfm.backend.Controller.IAlumnoApiController;
import com.fcfm.backend.Model.Alumno;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AlumnoApiControllerImpl implements IAlumnoApiController {
    @Override
    public ResponseEntity<String> getName() {
        return ResponseEntity.ok().body("Jaime Daniel Reyes Martinez");
    }

    @Override
    public ResponseEntity<String> getName(@PathVariable String nombreAlumno) {
        return ResponseEntity.ok().body(nombreAlumno);
    }

    @Override
    public ResponseEntity<Alumno> createAlumno(@RequestBody Alumno alumnoNuevo) {
        return ResponseEntity.ok().body(alumnoNuevo);
    }


    /*@Override
    public ResponseEntity<Alumno> createAlumno(@RequestBody Alumno alumnoNuevo) {
        return ResponseEntity.ok().body(alumnoDummy());
    }*/

    private Alumno alumnoDummy(){
        Alumno alumnoDummy = new Alumno();

        return alumnoDummy;
    }
}
