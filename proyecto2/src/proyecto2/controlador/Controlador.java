/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto2.controlador;

import proyecto2.model.TrianguloPascal;

/**
 *
 * @author Jonathan Camacho
 */
public class Controlador {

    public Controlador() {
    }
    
    public TrianguloPascal crearTriangulo(int num){
        TrianguloPascal triangulo=new TrianguloPascal(num);
        return triangulo;
    }
    
}
