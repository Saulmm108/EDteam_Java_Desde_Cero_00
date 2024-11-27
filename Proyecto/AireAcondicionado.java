package Proyecto;

public class AireAcondicionado extends Electrodomestico {

    //Atributo
    private int modelo;

    //Constructor
    public AireAcondicionado(int costo, int idProdcto, int peso, int modelo) {
        super(costo, idProdcto, peso);
        this.modelo = modelo;
    }

    //Getters & Stteres
    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    @Override
    public double calcularProducto() {
        costo = modelo + peso*2;
        return costo;
    }

    @Override
    public String toString() {
        return "AireAcondicionado" + super.toString() + "modelo: " + modelo ;
    }

    
    
    

}
