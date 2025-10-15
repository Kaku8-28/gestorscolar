package com.miuniversidad.mvc.Modelo;

public class Profesor {
    private int profesorid;
    private String nombre;
    private String apellido;
    private String email;
    private String asignatura;

    public Profesor(int profesorid, String nombre, String apellido, String email, String asignatura) {
        this.profesorid = profesorid;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.asignatura = asignatura;
    }

    public int getProfesorid() {
        return profesorid;
    }
    public void setProfesorid(int profesorid) {
        this.profesorid = profesorid;
    }


    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public String getApellido() {
        return apellido;
    }  
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }
}
