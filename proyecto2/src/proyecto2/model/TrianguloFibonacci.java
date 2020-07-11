/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto2.model;

import java.util.ArrayList;

/**
 *
 * @author Junior
 */
public class TrianguloFibonacci extends TrianguloPascal {

    public TrianguloFibonacci(int tamanio) {
        super(tamanio);
    }
    

  
public void colorearCeldas(){
    int altura=filas.size();
    int antecesor=0;
    int fila=0;
    int elem=0;
    int color=0;
    while(altura>0){
        ArrayList colores = new ArrayList();
        colores.add("#0000FF");
        colores.add("#7FFF00");
        colores.add("#6495ED");
        colores.add("#FFFF00");
        colores.add("#FF8C00");
        colores.add("#00BFFF");
        colores.add("#FF0000");
        colores.add("#008000");
        colores.add("#FFB6C1");
        colores.add("#FFA07A");
        if (antecesor==0){
            filas.get(antecesor).get(elem).setColor((String) colores.get(color));
            fila++;
            altura--;
            color++;
            antecesor++;  
        }
        else{
            System.out.println(filas.get(antecesor-1).size());
            while (  filas.get(antecesor).size()>elem  ){
                filas.get(antecesor).get(elem).setColor((String) colores.get(color));
                antecesor--;
                elem++;
            }
            fila++;
            altura--;
            antecesor=fila;
            elem=0;
            color++;
            
            }   
        }  
        }
        
        
        
}
    
    



