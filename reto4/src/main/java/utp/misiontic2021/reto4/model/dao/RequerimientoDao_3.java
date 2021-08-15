package utp.misiontic2021.reto4.model.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import utp.misiontic2021.reto4.model.vo.Requerimiento_3;
import utp.misiontic2021.reto4.util.JDBCutilities;

public class RequerimientoDao_3 {
    // METODO PARA LEER LOS DATOS
    public ArrayList<Requerimiento_3> requerimiento3() throws SQLException{
        // Variable para cargar los resultados
        ArrayList<Requerimiento_3> respuesta = new ArrayList<Requerimiento_3>();
        // crear conexion a BD por medio del metodo creado en clase JDBCutilities
        Connection conx = JDBCutilities.getConection();
        try {
            // escribir la consulta 
            String sql = "SELECT (substr(lider.Nombre,1,3)||substr(lider.Primer_Apellido,1,3)||substr(lider.Segundo_Apellido,1,3)) AS 'Abrev.' FROM Lider";

            // preparar la consulta 
            PreparedStatement stmt = conx.prepareStatement(sql);
            // ejecutar la consulta
            ResultSet rs = stmt.executeQuery();
            // recorrer el resultado de la consulta y lo añade al arreglo de respuestas
            while (rs.next()){
                //crea el objeto requerimiento 1 con los datos obtenidos en la consulta a la BD, 
                Requerimiento_3 itemRespuesta = new Requerimiento_3(rs.getString("Abrev."));
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
