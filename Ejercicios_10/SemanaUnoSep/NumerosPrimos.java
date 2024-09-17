package Ejercicios_10.SemanaUnoSep;

import javax.swing.JOptionPane;

public class NumerosPrimos {
    public static void main(String[] args) {

        int numero = Integer.parseInt(JOptionPane.showInputDialog("NUMEROS PRIMOS\nIngrese un valor: "));
        int contador=0;
        int i;

        for(i=1; i<=numero; i++){
            JOptionPane.showMessageDialog(null, i);

            if (numero%i == 0) {
                contador++;
            }
        }
        if (contador==2) {
            JOptionPane.showMessageDialog(null, "El numero ingresado " + numero + " es primo");
        } else {
            JOptionPane.showMessageDialog(null,"El numero ingresado " + numero + " no primo");
        }
    }
}