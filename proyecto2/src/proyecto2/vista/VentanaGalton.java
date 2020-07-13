/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto2.vista;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Jonathan Camacho
 */
public class VentanaGalton extends JFrame implements ActionListener{
    JComboBox cantidad;
    
    public VentanaGalton(){
        
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setTitle("Maquina de Galton");
        JLabel seleccion=new JLabel();
        seleccion.setText("Filas:");
        seleccion.setForeground(Color.WHITE);
        seleccion.setFont(new Font("Dialog", Font.PLAIN, 14));
        seleccion.setLocation(0, 0);
        String[] numeros=new String[]{"1","2", "3", "4", "5","6","7","8","9","10"};
        cantidad=new JComboBox(numeros);
        //cantidad.setForeground(Color.BLACK);
        //cantidad.setLocation(0,0);
        cantidad.addActionListener(this);
        JPanel panel=new JPanel();
        //panel.setSize(100,100);
        //panel.setLocation(0, 0);
        panel.setBackground(Color.BLACK);
        add(panel);
        panel.add(seleccion);
        panel.add(cantidad);
        setSize(100, 100);
        //add(new GaltonDiseno());
        setLocationRelativeTo(null); //ubicando la ventana en el centro de la pantalla
        setResizable(false);
        
    }
        @Override
    public void actionPerformed(ActionEvent e) {
        JFrame ventana2=new JFrame();
        ventana2.setSize(1010, 600);
        int numero=Integer.parseInt((String) cantidad.getSelectedItem());
        ventana2.add(new GaltonDiseno(numero));
        ventana2.setVisible(true);
        ventana2.setLocationRelativeTo(null); //ubicando la ventana en el centro de la pantalla
        ventana2.setResizable(false);
        ventana2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
   
}
