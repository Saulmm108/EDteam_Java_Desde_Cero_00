package Java_Desde_Cero_00.POO_04.Herencia;

public class Developer extends Empleado {

    //Atributos
    private int horasTrabajadas;
    private double HorarioTarifa;

    //Constructor
    public Developer(String nombre, int empreadoId, int horasTrabajadas, double horarioTarifa) {
        super(nombre, empreadoId);
        this.horasTrabajadas = horasTrabajadas;
        this.HorarioTarifa = horarioTarifa;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public double getHorarioTarifa() {
        return HorarioTarifa;
    }

    public void setHorarioTarifa(double horarioTarifa) {
        HorarioTarifa = horarioTarifa;
    }

    @Override
    public double calcularSalario() {
        return horasTrabajadas*HorarioTarifa;
    }

    @Override
    public String toString() {
        return super.toString() + "\nDeveloper\nhorasTrabajadas = " + horasTrabajadas + ", HorarioTarifa = " + HorarioTarifa;
    }
}
