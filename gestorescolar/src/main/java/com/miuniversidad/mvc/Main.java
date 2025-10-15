package com.miuniversidad.mvc;

import javax.swing.SwingUtilities;

import com.miuniversidad.mvc.Controlador.ControladorCurso;
import com.miuniversidad.mvc.Controlador.ControladorEstudiante;
import com.miuniversidad.mvc.Controlador.ControladorProfesor;
import com.miuniversidad.mvc.DAO.DAOCurso;
import com.miuniversidad.mvc.DAO.DAOEstudiante;
import com.miuniversidad.mvc.DAO.DAOProfesor;
import com.miuniversidad.mvc.Util.ConexionBD;
import com.miuniversidad.mvc.Vista.VistaCurso;
import com.miuniversidad.mvc.Vista.VistaEstudiante;
import com.miuniversidad.mvc.Vista.VistaProfesor;

public class Main {
    public static void main(String[] args) {
        try {
            ConexionBD.inicializar();
        } catch (Exception e) {
            e.printStackTrace();
            return;
        }

        SwingUtilities.invokeLater(() -> {
            // Estudiantes
            VistaEstudiante vistaEstudiantes = new VistaEstudiante();
            DAOEstudiante daoEstudiantes = new DAOEstudiante();
            new ControladorEstudiante(vistaEstudiantes, daoEstudiantes);
            vistaEstudiantes.setVisible(true);

            // Profesores
            VistaProfesor vistaProfesores = new VistaProfesor();
            DAOProfesor daoProfesores = new DAOProfesor();
            new ControladorProfesor(vistaProfesores, daoProfesores);
            vistaProfesores.setVisible(true);

            // Cursos
            VistaCurso vistaCursos = new VistaCurso();
            DAOCurso daoCursos = new DAOCurso();
            new ControladorCurso(vistaCursos, daoCursos);
            vistaCursos.setVisible(true);
        });
    }
}
