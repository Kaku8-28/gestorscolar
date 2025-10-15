package com.miuniversidad.mvc.Controlador;

import com.miuniversidad.mvc.DAO.DAOCurso;
import com.miuniversidad.mvc.Modelo.Curso;
import com.miuniversidad.mvc.Vista.VistaCurso;

public class ControladorCurso {
    private VistaCurso vista;
    private DAOCurso dao;

    public ControladorCurso(VistaCurso vista, DAOCurso dao) {
        this.vista = vista;
        this.dao = dao;

        this.vista.botonCargar.addActionListener(e -> cargarCursos());
    }

    private void cargarCursos() {
        try {
            var cursos = dao.listarCursos();
            vista.areaTexto.setText("");
            for (Curso c : cursos) {
                vista.areaTexto.append(c.getCursoid() + " - " + c.getNombre() + " - " + c.getProfesorId() + "\n");
            }
        } catch (Exception ex) {
            ex.printStackTrace();
            vista.areaTexto.setText("Error al cargar cursos.");
        }
    }
}
