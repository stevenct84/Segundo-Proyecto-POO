package proyecto2.model;

import java.util.ArrayList;

/**
 *
 * @author Junior
 */


public class TrianguloPascal{
    
    ArrayList<ArrayList<Celda>>  filas= new ArrayList<>(); 

    public ArrayList<ArrayList<Celda>> getFilas() {
        return filas;
    }

    public void setFilas(ArrayList<ArrayList<Celda>> filas) {
        this.filas = filas;
    }
    
    public TrianguloPascal(int tamanio){
        for(int i =0;i<tamanio;i++){ 
            int number = 1;
            ArrayList<Celda>  celdas=new ArrayList<>();
            for(int j=0;j<=i;j++) {
                Celda celda=new Celda();
                celda.setNumero(number);
                number = number * (i - j) / (j + 1);
                celdas.add(celda);
                celda.setDiagonal(j);
                } 
            
            filas.add(celdas);

            
        }
        
    }
    
    
    
    public void colorearCeldas(){
        
    }
    
    
    
    
    
}
