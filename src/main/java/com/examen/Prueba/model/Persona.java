package com.examen.Prueba.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;


@Entity
public class Persona {

    @Id
    private int id;
    private String nombre;
    private String apellidos;

    public Persona(){

    }

    public Persona(int id, String nombre, String apellidos) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
}
