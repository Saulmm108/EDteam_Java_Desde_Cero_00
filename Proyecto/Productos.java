package Proyecto;

public abstract class Productos {
    
    //Atributos
    int costo;
    int idProdcto;
    
    //Constructores
    public Productos(int costo, int idProdcto) {
        this.costo = costo;
        this.idProdcto = idProdcto;
    }

    //Getters & Setters
    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    public int getIdProdcto() {
        return idProdcto;
    }

    public void setIdProdcto(int idProdcto) {
        this.idProdcto = idProdcto;
    }

    //Metodos
    public abstract double calcularProducto();

    //ToString
    @Override
    public String toString() {
        return "Productos \ncosto: " + costo + "\nidProdcto: " + idProdcto;
    }
    
    
}
