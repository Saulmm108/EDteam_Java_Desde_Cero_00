package Ejercicios_10.Genialy;

import javax.swing.JOptionPane;

public class Sumadorapp {
    public static void main(String[] args) {
        int numero;
        int contador = 0;        
        do {
            numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un valor:"));
            contador += numero;
        } while (numero !=0);

        JOptionPane.showMessageDialog(null, "La suma de los numeros ingresados es: " + contador);
    }
}
