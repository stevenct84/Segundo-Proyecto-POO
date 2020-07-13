/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto2.model;
/**
 *
 * @author Usuario
 */
public class TrianguloSimetria extends TrianguloPascal {

    public TrianguloSimetria(int tamanio) {
        super(tamanio);
    }

    public void colorearSimetria() {
        for (int i = 0; i < filas.size(); i++) {
            for (int j = 0; j < filas.get(i).size(); j++) {
                if (j < filas.get(i).size() / 2) {
                    filas.get(i).get(j).setColor("#0000FF");
                } else {
                    if (i % 2 == 0 && j == filas.get(i).size() / 2) {
                        filas.get(i).get(j).setColor("#9932CC");
                    } else {
                        filas.get(i).get(j).setColor("#EF1020");
                    }
                }
            }

        }

    }
}
