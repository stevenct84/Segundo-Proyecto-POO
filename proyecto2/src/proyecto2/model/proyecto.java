package proyecto2.model;

/**
 *
 * @author Junior
 */
public class proyecto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        TrianguloParImpar triangulo=new TrianguloParImpar(5);

        System.out.println(((TrianguloPascal)triangulo).getFilas());  
        (triangulo).colorearCeldas();
        System.out.println(((TrianguloPascal)triangulo).getFilas());
        
    }
}
    
