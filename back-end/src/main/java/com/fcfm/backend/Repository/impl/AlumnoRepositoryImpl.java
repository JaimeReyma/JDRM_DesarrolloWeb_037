package com.fcfm.backend.Repository.impl;

import com.fcfm.backend.Repository.IAlumnoRepository;
import com.fcfm.backend.Repository.entity.Alumno;
import jakarta.persistence.Entity;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

@Repository
public class AlumnoRepositoryImpl implements IAlumnoRepository {

    @PersistenceContext
    EntityManager em;

    @Transactional
    public void insertar(Alumno alumno){
        em.persist(alumno);
    }

    @Override
    public Alumno getAlumnoById(Long id){
        return em.find(Alumno.class, id);
    }

    @Transactional
    public void actualizar(Alumno alumno){
        em.merge(alumno);
    }

    @Transactional
    public void eliminar(Long id){
        Alumno alumno = getAlumnoById(id);
        if (alumno != null) {
            em.remove(alumno);
        }
    }
}
