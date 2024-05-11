package com.fcfm.backend.Repository.entity;

import jakarta.persistence.*;

import java.sql.Date;

@Entity
public class Alumno {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "alumno_id", nullable = false)
    private Long alumno_id;

    private String primernombre;
    private String segundonombre;
    private String apellidopat;
    private String apellidomat;
    private Date fechanac;
    private String curp;
    private String email;


    public Alumno(String primernombre, String segundonombre, String apellidopat, String apellidomat, Date fechanac, String curp, String email){
        this.primernombre = primernombre;
        this.segundonombre = segundonombre;
        this.apellidopat = apellidopat;
        this.apellidomat = apellidomat;
        this.fechanac = fechanac;
        this.curp = curp;
        this.email = email;

    }

    public Alumno(){

    }

    public Long getAlumno_id(){
        return alumno_id;
    }

    public String getPrimernombre(){
        return primernombre;
    }
    public void setPrimernombre(String primernombre){
        this.primernombre = primernombre;
    }

    public String getSegundonombre(){
        return segundonombre;
    }
    public void setSegundonombre(String segundonombre){
        this.segundonombre = segundonombre;
    }

    public String getApellidopat(){
        return apellidopat;
    }
    public void setApellidopat(String apellidopat){
        this.apellidopat = apellidopat;
    }

    public String getApellidomat(){
        return apellidomat;
    }
    public void setApellidomat(String apellidomat){
        this.apellidomat = apellidomat;
    }

    public Date getFechanac(){
        return fechanac;
    }
    public void setFechanac(Date fechanac){
        this.fechanac = fechanac;
    }

    public String getCurp(){
        return curp;
    }
    public void setCurp(String curp){
        this.curp = curp;
    }

    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email = email;
    }

}