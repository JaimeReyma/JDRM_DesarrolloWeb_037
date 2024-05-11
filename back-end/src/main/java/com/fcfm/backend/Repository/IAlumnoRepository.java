package com.fcfm.backend.Repository;

import com.fcfm.backend.Repository.entity.Alumno;

import java.util.List;

public interface IAlumnoRepository {
    void insertar(Alumno alumno);
    Alumno getAlumnoById(Long id);
}
