package utp.misiontic2021.reto4.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import utp.misiontic2021.reto4.controller.ControllerRequerimientos;
import utp.misiontic2021.reto4.model.vo.Requerimiento_1;
import utp.misiontic2021.reto4.model.vo.Requerimiento_2;
import utp.misiontic2021.reto4.model.vo.Requerimiento_3;

public class CrearTablas extends JPanel {
    private String titles[];
    private String data[][];
    public static final ControllerRequerimientos controlador = new ControllerRequerimientos();
    
    public CrearTablas(){
        
    }

    public CrearTablas(Integer req) {
        setLayout(new BorderLayout());

        if (req == 1 ){generarDatosReq1();
        }else if (req == 2 ){generarDatosReq2();
        }else {generarDatosReq3();
        }

        var tabla = new JTable(data, titles);
        tabla.setShowHorizontalLines(false);
        tabla.setRowSelectionAllowed(true);
        tabla.setColumnSelectionAllowed(true);
        tabla.setSelectionForeground(Color.white);
        tabla.setSelectionBackground(Color.red);
        add(new JScrollPane(tabla), BorderLayout.CENTER);
    }

    public void generarDatosReq1() {
        // TITULOS
        titles = new String[4];
        titles[0] = "Fecha Compra";
        titles[1] = "Nombre Proveedor";
        titles[2] = "Codigo Compra";
        titles[3] = "Pagado";

        // DATOS
        try {
            //llamar la consulta a través del controlador
            ArrayList<Requerimiento_1> listaRequerimiento1 = controlador.consultaRequerimiento1();
            // recorrer el resultado para generar impresion de los registros o items
            Integer registros = listaRequerimiento1.size();
            Integer contador = 0;
            data = new String [registros][4];         
            for (Requerimiento_1 item: listaRequerimiento1){
                data[contador][0] = item.getFechaCompra();
                data[contador][1] = item.getNombreProvedor();
                data[contador][2] = String.valueOf (item.getCodigoCompra());
                data[contador][3] = item.getPagado();
                contador += 1;
            };
        } catch (SQLException e) {
            System.err.println("--------------------\nError en la vista requerimiento 1 : " + e);
        };
    }

    public void generarDatosReq2() {
        // TITULOS
        titles = new String[6];
        titles[0] = "Fecha Inicio";
        titles[1] = "Ciudad";
        titles[2] = "Constructora";
        titles[3] = "Nombre Lider";
        titles[4] = "Codigo Tipo";
        titles[5] = "Estrato";

        // DATOS
        try {
            //llamar la consulta a través del controlador
            ArrayList<Requerimiento_2> listaRequerimiento2 = controlador.consultaRequerimiento2();
            // recorrer el resultado para generar impresion de los registros o items
            Integer registros = listaRequerimiento2.size();
            Integer contador = 0;
            data = new String [registros][6];         
            for (Requerimiento_2 item: listaRequerimiento2){
                data[contador][0] = item.getFechaInicio();
                data[contador][1] = item.getCiudad();
                data[contador][2] = item.getConstructora();
                data[contador][3] = item.getNombreLider();
                data[contador][4] = String.valueOf (item.getCodigoTipo());
                data[contador][5] = String.valueOf (item.getEstrato());
                contador += 1;
            };
        } catch (SQLException e) {
            System.err.println("--------------------\nError en la vista requerimiento 1 : " + e);
        };
    }
    
    public void generarDatosReq3() {
        // TITULOS
        titles = new String[1];
        titles[0] = "Abrev";
        // DATOS
        try {
            //llamar la consulta a través del controlador
            ArrayList<Requerimiento_3> listaRequerimiento3 = controlador.consultaRequerimiento3();
            // recorrer el resultado para generar impresion de los registros o items
            Integer registros = listaRequerimiento3.size();
            Integer contador = 0;
            data = new String [registros][1];         
            for (Requerimiento_3 item: listaRequerimiento3){
                data[contador][0] = item.getAbreviatura();
                contador += 1;
            };
        } catch (SQLException e) {
            System.err.println("--------------------\nError en la vista requerimiento 1 : " + e);
        };
    }

    public void ventanaDatosTabla(Integer req) {     
        JFrame ventana = new JFrame("TABLA DE DATOS");
        ventana.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        ventana.getContentPane().add(new CrearTablas(req), BorderLayout.CENTER);
        ventana.setSize(500, 600);
        ventana.setLocationRelativeTo(null);
        ventana.setVisible(true);
    }
}