package utp.misiontic2021.reto4.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import utp.misiontic2021.reto4.model.vo.Requerimiento_1;
import utp.misiontic2021.reto4.util.JDBCutilities;

//CLASE DONDE SE CREA LA INTERACCION CON LA BASE DE DATOS

public class RequerimientoDao_1 {
        
    // METODO PARA LEER LOS DATOS
    public ArrayList<Requerimiento_1> requerimiento1() throws SQLException{
        // Variable para cargar los resultados
        ArrayList<Requerimiento_1> respuesta = new ArrayList<Requerimiento_1>();
        // crear conexion a BD por medio del metodo creado en clase JDBCutilities
        Connection conx = JDBCutilities.getConection();
        try {
            // escribir la consulta 
            String sql = "SELECT C.Fecha, C.Proveedor, C.ID_Compra,C.Pagado FROM Compra C ORDER BY C.ID_Compra DESC LIMIT 20";
            //+ "order by C.ID_Compra desc" +
            //"limit 20";

            // preparar la consulta 
            PreparedStatement stmt = conx.prepareStatement(sql);
            // ejecutar la consulta
            ResultSet rs = stmt.executeQuery();
            // recorrer el resultado de la consulta y lo añade al arreglo de respuestas
            while (rs.next()){
                //crea el objeto requerimiento 1 con los datos obtenidos en la consulta a la BD, 
                Requerimiento_1 itemRespuesta = new Requerimiento_1(rs.getString("Fecha"), rs.getString("Proveedor"),rs.getInt("ID_Compra"),rs.getString("Pagado"));
                // agrega el objeto al arreglo de respuesta
                respuesta.add(itemRespuesta);
            }

            rs.close();
            stmt.close();

        } catch (Exception e) {
            System.err.println("--------------------\nError en consulta (DAO) requerimiento 1 : " + e);
        } finally {
            if (conx != null){
                conx.close();
            }
        }
        return respuesta;
    }
}
