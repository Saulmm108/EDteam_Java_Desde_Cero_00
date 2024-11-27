package Proyecto;

public class Orden {
    private String id;
    private double total;
    
    public Orden(String id, double total) {
        this.id = id;
        this.total = total;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "Orden [id=" + id + ", total=" + total + "]";
    }
    
}
