package com.miuniversidad.mvc.DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.miuniversidad.mvc.Modelo.Estudiante;
import com.miuniversidad.mvc.Util.ConexionBD;

public class DAOEstudiante {
    public List<Estudiante> listarEstudiantes() throws Exception {
        List<Estudiante> lista = new ArrayList<>();
        try (Connection conexion = ConexionBD.obtenerConexion();
             Statement sentencia = conexion.createStatement();
             ResultSet rs = sentencia.executeQuery("SELECT estudianteid, nombre, email, apellido, cursoid FROM estudiantes")) {

            while (rs.next()) {
                lista.add(new Estudiante(rs.getInt("estudianteid"), rs.getString("nombre"), rs.getString("apellido"), rs.getString("email"), rs.getInt("cursoId")));
            }
        }
        return lista;
    }
}
