package Java_Desde_Cero_00.POO_04.Herencia;

import javax.swing.JOptionPane;

public class Menu {
    public static void main(String[] args) {
        Administrador administrador = new Administrador("Jhon", 19923, 500);
        Developer developer = new Developer("Andrew", 19924, 120, 1200);

        JOptionPane.showMessageDialog(null, "Salario Administrador = "+ administrador.CalcularSalario() +"\nSalario Developer = "+ developer.CalcularSalario() + 
        "\n" + administrador + "\n" + developer);

    }
}
