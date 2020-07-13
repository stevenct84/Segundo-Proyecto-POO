/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto2.vista;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import proyecto2.controlador.Controlador;
import proyecto2.model.TrianguloPascal;
/**
 *
 * @author Jonathan Camacho
 */
/**
 * Crear el Canvas para dibujar la Maquina de Galton
 * @author Jonathan Camacho
 */
public class GaltonDiseno extends Canvas{
    int x, y;
    Controlador elControl= new Controlador();
    int filas=0;
    Graphics g;
    
    
    /**
     * Diseño de la ventana
     */
    public GaltonDiseno(int numero) {
        this.setBackground(Color.black);
        this.filas=numero;
    }

    /**
     * Función que se encarga de colocar los dibujos según el triángulo solicitado
     * @param g 
     */
    @Override
    public void paint(Graphics g){
        g.setColor(Color.red);
        int x=490,y=50;
        TrianguloPascal triangulo=elControl.crearTriangulo(filas);
        int iterador=0;
        for(int i=0; i<triangulo.getFilas().size();i++){
            int acumuladox=0;
            for(int j=0; j<triangulo.getFilas().get(i).size(); j++){
                
                if(iterador==0&&triangulo.getFilas().get(i).size()==1){
                    g.fillRect(x, y, 15, 5);
                    continue;
                }
                if(triangulo.getFilas().get(i).size()%2==1&&acumuladox==0){
                    g.fillRect(x, y, 15, 5);
                    acumuladox +=45;
                    continue;
                }
                
                if(iterador%2==0){
                    acumuladox += 45;
                    g.fillRect(x + acumuladox, y, 15, 5);
                }
                if(iterador%2==1){
                    g.fillRect(x-acumuladox,y, 15, 5);
                     acumuladox += 45;
                }
                iterador+=1;
                /*System.out.println("nuevo");
                System.out.println(x);
                System.out.println(y);*/  
            }
            y+=40;
        }
        x=90;
        y=420;
        g.setColor(Color.WHITE);
        for(int i=0; i<10;i++){
            g.fillRect(x, y, 5, 200);
            x += 90;
        }
    }
}
