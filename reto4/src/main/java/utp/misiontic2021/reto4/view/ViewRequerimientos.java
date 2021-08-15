package utp.misiontic2021.reto4.view;

import java.sql.SQLException;
import java.util.ArrayList;

import utp.misiontic2021.reto4.controller.ControllerRequerimientos;
import utp.misiontic2021.reto4.model.vo.Requerimiento_1;
import utp.misiontic2021.reto4.model.vo.Requerimiento_2;
import utp.misiontic2021.reto4.model.vo.Requerimiento_3;

public class ViewRequerimientos {
    public static final ControllerRequerimientos controlador = new ControllerRequerimientos();
    /*public static final ControllerRequerimientos controlador2 = new ControllerRequerimientos();
    public static final ControllerRequerimientos controlador3 = new ControllerRequerimientos();
    */
    public static void requerimiento1(){
        try {
            //llamar la consulta a través del controlador
            ArrayList<Requerimiento_1> listaRequerimiento1 = controlador.consultaRequerimiento1();
            // recorrer el resultado para generar impresion de los registros o items
            
            for (Requerimiento_1 item: listaRequerimiento1){
                System.out.println(
                    item.getFechaCompra()+ " " +
                    item.getNombreProvedor()+ " " +
                    item.getCodigoCompra()+ " " +
                    item.getPagado()
                );
            };

        } catch (SQLException e) {
            System.err.println("--------------------\nError en la vista requerimiento 1 : " + e);
        };
    };

    public static void requerimiento2(){
        try {
            //llamar la consulta a través del controlador
            ArrayList<Requerimiento_2> listaRequerimiento2 = controlador.consultaRequerimiento2();
            // recorrer el resultado para generar impresion de los registros o items
            for (Requerimiento_2 item: listaRequerimiento2){
                System.out.println(
                    item.getFechaInicio()+ " " +
                    item.getCiudad()+ " " +
                    item.getConstructora()+ " " +
                    item.getNombreLider()+ " " +
                    item.getCodigoTipo()+ " " +
                    item.getEstrato()
                );
            };

        } catch (SQLException e) {
            System.err.println("--------------------\nError en la vista requerimiento 2 : " + e);
        }
    }

    public static void requerimiento3(){
        try {
            //llamar la consulta a través del controlador
            ArrayList<Requerimiento_3> listaRequerimiento3 = controlador.consultaRequerimiento3();
            // recorrer el resultado para generar impresion de los registros o items
            for (Requerimiento_3 item: listaRequerimiento3){
                System.out.println(
                    item.getAbreviatura()
                );
            };

        } catch (SQLException e) {
            System.err.println("--------------------\nError en la vista requerimiento 3 : " + e);
        }
    }

}
