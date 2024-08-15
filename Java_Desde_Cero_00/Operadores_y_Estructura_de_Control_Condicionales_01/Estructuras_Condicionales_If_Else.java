package Java_Desde_Cero_00.Operadores_y_Estructura_de_Control_Condicionales_01;

import javax.swing.JOptionPane;

public class Estructuras_Condicionales_If_Else {
    public static void main(String[] args) {
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un valor: "));

        if (numero < 0){
            JOptionPane.showMessageDialog(null, "El numero ingresafo es menor a CERO");
        } else {
            JOptionPane.showMessageDialog(null, "El numero ingresa es mayo a CERO");
        }
    }
}
