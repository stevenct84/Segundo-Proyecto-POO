/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto2.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 *
 * @author Jonathan Camacho
 */
public class TrianguloSumasHorizontales extends TrianguloPascal {
    
    public TrianguloSumasHorizontales(int tamanio) {
        super(tamanio);
    }
    
    public void colorearCeldas(){
        Random rand = new Random();
        //"#FF0000","#800000","#FFFF00","#00FF00","#00FFFF","#0000FF","#FF00FF","#800080","#FFFFFF","#808000"
        ArrayList<String> colores=new ArrayList<String>();
        colores.add("#FF0000");
        colores.add("#008080");
        colores.add("#FFFF00");
        colores.add("#00FF00");
        colores.add("#00FFFF");
        colores.add("#FFBD00");
        colores.add("#FF00FF");
        colores.add("#800080");
        colores.add("#FFFFFF");
        colores.add("#808000");
        for(int i=0; i<filas.size(); i++){
            String color=colores.get(i);
             for(int j=0;j<filas.get(i).size(); j++){
                 filas.get(i).get(j).setColor(color);  
             }
        }
    }

    public ArrayList<Integer> getSuma() {
        ArrayList<Integer> numeros=new ArrayList<Integer>();
        for(int i=0; i<filas.size(); i++){
            int suma=0;
            for(int j=0;j<filas.get(i).size(); j++){
                suma+=filas.get(i).get(j).getNumero();
            }
            numeros.add(suma);
        }
        return numeros;
    }

    
}
