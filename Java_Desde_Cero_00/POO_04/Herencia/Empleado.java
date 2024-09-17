package Java_Desde_Cero_00.POO_04.Herencia;

public abstract class Empleado {

    //Atributos
    private String nombre;
    private int empreadoId;

    //Cosntructor
    public Empleado(String nombre, int empreadoId) {
        this.nombre = nombre;
        this.empreadoId = empreadoId;
    }

    //Metodo abstracto
    public abstract double calcularSalario();

    //toString
    @Override
    public String toString() {
        return "Empleado [nombre=" + nombre + ", empreadoId=" + empreadoId + "]";
    }

    
    

}
