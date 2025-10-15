package com.miuniversidad.mvc.DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.miuniversidad.mvc.Modelo.Curso;
import com.miuniversidad.mvc.Util.ConexionBD;

public class DAOCurso {
    public List<Curso> listarCursos() throws Exception {
        List<Curso> lista = new ArrayList<>();
        try (Connection conexion = ConexionBD.obtenerConexion();
             Statement sentencia = conexion.createStatement();
             ResultSet rs = sentencia.executeQuery("SELECT cursoid, nombre, profesorid FROM cursos")) {

            while (rs.next()) {
                lista.add(new Curso(rs.getInt("cursoid"), rs.getString("nombre"), rs.getInt("profesorid")));
            }
        }
        return lista;
    }
}
