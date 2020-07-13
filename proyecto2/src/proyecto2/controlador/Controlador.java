/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto2.controlador;

import proyecto2.model.TrianguloDiagonal;
import proyecto2.model.TrianguloFibonacci;
import proyecto2.model.TrianguloSumasHorizontales;
import proyecto2.model.TrianguloParImpar;
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
    
    public TrianguloParImpar crearTrianguloParImpar(int  num){
        TrianguloParImpar triangulo=new TrianguloParImpar(num);
        return triangulo;
    }
    
    public TrianguloSumasHorizontales crearTrianguloSumasHorizontales(int  num){
        TrianguloSumasHorizontales triangulo=new TrianguloSumasHorizontales(num);
        return triangulo;
    }
    
    public TrianguloDiagonal crearTrianguloDiagonal(int num){
        TrianguloDiagonal triangulo=new TrianguloDiagonal(num);
        return triangulo;
    }
    
    public TrianguloFibonacci crearTrianguloFibonacci(int num){
        TrianguloFibonacci triangulo= new TrianguloFibonacci(num);
        return triangulo;
    }
    
}
