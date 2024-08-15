package Java_Desde_Cero_00.Operadores_y_Estructura_de_Control_Condicionales_01;

import javax.swing.JOptionPane;

public class Operador_Ternario_04 {
    //El operador ternario, tambien conocido como operador condicional, es un operador que evalua expresione booleanas
    public static void main(String[] args) {
        int age = 20;
        String status = (age>=18) ? "Adulto" : "Menor";

        JOptionPane.showMessageDialog(null, "La persona es un: "+status); //esta se utiliza para evaluar 2 valores no muy utilizado pero util 
    }
}
