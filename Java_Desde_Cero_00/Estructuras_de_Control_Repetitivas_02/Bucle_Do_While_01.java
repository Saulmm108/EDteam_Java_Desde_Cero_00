package Java_Desde_Cero_00.Estructuras_de_Control_Repetitivas_02;

import javax.swing.JOptionPane;

public class Bucle_Do_While_01 {
    public static void main(String[] args) {
        //Validacion de ingreso de numeros

        double numero; // rango de valores aceptables entre 14 y 60

        do {
            numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el primer numero que se encuentre entre 14 y 60"));
            if(numero<14 || numero>60){
                JOptionPane.showMessageDialog(null, "Debes ingresar un valor entre 14 y 60");
            }
        
        } while (numero < 14 || numero > 60);

        JOptionPane.showMessageDialog(null, "El numero ingresado es correcto");
        
    }
}
