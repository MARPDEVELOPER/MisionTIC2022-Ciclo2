package utp.misiontic2021.reto4.model.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import utp.misiontic2021.reto4.model.vo.Requerimiento_2;
import utp.misiontic2021.reto4.util.JDBCutilities;

public class RequerimientoDao_2 {
 
    // METODO PARA LEER LOS DATOS
    public ArrayList<Requerimiento_2> requerimiento2() throws SQLException{
        // Variable para cargar los resultados
        ArrayList<Requerimiento_2> respuesta = new ArrayList<Requerimiento_2>();
        // crear conexion a BD por medio del metodo creado en clase JDBCutilities
        Connection conx = JDBCutilities.getConection();
        try {
            // escribir la consulta 
            String sql = "SELECT p.Fecha_Inicio, p.Ciudad, p.Constructora, " +
            "l.Nombre || ' ' || l.Segundo_Apellido AS 'nombreLider', " +
            "t.Codigo_Tipo, t.Estrato " +
            "FROM Proyecto p INNER JOIN Lider l ON p.ID_Lider = l.ID_Lider " +
            "INNER JOIN Tipo t ON p.ID_Tipo = t.ID_Tipo " + 
            "WHERE p.Fecha_Inicio >= '2021-01-01' " +
            "AND p.Fecha_Inicio <= '2021-05-30' " +
            "AND p.Ciudad = 'Armenia' ";

            // preparar la consulta 
            PreparedStatement stmt = conx.prepareStatement(sql);
            // ejecutar la consulta
            ResultSet rs = stmt.executeQuery();
            // recorrer el resultado de la consulta y lo añade al arreglo de respuestas
            while (rs.next()){
                //crea el objeto requerimiento 1 con los datos obtenidos en la consulta a la BD, 
                Requerimiento_2 itemRespuesta = new Requerimiento_2(rs.getString("Fecha_Inicio"), rs.getString("Ciudad"),rs.getString("Constructora"),rs.getString("nombreLider"),rs.getInt("Codigo_Tipo"),rs.getInt("Estrato"));
                // agrega el objeto al arreglo de respuesta
                respuesta.add(itemRespuesta);
            }

            rs.close();
            stmt.close();

        } catch (Exception e) {
            System.err.println("--------------------\nError en consulta (DAO) requerimiento 2 : " + e);
        } finally {
            if (conx != null){
                conx.close();
            }
        }
        return respuesta;
    }
}
