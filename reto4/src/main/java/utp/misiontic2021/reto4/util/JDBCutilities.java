package utp.misiontic2021.reto4.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

// CLASE USADA PARA CREAR LA CONEXION A LA BASE DE DATOS
public class JDBCutilities {
    private static final String DATABASE_LOCATION = "ProyectosConstruccion.db";

    // metodo para crear la conexion a la base de datos
    public static Connection getConection () throws SQLException{
        String url = "jdbc:sqlite:"+ DATABASE_LOCATION;
        return DriverManager.getConnection(url);
    }
}
