package proyecto2.model;

/**
 *
 * @author Junior
 */
public class Celda {
    private int numero;
    private int diagonal; 
    private String color;

    public Celda() {
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double isPar(double num) {
        return num%2;
    }


    /*public boolean isSimetria() {
        return simetria;
    }

    public void setSimetria(boolean simetria) {
        this.simetria = simetria;
    }*/

    public int getDiagonal() {
        return diagonal;
    }

    public void setDiagonal(int diagonal) {
        this.diagonal = diagonal;
    }

    @Override
    public String toString() {
        return "Celda{" + "numero=" + numero + ", diagonal=" + diagonal + ", color=" + color + '}';
    }

    
}