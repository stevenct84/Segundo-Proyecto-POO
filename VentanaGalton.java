/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto2.vista;

import java.util.List;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Jonathan Camacho
 */
public class VentanaGalton extends JFrame{
    
    public VentanaGalton(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Maquina de Galton");
        setSize(1010, 600);
        add(new GaltonDiseno());
        setLocationRelativeTo(null); //ubicando la ventana en el centro de la pantalla
        setResizable(false);
        setVisible(true);
        
    }
    
    public static void main(String[] args){
        new VentanaGalton();
    }
}
