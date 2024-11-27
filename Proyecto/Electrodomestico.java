package Proyecto;

public abstract class Electrodomestico extends Productos{
    
    //Atributos
    int peso;

    //Constructor
    public Electrodomestico(int costo, int idProdcto, int peso) {
        super(costo, idProdcto);
        this.peso = peso;
    }

    //Getters & Setters
    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Electrodomestico \npeso: " + peso;
    }

    
    
    
}
