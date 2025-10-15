package com.miuniversidad.mvc.DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.miuniversidad.mvc.Modelo.Profesor;
import com.miuniversidad.mvc.Util.ConexionBD;

public class DAOProfesor {
    public List<Profesor> listarProfesores() throws Exception {
        List<Profesor> lista = new ArrayList<>();
        try (Connection conexion = ConexionBD.obtenerConexion();
             Statement sentencia = conexion.createStatement();
             ResultSet rs = sentencia.executeQuery("SELECT profesorid, nombre, apellido, email, asignatura FROM profesores")) {

            while (rs.next()) {
                lista.add(new Profesor(rs.getInt("profesorid"), rs.getString("nombre"), rs.getString("apellido"),rs.getString("email"), rs.getString("asignatura")));
            }
        }
        return lista;
    }
}
