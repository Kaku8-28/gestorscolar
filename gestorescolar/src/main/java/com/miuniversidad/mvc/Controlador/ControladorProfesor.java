package com.miuniversidad.mvc.Controlador;

import com.miuniversidad.mvc.DAO.DAOProfesor;
import com.miuniversidad.mvc.Modelo.Profesor;
import com.miuniversidad.mvc.Vista.VistaProfesor;

public class ControladorProfesor {
    private VistaProfesor vista;
    private DAOProfesor dao;

    public ControladorProfesor(VistaProfesor vista, DAOProfesor dao) {
        this.vista = vista;
        this.dao = dao;

        this.vista.botonCargar.addActionListener(e -> cargarProfesores());
    }

    private void cargarProfesores() {
        try {
            var profesores = dao.listarProfesores();
            vista.areaTexto.setText("");
            for (Profesor p : profesores) {
                vista.areaTexto.append(p.getProfesorid() + " - " + p.getNombre() + " - " + p.getApellido() + " - " + p.getEmail() + " - " + p.getAsignatura() + "\n");
            }
        } catch (Exception ex) {
            ex.printStackTrace();
            vista.areaTexto.setText("Error al cargar profesores.");
        }
    }
}

