package com.miuniversidad.mvc.Controlador;

import com.miuniversidad.mvc.DAO.DAOEstudiante;
import com.miuniversidad.mvc.Modelo.Estudiante;
import com.miuniversidad.mvc.Vista.VistaEstudiante;

public class ControladorEstudiante {
    private VistaEstudiante vista;
    private DAOEstudiante dao;

    public ControladorEstudiante(VistaEstudiante vista, DAOEstudiante dao) {
        this.vista = vista;
        this.dao = dao;

        this.vista.botonCargar.addActionListener(e -> cargarEstudiantes());
    }

    private void cargarEstudiantes() {
        try {
            var estudiantes = dao.listarEstudiantes();
            vista.areaTexto.setText("");
            for (Estudiante e : estudiantes) {
                vista.areaTexto.append(e.getEstudianteid() + " - " + e.getNombre() +" - " + e.getApellido() +" - " + e.getEmail() + " - " + e.getCursoId() + "\n");
            }
        } catch (Exception ex) {
            ex.printStackTrace();
            vista.areaTexto.setText("Error al cargar estudiantes.");
        }
    }
}
