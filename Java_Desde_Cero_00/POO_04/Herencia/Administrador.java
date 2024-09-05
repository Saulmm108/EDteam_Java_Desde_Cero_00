package Java_Desde_Cero_00.POO_04.Herencia;

public class Administrador extends Empleado{
    //Atributos
    private double bonus;

    //Constructor
    public Administrador(String nombre, int empreadoId, double bonus) {
        super(nombre, empreadoId);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public double CalcularSalario() {
        return 50000 + bonus;
    }

    @Override
    public String toString() {
        return super.toString()+"\nAdministrador\nbonus = " + bonus;
    }
    
    
}
