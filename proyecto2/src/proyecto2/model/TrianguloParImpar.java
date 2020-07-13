/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto2.model;

import java.util.ArrayList;

/**
 *
 * @author Jonathan Camacho
 */
public class TrianguloParImpar extends TrianguloPascal {

    public TrianguloParImpar(int tamanio) {
        super(tamanio);
    }

    
    public void colorearCeldas(){
        for(int i=0; i<filas.size(); i++){
            for(int j=0;j<filas.get(i).size(); j++){
                if(filas.get(i).get(j).getNumero()%2==0){
                    filas.get(i).get(j).setColor("#FF0000");
                }else{
                    filas.get(i).get(j).setColor("#008080");
                }
            }
        }
        
    }
    
}
/*
for(ArrayList<Celda> fila:this.filas){
            for(Celda celda:fila){
*/