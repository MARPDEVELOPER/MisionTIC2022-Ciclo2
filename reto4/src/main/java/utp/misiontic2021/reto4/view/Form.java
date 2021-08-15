package utp.misiontic2021.reto4.view;
import javax.swing.*;

import java.awt.*;

public class Form extends JPanel {

    public Form(){}
    // VENTANA PRINCIPAL
    public void iniciar() { 
    JFrame frame = new JFrame("MARCO ROJAS GRUPO 69 RETO 05"); // Crear marco y asignar nombre
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
    frame.setSize(600, 100); // asigna tamaño a la ventana
    frame.setLayout(new BorderLayout()); // fija tipo de contenedor
    
    //CREAR ELEMENTOS
    JPanel botonesRequerimientos = new JPanel(new FlowLayout()); // Crea panel para botones
    // Crear botones
    JButton button1 = new JButton("Requerimiento 1");
    JButton button2 = new JButton("Requerimiento 2");
    JButton button3 = new JButton("Requerimiento 3");
    // asignar tamaño a botones   
    button1.setPreferredSize(new Dimension(150, 30));
    button2.setPreferredSize(new Dimension(150, 30));
    button3.setPreferredSize(new Dimension(150, 30));
    
    // AGREGAR BOTONES A PANEL BOTONES
    botonesRequerimientos.add(button1);
    botonesRequerimientos.add(button2);
    botonesRequerimientos.add(button3);
    frame.getContentPane().add(botonesRequerimientos, BorderLayout.NORTH);
    
    // AGREGAR ACCIONES A LOS BOTONES
    button1.addActionListener ( new  java.awt.event . ActionListener () {
        public  void  actionPerformed ( java.awt.event . ActionEvent  evt ) {
            tablaReq(1);
        }
    });
    button2.addActionListener ( new  java.awt.event . ActionListener () {
        public  void  actionPerformed ( java.awt.event . ActionEvent  evt ) {
            tablaReq(2);
        }
    });
    button3.addActionListener ( new  java.awt.event . ActionListener () {
        public  void  actionPerformed ( java.awt.event . ActionEvent  evt ) {
            tablaReq(3);
        }
    });

    frame.setVisible(true);
        
}

    public static void tablaReq(Integer req){
        CrearTablas ventanaResultado = new CrearTablas();
        ventanaResultado.ventanaDatosTabla(req);
    }
   }