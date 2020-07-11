/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto2.model;

/**
 *
 * @author Junior
 */
public class TrianguloDiagonal extends TrianguloPascal {

    public TrianguloDiagonal(int tamanio) {
        super(tamanio);
    }

    
    
    
    
    public void colorearCeldas(){
        for(int i=0; i<filas.size(); i++){
            for(int j=0;j<filas.get(i).size(); j++){
                if(filas.get(i).get(j).getDiagonal()==0){
                    filas.get(i).get(j).setColor("#0000FF");
                }
                if(filas.get(i).get(j).getDiagonal()==1){
                    filas.get(i).get(j).setColor("#7FFF00");
                }
                if(filas.get(i).get(j).getDiagonal()==2){
                    filas.get(i).get(j).setColor("#6495ED");
                }
                if(filas.get(i).get(j).getDiagonal()==3){
                    filas.get(i).get(j).setColor("#FF8C00");
                }
                if(filas.get(i).get(j).getDiagonal()==4){
                    filas.get(i).get(j).setColor("#00BFFF");
                }
                if(filas.get(i).get(j).getDiagonal()==5){
                    filas.get(i).get(j).setColor("#E6E6FA");
                }
                if(filas.get(i).get(j).getDiagonal()==6){
                    filas.get(i).get(j).setColor("#008000");
                }
                if(filas.get(i).get(j).getDiagonal()==7){
                    filas.get(i).get(j).setColor("#FFB6C1");
                }
                if(filas.get(i).get(j).getDiagonal()==8){
                    filas.get(i).get(j).setColor("#FFA07A");
                }
                if(filas.get(i).get(j).getDiagonal()==9){
                    filas.get(i).get(j).setColor("#FFFF00");
                }
            }
        }
        
    }
    
}
