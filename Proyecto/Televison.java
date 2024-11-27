package Proyecto;

public class Televison extends Electrodomestico{

    //Atributos
    private int pulgadas;
    private int tipoPantalla;
    private int resolucion;
    private boolean smart;

    //Constructores
    public Televison(int costo, int idProdcto, int peso, int pulgadas, int tipoPantalla, int resolucion,
            boolean smart) {
        super(costo, idProdcto, peso);
        this.pulgadas = pulgadas;
        this.tipoPantalla = tipoPantalla;
        this.resolucion = resolucion;
        this.smart = smart;
    }

    //Getters & Setters
    public int getPulgadas() {
        return pulgadas;
    }

    public void setPulgadas(int pulgadas) {
        this.pulgadas = pulgadas;
    }

    public int getTipoPantalla() {
        return tipoPantalla;
    }

    public void setTipoPantalla(int tipoPantalla) {
        this.tipoPantalla = tipoPantalla;
    }

    public int getResolucion() {
        return resolucion;
    }

    public void setResolucion(int resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isSmart() {
        return smart;
    }

    public void setSmart(boolean smart) {
        this.smart = smart;
    }

    //Metodo
    @Override
    public double calcularProducto() {
        if (pulgadas == 24) {
            costo = 1200;
        } else if (pulgadas == 28) {
            costo = 1700;
        } else if (pulgadas == 32) {
            costo = 3000;
        } else if (pulgadas == 40) {
            costo = 4100;
        } else if (pulgadas == 50) {
            costo = 6000;
        } else if (pulgadas == 55) {
            costo = 7100;
        } else if (pulgadas == 60) {
            costo = 9500;
        } else if (pulgadas == 75) {
            costo = 11500;
        } else if (pulgadas == 85) {
            costo = 14300;
        } else {
            costo = 0; 
        }
    
        if (tipoPantalla == 1) {
            costo += 300;
        } else if (tipoPantalla == 2) {
            costo += 450;
        } else if (tipoPantalla == 3) {
            costo += 600;
        } else if (tipoPantalla == 4) {
            costo += 850;
        } else {
            costo += 0; 
        }
    
        if (resolucion == 1) {
            costo += 500;
        } else if (resolucion == 2) {
            costo += 800;
        } 
    
        if (smart) {
            costo += 700;
        }
    
        return costo;
    }

    @Override
    public String toString() {
        return "Televison" + super.toString() + "\npulgadas: " + pulgadas + "\n tipoPantalla: " + tipoPantalla + "\n resolucion: " + resolucion
                + "\nsmart:" + smart ;
    }
    
    

    


}
