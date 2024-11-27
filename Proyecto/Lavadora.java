package Proyecto;

public abstract class Lavadora extends Electrodomestico {

    //Atributos
    private String color;
    private int capacidad;

    //Constructores
    public Lavadora(int costo, int idProdcto, int peso, String color, int capacidad) {
        super(costo, idProdcto, peso);
        this.color = color;
        this.capacidad = capacidad;
    }

    //Getters & Setters
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }


    @Override
    public double calcularProducto() {
        if (peso < 100) {
            costo = 3200 + capacidad*2; 
        } else if (peso >= 100 && peso <= 150) {
            costo = 4750 + capacidad*2; 
        } else if (peso > 150) {
            costo = 5500 + capacidad*2 ; 
        }
        return costo;
    }

    @Override
    public String toString() {
        return "Lavadora" + super.toString() + peso + "\ncolor: " + color + "\ncapacidad: " + capacidad + "\nPresio del producto: " + calcularProducto();
    }

    
    
    

    
}
