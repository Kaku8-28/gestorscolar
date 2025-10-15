package com.miuniversidad.mvc.Util;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class ConexionBD {
    private static String url;
    private static String usuario;
    private static String clave;

    public static void inicializar() throws Exception {
        Properties prop = new Properties();
        try (InputStream is = ConexionBD.class.getClassLoader().getResourceAsStream("config.properties")) {
            if (is == null) {
                throw new Exception("Archivo config.properties no encontrado en resources");
            }
            prop.load(is);
        }

        String driver = prop.getProperty("db.driver");
        url = prop.getProperty("db.url");
        usuario = prop.getProperty("db.user");
        clave = prop.getProperty("db.password");

        if (driver != null && !driver.isEmpty()) {
            Class.forName(driver);
        }
    }

    public static Connection obtenerConexion() throws Exception {
        return DriverManager.getConnection(url, usuario, clave);
    }
}

