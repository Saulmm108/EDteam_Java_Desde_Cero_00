package Ejercicios_10.Primero;

import javax.swing.JOptionPane;

public class Ejercicio2 {
    public static void main(String[] args) {
        int numero = Integer.parseInt(JOptionPane.showInputDialog("NUMEROS PRIMOS\nIngrese un numero: "));
        int contador = 0;

        for (int i = 1; i<=numero; i++){
            if (numero%i==0){
                contador++;
            }
        }

        if (contador==2) {
            JOptionPane.showMessageDialog(null, "El numero " + numero + " es primo");
        } else {
            JOptionPane.showMessageDialog(null, "El numero " + numero + " no es primo");
        }
    }
}
