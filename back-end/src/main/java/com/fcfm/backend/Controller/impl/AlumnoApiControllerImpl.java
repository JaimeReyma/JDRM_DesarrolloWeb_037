package com.fcfm.backend.Controller.impl;

import com.fcfm.backend.Controller.IAlumnoApiController;
import com.fcfm.backend.Model.Alumno;
import com.fcfm.backend.Repository.IAlumnoRepository;
import com.fcfm.backend.Service.IAlumnoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AlumnoApiControllerImpl implements IAlumnoApiController {
    private IAlumnoService alumnoService;
    private IAlumnoRepository alumnoRepository;

    @Autowired
    AlumnoApiControllerImpl(IAlumnoService alumnoService){
        this.alumnoService = alumnoService;
    }

    @Override
    public ResponseEntity<String> getName(@PathVariable String nombreAlumno) {
        return ResponseEntity.ok().body(nombreAlumno);
    }

    @Override
    public ResponseEntity<Alumno> createAlumno(@RequestBody Alumno alumnoNuevo) {
        alumnoService.createAlumno(alumnoNuevo);
        return ResponseEntity.ok().body(alumnoNuevo);
    }

    @Override
    public ResponseEntity<List<Alumno>> getAlumnoList() {
        return ResponseEntity.ok().body(alumnoService.getAlumnoList());
    }

    @Override
    public ResponseEntity<Alumno> getAlumnoById(@PathVariable int idAlumno) {
        return ResponseEntity.ok().body(alumnoService.getAlumnoById(idAlumno));
    }

    @Override
    public ResponseEntity<Alumno> updateAlumno(@PathVariable int idAlumno, @RequestBody Alumno alumnoActualizado) {
        alumnoService.updateAlumno(idAlumno, alumnoActualizado);
        return ResponseEntity.ok().body(alumnoActualizado);
    }

    @Override
    public ResponseEntity<Void> deleteAlumno(@PathVariable int idAlumno) {
        alumnoService.deleteAlumno(idAlumno);
        return ResponseEntity.ok().build();
    }
}