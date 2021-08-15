package utp.misiontic2021.reto4.controller;
import java.sql.SQLException;
import java.util.ArrayList;
import utp.misiontic2021.reto4.model.dao.RequerimientoDao_1;
import utp.misiontic2021.reto4.model.dao.RequerimientoDao_2;
import utp.misiontic2021.reto4.model.dao.RequerimientoDao_3;
import utp.misiontic2021.reto4.model.vo.Requerimiento_1;
import utp.misiontic2021.reto4.model.vo.Requerimiento_2;
import utp.misiontic2021.reto4.model.vo.Requerimiento_3;
// CLASE UTILIZADA PARA LLAMAR LOS METODOS, CON INTERACION A LA BASE DE DATOS
public class ControllerRequerimientos {
    // atributos
    public final RequerimientoDao_1 requerimientoDao_1 = new RequerimientoDao_1();
    public final RequerimientoDao_2 requerimientoDao_2 = new RequerimientoDao_2();
    public final RequerimientoDao_3 requerimientoDao_3 = new RequerimientoDao_3();
    //metodos consulta
    public ArrayList<Requerimiento_1> consultaRequerimiento1() throws SQLException {
        return this.requerimientoDao_1.requerimiento1();
    }

    public ArrayList<Requerimiento_2> consultaRequerimiento2() throws SQLException {
        return this.requerimientoDao_2.requerimiento2();
    }

    public ArrayList<Requerimiento_3> consultaRequerimiento3() throws SQLException {
        return this.requerimientoDao_3.requerimiento3();
    }
}
