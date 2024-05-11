package com.fcfm.backend.Utils;

import com.fcfm.backend.Repository.entity.Alumno;

import java.sql.Date;

public class AlumnoMapper {
    public static com.fcfm.backend.Model.Alumno alumnoEntityToAlumnoModel(Alumno alumno){
        com.fcfm.backend.Model.Alumno model = new com.fcfm.backend.Model.Alumno();
        model.setPrimernombre(alumno.getPrimernombre());
        model.setSegundonombre(alumno.getSegundonombre());
        model.setApellidopat(alumno.getApellidopat());
        model.setApellidomat(alumno.getApellidomat());
        model.setFechanac(alumno.getFechanac().toString());
        model.setCurp(alumno.getCurp());
        model.setEmail(alumno.getEmail());
        return model;
    }

    public static Alumno alumnoModelToAlumnoEntity(com.fcfm.backend.Model.Alumno alumno){
        Alumno entity = new com.fcfm.backend.Repository.entity.Alumno();
        entity.setPrimernombre(alumno.getPrimernombre());
        entity.setSegundonombre(alumno.getSegundonombre());
        entity.setApellidopat(alumno.getApellidopat());
        entity.setApellidomat(alumno.getApellidomat());
        entity.setFechanac(Date.valueOf(alumno.getFechanac()));
        entity.setCurp(alumno.getCurp());
        entity.setEmail(alumno.getEmail());
        return entity;
    }
}