
package com.miuniversidad.mvc.Modelo;

public class Estudiante {
    private int estudianteid;
    private String nombre;
    private String apellido;
    private String email;
    private int cursoId;

    public Estudiante(int estudianteid, String nombre, String apellido, String email, int cursoId) {
        this.estudianteid = estudianteid;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.cursoId = cursoId;
    }

    public int getEstudianteid() {
        return estudianteid;
    }
    public void setEstudianteid(int estudianteid) {
        this.estudianteid = estudianteid;
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

    public double getCursoId() {
        return cursoId;
    }
    public void setCursoId(int cursoId) {
        this.cursoId = cursoId;
    }
}
