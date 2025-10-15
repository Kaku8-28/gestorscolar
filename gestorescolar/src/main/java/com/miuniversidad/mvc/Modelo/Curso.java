package com.miuniversidad.mvc.Modelo;


public class Curso {

    private int cursoid;
    private String nombre;
    private int profesorId;

    public Curso(int cursoid, String nombre, int profesorId) {
        this.cursoid = cursoid;
        this.nombre = nombre;
        this.profesorId = profesorId;
    }

    public int getCursoid() {
        return cursoid;
    }

    public void setCursoid(int cursoid) {
        this.cursoid = cursoid;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getProfesorId() {
        return profesorId;
    }

    public void setProfesorId(int profesorId) {
        this.profesorId = profesorId;
    }
}
